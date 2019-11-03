package code401Challenges.hashtable;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LeftJoinTest {
    Hashtable hashtable1;
    Hashtable hashtable2;


    @Test
    public void leftJoinTwoHashmaps1() {

        hashtable1 = new Hashtable();
        hashtable1.add("earth", "terra");
        hashtable1.add("happy", "joyful");
        hashtable1.add("active", "energetic");

        hashtable2 = new Hashtable();
        hashtable2.add("earth", "sky");
        hashtable2.add("happy", "sad");
        hashtable2.add("active", "lazy");

        // setup for answer ArrayList:
        String[] one = {"earth", "terra", "sky"};
        String[] two = {"happy", "joyful", "sad"};
        String[] three = {"active", "energetic", "lazy"};
        ArrayList<String[]> expected = new ArrayList<>();
        expected.add(one);
        expected.add(two);
        expected.add(three);

        System.out.println(LeftJoin.leftJoinTwoHashmaps(hashtable1, hashtable2));
        ArrayList<String[]> ans = LeftJoin.leftJoinTwoHashmaps(hashtable1, hashtable2);
        for(String[] arr : ans) {
            System.out.println(Arrays.toString(arr));
        }

//        assertArrayEquals("expected something cool",
//                expected,
//                LeftJoin.leftJoinTwoHashmaps(hashtable1, hashtable2));
    }

    // checks scenario where right hashmap is shorter
    @Test
    public void leftJoinTwoHashmaps2() {

        hashtable1 = new Hashtable();
        hashtable1.add("earth", "terra");
        hashtable1.add("happy", "joyful");
        hashtable1.add("active", "energetic");

        hashtable2 = new Hashtable();
        hashtable2.add("earth", "sky");
        hashtable2.add("happy", "sad");


        // setup for answer ArrayList
        String[] one = {"earth", "terra", "sky"};
        String[] two = {"happy", "joyful", "sad"};
        String[] three = {"active", "energetic", "lazy"};
        ArrayList<String[]> expected = new ArrayList<>();
        expected.add(one);
        expected.add(two);
        expected.add(three);

        System.out.println(LeftJoin.leftJoinTwoHashmaps(hashtable1, hashtable2));
        ArrayList<String[]> ans = LeftJoin.leftJoinTwoHashmaps(hashtable1, hashtable2);
        for(String[] arr : ans) {
            System.out.println(Arrays.toString(arr));
        }

//        assertArrayEquals("expected something cool",
//                expected,
//                LeftJoin.leftJoinTwoHashmaps(hashtable1, hashtable2));
    }

    // checks scenario where right hashmap is shorter
    @Test
    public void leftJoinTwoHashmaps3() {

        hashtable1 = new Hashtable();
        hashtable1.add("earth", "terra");
        hashtable1.add("active", "energetic");

        hashtable2 = new Hashtable();
        hashtable2.add("earth", "sky");
        hashtable2.add("happy", "sad");
        hashtable2.add("active", "lazy");


        // setup for answer ArrayList
        String[] one = {"earth", "terra", "sky"};
        String[] two = {"happy", "joyful", "sad"};
        String[] three = {"active", "energetic", "lazy"};
        ArrayList<String[]> expected = new ArrayList<>();
        expected.add(one);
        expected.add(two);
        expected.add(three);

        System.out.println(LeftJoin.leftJoinTwoHashmaps(hashtable1, hashtable2));
        ArrayList<String[]> ans = LeftJoin.leftJoinTwoHashmaps(hashtable1, hashtable2);
        for(String[] arr : ans) {
            System.out.println(Arrays.toString(arr));
        }

//        assertArrayEquals("expected something cool",
//                expected,
//                LeftJoin.leftJoinTwoHashmaps(hashtable1, hashtable2));
    }

}