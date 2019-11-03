package code401Challenges.hashtable;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LeftJoinTest {
    Hashtable hashtable1;
    Hashtable hashtable2;

    @Before
    public void setUp () {

        hashtable1 = new Hashtable();
        hashtable1.add("earth", "terra");
        hashtable1.add("happy", "joyful");
        hashtable1.add("active", "energetic");

        hashtable2 = new Hashtable();
        hashtable2.add("earth", "sky");
        hashtable2.add("happy", "sad");
        hashtable2.add("active", "lazy");
    }


    @Test
    public void leftJoinTwoHashmaps() {

        String[] one = {"earth", "terra", "sky"};
        String[] two = {"happy", "joyful", "sad"};
        String[] three = {"active", "energetic", "lazy"};
        ArrayList<String[]> expected = new ArrayList<>();
        expected.add(one);
        expected.add(two);
        expected.add(three);

        //System.out.println(leftJoinTwoHashmaps(hashtable1, hashtable2));
        assertArrayEquals(expected, leftJoinTwoHashmaps(hashtable1, hashtable2));
    }


}