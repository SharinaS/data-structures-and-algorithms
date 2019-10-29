package code401Challenges.hashtable;

import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

// NOTES:
//.hashCode() is a method on the object class. Good to avoid this in our case, but generally good to use for a given
// object. Note that the hashcode function for strings is not that great.
// If you have the same string literal declared two different times, the compiler will optimize that and actually
// this declaration will be the same literal string.
// A good hash function hashes to various indices, versus incrementing one by one, which the .hashCode will tend towards.

// Collisions are where two different keys hash to the same value, or to the same bucket. Same key: What to do if adding
// a key value pair where the key is already in the table. If the key is already there, thow exception or return false.

public class Hashtable {
    LinkedList<Entry>[] hashTableArray = new LinkedList[100]; // Array of linked lists

    // add: takes in both the key and value. This method should hash the key, and add the key and value pair
    // to the table, handling collisions as needed.
    public boolean add (String key, String value) throws UnsupportedEncodingException {
        // takes a key and turns it into a hashed thing
        int arrIndex = hash(key);
        Entry entry = new Entry(key, value);

        if (hashTableArray[arrIndex] == null) {
            hashTableArray[arrIndex] = new LinkedList<>();
        }

        if(contains(key)) {
            return false;  // the key is already in use, so don't use it.
        } else {
            hashTableArray[arrIndex].add(entry); // add the key and value pair to the linked list.
        }
        return true;
    }


    // get: takes in the key and returns the value from the table.
    public String get (String key) throws UnsupportedEncodingException {
        // String gets hashed to become hashed key, which is the index to find the linked list
        int arrIndex = hash(key);

        if (hashTableArray[arrIndex] == null) {
            hashTableArray[arrIndex] = new LinkedList<>();
        }
        for (int i = 0; i < hashTableArray[arrIndex].size(); i++) {
            // if at i the key in the hashtable is the same as the key that is supplied, return the value
            if (hashTableArray[arrIndex].get(i).key.equals(key)){
                return hashTableArray[arrIndex].get(i).value;
            }
        }
        return null;
    }

    // contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
    public boolean contains (String key) throws UnsupportedEncodingException {
        int arrIndex = hash(key);
        for (int i = 0; i < hashTableArray[arrIndex].size(); i++) {
            if (hashTableArray[arrIndex].get(i).key.equals(key)){
                return true; // returns true when a key already exists
            }
        }
       return false; // returns false when a key does not yet exist
    }

    // hash: takes in an arbitrary key and returns an index in the collection.
    // https://stackoverflow.com/questions/16458564/convert-character-to-ascii-numeric-value-in-java#targetText=Just%20cast%20your%20char%20as,%2F%2F%20ascii%20is%20now%2097.
    public int hash (String key) throws UnsupportedEncodingException {
            int len = key.length();
            int addedAscii = 0;
            for (var i = 0; i < len; i ++) {
                char character = key.charAt(i);
                int ascii = (int) character;
                addedAscii += ascii;
            }
            return addedAscii * 599 % hashTableArray.length;

    }

}
