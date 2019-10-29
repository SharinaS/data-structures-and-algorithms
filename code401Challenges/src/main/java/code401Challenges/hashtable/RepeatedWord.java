package code401Challenges.hashtable;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class RepeatedWord {

    public String repeatedWord (String stringToRead) throws UnsupportedEncodingException {
        Scanner readString = new Scanner(stringToRead);
        Hashtable hashtable = new Hashtable();

        while (readString.hasNext()){
            String word = readString.next().toLowerCase();
            if (hashtable.contains(word)){   // <------------- do I need to instantiate a linked list in contains method?
                return word;
            } else {
                hashtable.add(word, null);
            }
        }
;   return null;
    }
}
