package code401Challenges.linkedlist;

// Resource: Linked List Implementation: https://www.youtube.com/watch?v=SMIq13-FZSE

import java.util.StringJoiner;

public class LinkedList {
    Node head;

    // === Insert a new node into the front of the lit ===
    public void insertAtHead(int value){
        /*
        // Alternate way of writing the active code:
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
        */

        // create new object
        Node node = new Node();
        node.value = value;

        // if this list's head is null, set the head to be the new node
        if(head == null) {
            head = node;
        } else {
            // otherwise, set the head to be the new node, and set the new node's next to be the old head.
            Node temp = head;
            head = node;
            head.next = temp;
        }
    }

    // === Turn the linked list into a string and return it ===
    @Override
    public String toString(){
        Node curr = head;
        StringJoiner stringy = new StringJoiner(", ");
        while (curr != null){
            System.out.println(curr.value);
            Integer currentValue = curr.value;
            stringy.add(currentValue.toString());
            curr = curr.next;
        }
        //System.out.println(curr.value);
        return stringy.toString();
    }

    // === Check for a value in the Linked List ===
    public Boolean includes(int value) {
        Node curr = head;
        while (curr != null) {
            if (curr.value == value) {
                return true;
            } else {
                curr = curr.next;

            }
        }
        return false;
    }
}

/*
GENERICS:
Making a class into a generic class that can take different types is not hard. Add inot its definition that it can
take different types of data. Use angle brackets. Refer to a parameter of whatever type this linked list is of.
Type parameter T, once specified can now be used anywhere you want to indicate what the correct type is. Use T for text or
E for element. Replace the ints as indicated with T, or E.

public class LinkedList<T> {
    Node<T> head;

    public void insertTail(T value) {
        Node<T> newNode = new Node<>(value); // Java will figure out what needs to be in the empty diamond
        newNode.next = null;
    }

}

Class Node<E> {
    E value;
    Node<E> next;

    Node(E value){

    }
}


// testing must also change
public class LinkedListTest {
    LinkedList<Integer> list;

    @Test
    public void testHead() {
        assertEquals(
            "Head should be 1",
            1,
            list.head.value.intValue()) <--- takes an integer and turn it into an int.
        );
    }

When using objects instead of primitives, use .equal, not ==
 */
