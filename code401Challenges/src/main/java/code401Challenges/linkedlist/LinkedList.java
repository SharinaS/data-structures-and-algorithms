package code401Challenges.linkedlist;

// Resource: Linked List Implementation: https://www.youtube.com/watch?v=SMIq13-FZSE

import org.w3c.dom.ls.LSOutput;

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

        // Note: shorter and sexier alternative to adding a node (need a constructor for this, specifically:
        //public void insertHeadReview(Review data) {this.head = new Node(data, this.head);}
    }

    // === insert a value a the end of the linked list ===
    public void insertAtEnd(int value) {
        Node newNode = new Node();
        newNode.value = value;
        Node curr;

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

    // === Insert a value after a given node value ===
    public void insertAfter (int value, int value2) {
        Node curr = head;
        Node newNode = new Node();
        newNode.value = value2;

        while(curr != null && curr.value != value) {
            curr = curr.next;
        }
        if(curr != null) {
            newNode.next = curr.next;
            curr.next = newNode;
        }

    }

    // === Turn the linked list into a string and return it ===
    // can alternatively use a StringBuilder, with the word, append, to build up the string.
    // stringBuilder.append("{").append(current.value).append("} -> ");

    @Override
    public String toString(){
        Node curr = head;

        StringJoiner stringy = new StringJoiner(", ");

        while (curr != null){
            //System.out.println(curr.value);
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

    //=== Find a value in the list that is k nodes from the end ===
    public int runningBackwards(int k) {
        Node curr = head;
        int listLength = 0;

        while (curr != null) {
            listLength += 1;
            curr = curr.next;
        }
        int stepsToTake = listLength - k;
        if(stepsToTake < 0 || stepsToTake > listLength)
            throw new IllegalArgumentException("k is too big, given the length of the list");

        curr = head;
        int counter = 0;

        while (curr != null && counter != stepsToTake) {
            counter += 1;
            curr = curr.next;
        }
        return curr.value;
    }

    /* Alternative to the above:
    Create a leader and a follower. If I need to find the second from the end,
    and the array is two from the end, put those two variables k vodes apart. Then, move each variables step by step down
    the linked list. When the leader hits the end, the follower will be the node you're looking for.  Time complexity is O(n)
    and space complexity is O(1).
    Node front = list.head;
    Node back = list.head;
    int counter = 0
    While (front !=null):
    front = front.next
    counter ++
    if(counter > k) back = back.next.
    */

    // Finds alternating nodes of two linked lists and joins them into one list
    public static LinkedList mergeAlternatingNodes(LinkedList a, LinkedList b) {
        Node bCurr = b.head;
        Node aCurr = a.head;
        Node bNext;
        Node aNext;

        //While there are positions left in b
        while(aCurr != null && bCurr != null) {
            bNext = bCurr.next;
            aNext = aCurr.next;

            aCurr.next = bNext;
            bCurr.next = aCurr;

            bCurr = bNext;
            aCurr = aNext;
        }

        b.head = bCurr;
        return b;
    }

    // Merge two linked lists
    // Received help with logic from Michelle Ferreirae
    public static LinkedList mergeLinkedLists(LinkedList a, LinkedList b) {
        if (a.head == null) {
            return b;
        }

        Node bCurr = b.head;
        Node aCurr = a.head;

        //While there are positions left in b
        while(aCurr != null && bCurr != null) {
            Node temp1 = aCurr.next;
            Node temp2 = bCurr.next;

            if (aCurr.next != null) {
                bCurr.next = aCurr.next;
            }

            aCurr.next = bCurr;
            aCurr = temp1;
            bCurr = temp2;
        }
        return a;
    }

    // Reverse a linked list
    // https://www.geeksforgeeks.org/reverse-a-linked-list/

}

