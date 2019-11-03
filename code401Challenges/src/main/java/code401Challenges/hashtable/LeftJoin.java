package code401Challenges.hashtable;

import java.util.ArrayList;
import java.util.LinkedList;

public class LeftJoin {

    public static ArrayList<String[]> leftJoinTwoHashmaps(Hashtable hashtable1, Hashtable hashtable2) {
        ArrayList<String[]> answer = new ArrayList<>();
        //String[] theThree = new String[3];
        // for index in the hashtable's aray:
        for (LinkedList<Entry> index : hashtable1.hashTableArray) {
            if (index != null) {
                // for node in the the array's index:
                for (Entry node : index) {  // at level of a single key and value in the hashtable
                    // add key and value of hashtable1; and if hashtable2 has a key, add its value too otherwise
                    // add null for its value.
                    answer.add(new String[]{node.key, node.value, hashtable2.contains(node.key) ?
                            hashtable2.get(node.key) : null});
                }
            }
        }
        return answer;
    }

}
