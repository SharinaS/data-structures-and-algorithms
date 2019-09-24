package code401Challenges.linkedlist;

// Resource: Linked List Implementation: https://www.youtube.com/watch?v=SMIq13-FZSE

import java.util.StringJoiner;

public class LinkedList {
    Node head;

    // === Insert a new node into the front of the list ===
    public void insertAtHead(int value){

        // create new object
        Node node = new Node();
        node.value = value;

        // if this list's head is null, set the head to be the new node
        if(head == null) {
            head = node;
        } else {
            // otherwise, set the head to be the new node, and set the new node's next to be the old head.
            node.next = head;
            head = node;
        }

        // Note: shorter and sexier alternative to adding a node:
        //public void insertHeadReview(Review data) {this.head = new Node(data, this.head);}
    }

    // === insert a value a the end of the linked list ===
    public void insertAtEnd(int value) {
        Node newNode = new Node();
        newNode.value = value;
        Node curr = head;

        if(head == null){
            head = newNode;
        } else {
            curr = head;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // === Insert a value before a given node value ===  <-------------
    public void insertBefore (int value, int newNodeValue) {
        Node newNode = new Node();
        Node curr = head;
        newNode.value = newNodeValue;

        if(head.value == value){
            newNode.next = head;
            head = newNode;
        }
        while(curr.next != null && curr.next.value != value) {
                curr = curr.next;
        }
        if (curr.next != null) {
            Node leader = curr.next;
            curr.next = newNode;
            newNode.next = leader;
            return;
        }
    }

    // === Insert a value after a given node value ===  <---------------
    public void insertAfter (int value, int value2) {
        Node curr = head;
        Node newNode = new Node();
        newNode.value = value2;

        while(curr != null && curr.value != value) {
            curr = curr.next;
        }
        if( curr != null) {
            newNode.next = curr.next;
            curr.next = newNode;
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

