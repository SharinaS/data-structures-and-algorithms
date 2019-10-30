package code401Challenges.hashtable;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;



public class RepeatedWord {

    public String repeatedWord (String stringToRead) throws UnsupportedEncodingException {
        Scanner readString = new Scanner(stringToRead);
        Hashtable hashtable = new Hashtable();

        // splitting on spaces between words, as you get each individual word, remove or replace punctuation with empty string.
        while (readString.hasNext()){
            String word = readString.next().toLowerCase();
            // remove punctuation
            if (hashtable.contains(word)){
                return word;
            } else {
                hashtable.add(word, null);
            }
        }
        return null;
    }
}


// alternative way of doing it: for each word search through previous words. Repeat. O(n^2) time though.
// Note that scanner doesn't deal with punctuation well. Scanner more efficient, because .split actually takes up the entire length of the book.