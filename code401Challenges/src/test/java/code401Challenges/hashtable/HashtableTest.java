package code401Challenges.hashtable;

import org.junit.Before;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;


public class HashtableTest {
    Hashtable testHashtable;

    @Before
    public void setUp() {
        testHashtable = new Hashtable();
        testHashtable.add("key1", "value1");
        testHashtable.add("bananas", "kiwis");
    }

    // Tests that the add method enters a key and value
    @Test
    public void add() {
        assertTrue("Expected true",
                testHashtable.add("key3", "value 3")
        );
    }

    // Tests that collision produces a false from add method
    @Test
    public void add2() {
        assertFalse("Expected false",
                testHashtable.add("bananas", "kiwi")
        );
    }

    // Test shows that when you input a key, it gets expected value back
    @Test
    public void get() {
        assertEquals("first key should have value of value1",
                "value1",
                testHashtable.get("key1")
        );
    }

    // Check that contains method can check if a key exists already:
    @Test
    public void contains() {
        Entry testEntry = new Entry("hello", "there");
        String testStringKey = "hello";
        assertTrue("Expected true",
                testEntry.key.contains(testStringKey));
    }

    // Check that contains method returns false when key does not yet exist in the hashtable
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
            assertEquals("Expected index of 83",
                    83,
                    testHashtable.hash(toHash)
            );
    }

    @Test
    public void testHash2() {
        Hashtable testHashtable = new Hashtable();
        String toHash = "cat";
        assertEquals("Expected index of 88",
                88,
                testHashtable.hash(toHash)
        );
    }

    @Test
    public void testHash3() {
        Hashtable testHashtable = new Hashtable();
        String toHash = "abracadabra";
        assertEquals("Expected index of 92",
                92,
                testHashtable.hash(toHash)
        );
    }
}