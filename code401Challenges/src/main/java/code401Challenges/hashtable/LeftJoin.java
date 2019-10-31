package code401Challenges.hashtable;

import java.util.ArrayList;

public class LeftJoin {

    public ArrayList<String[]> leftJoinTwoHashmaps(Hashtable hashtable1, Hashtable hashtable2) {
        ArrayList<String[]> leftJoinArr = new ArrayList<>();
        ArrayList<String> keys = new ArrayList<>();

        // iterate through hashtable1 and put its key in the arrayList
        // <------------------------------------------------------ come back to this

        // iterate through keys in keys ArrayList, ie ["fond", "wrath", "diligent"]
        for (int i = 0; i < keys.size(); i++) {
            // create empty array of size 3 <----------- does this re-empty the array each iteration?
            String[] tempArr = new String[3];

            if(hashtable1.contains(keys.get(i))) { // <------- check that these gets are grabbing correct thing
                // add the key to the tempArr to index 0
                tempArr[i] = keys.get(i);
                // add the value to the tempArr to index 1
                tempArr[i+1] = hashtable1.get(keys.get(i));
                // add the value in hashmap2 to index 3 if value exists in hashtable2

                if(hashtable2.contains(keys.get(i))){
                    tempArr[i+2] = hashtable2.get(keys.get(i));
                } else {
                    tempArr[i+2] = null;
                }
                leftJoinArr.add(tempArr);
            }
        }
        return leftJoinArr;
    }
}
