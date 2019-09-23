package code401Challenges.linkedlist;

// Node exists as a class so we can make neat instances of it in LinkedList
// We declare the Node class. Note that this is a public class. There is only one public class allowed in each file.
// Public class means it is available to outside.
// Otherwise, you'd say, class Node and remove the public, to keep this class with the LinkedList class (which has its pros/cons.

public class Node {
    int value;
    Node next;

    // Note - Could set a constructor. You set the value in the constructor. Call the below-defined overloaded constructr,
    // and pass it the value and null as the next. Lets you simplify code even more, because you can change instantiation of
    // each linked list as:
    // this.head = new Node(value, this.head);
    // When public LinkedList class created, a default constructor is automatically created, which looks like:
    // public LinkedList() {}. Once you create a constructor, the compiler replaces that default constructor with your cooler one.

    /*
    // this constructor calls the second constructor
    Node(int value) {
        this(value, null);
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = null;
    }
     */
}
