package code401Challenges.hashtable;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;


public class HashtableTest {
    Hashtable testHashtable;
    @Before
    public void setUp() {
        testHashtable = new Hashtable();
        testHashtable.add("key1", "value1");
        testHashtable.add("bananas", "kiwis");
    }


    @Test
    public void add() {
        assertTrue("Expected true",
                testHashtable.add("key3", "value 3")
        );
    }

    @Test
    public void get() {
//        assertEquals("first key should have value of value1",
//                "value1",
//                testHashtable.get("key1")
//        );
    }

    // Check that contains method can check if a key exists already:
    @Test
    public void contains() {
        Entry testEntry = new Entry("hello", "there");
        String testStringKey = "hello";
        assertTrue("Expected true",
                testEntry.key.contains(testStringKey));
    }

    // Check that contains method returns false when key does not yet exist in the table
    @Test
    public void contains2() {
        Entry testEntry = new Entry("apples", "granny smith");
        String testStringKey = "hello";
        assertFalse("Expected false",
                testEntry.key.contains(testStringKey));
    }

    // Check that hash converts a string to a usable hash
    @Test
    public void testHash() {
        Hashtable testHashtable = new Hashtable();
        String toHash = "Elephant";
        assertEquals("Expected a number",
                77,
                testHashtable.hash(toHash)
                );
    }

    //Adding a key/value to your hashtable results in the value being in the data structure
    //Retrieving based on a key returns the value stored
    //Successfully returns null for a key that does not exist in the hashtable
    //Successfully handle a collision within the hashtable
    //Successfully retrieve a value from a bucket within the hashtable that has a collision
    //Successfully hash a key to an in-range value
}