package code401Challenges.utilities;

import code401Challenges.tree.Node;

// Establish a node that takes in an integer
// Create a method that traverses through a tree
//make a method that supplies the Strings Bizz or Fuzz or BizzFuzz depending on the value of the integer
// Change the node value to be the respective string depending on the node value

public class FizzBuzzTree {
    Node <String> root;

    public FizzBuzzTree () {
        root = null;
    }

    public FizzBuzzTree(Node <String> root) {
        this.root = root;
    }


    public void fizzbuzzRecursion() {
        fizzbuzzRecursionHelper(root);
    }

    // traverses through the tree
    private void fizzbuzzRecursionHelper(Node <String> curr) {
        if(curr != null) {
            fizzbuzzRecursionHelper(curr.left);
            curr.value = getFizzbuzz(curr.value); // getFizzbuzz("7")
            fizzbuzzRecursionHelper(curr.right);
        }
    }

    // Get the fizz, the buzz or the fizzbuz
    private String getFizzbuzz(String input) {
        int value = Integer.parseInt(input); // changes value into a string of an int
        // check if node value is 3 or 5
        if(value % 3 == 0 && value % 5 == 0) {
            return "BizzFuzz";
        } else if (value % 3 == 0) {
            return "Fizz";
        } else if (value % 5 == 0) {
            return "Buzz";
        } else {
            return input;
        }
    }

}
