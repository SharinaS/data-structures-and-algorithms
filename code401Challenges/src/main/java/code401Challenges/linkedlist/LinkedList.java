package code401Challenges.linkedlist;

// Resource: Linked List Implementation: https://www.youtube.com/watch?v=SMIq13-FZSE

import java.util.StringJoiner;

public class LinkedList {
    Node head;

    // === Insert a new node into the front of the lit ===
    public void insertAtHead(int value){
        // create new object
        Node node = new Node();
        node.value = value;

        // if there's no other nodes:
        if(head == null) {
            head = node;
        } else {
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
