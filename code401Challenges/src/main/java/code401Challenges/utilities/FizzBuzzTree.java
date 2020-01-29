package code401Challenges.utilities;

import code401Challenges.tree.Node;
import code401Challenges.tree.Tree;

// Establish a node that takes in an integer
// Create a method that traverses through a tree
//make a method that supplies the Strings Bizz or Fuzz or BizzFuzz depending on the value of the integer
// Change the node value to be the respective string depending on the node value

public class FizzBuzzTree {
    Node <String> root;

    // === Check a tree for FizzBuzz ====
    public FizzBuzzTree(Node <String> root) {
        this.root = root;
    }

    public void fizzbuzzRecursionWrapper() {

        fizzbuzzRecursionThatCallsGetFizzBuzz(root);
    }

    // traverses through the tree
    private void fizzbuzzRecursionThatCallsGetFizzBuzz(Node <String> curr) {
        if(curr != null) {
            fizzbuzzRecursionThatCallsGetFizzBuzz(curr.left);
            curr.value = getFizzBuzz(curr.value); // getFizzbuzz("7")
            fizzbuzzRecursionThatCallsGetFizzBuzz(curr.right);
        }
    }

    // Get the fizz, the buzz or the fizzbuz
    private String getFizzBuzz(String input) {
        int value = Integer.parseInt(input); // changes value into a string of an int
        // check if node value is 3 or 5
        if(value % 3 == 0 && value % 5 == 0) {
            return "FizzBuzz";
        } else if (value % 3 == 0) {
            return "Fizz";
        } else if (value % 5 == 0) {
            return "Buzz";
        } else {
            return input;
        }
    }

    // === Make a new tree and replace values with Fizz, Buzz, etc ===
    // The following code is courtesy of Michelle Ferreirae
    // make a new node
    // - value: fizz/ buzz/ fizzbuzz
    // - left: recurse
    // - right: recurse

    public static Tree<String> fizzBuzz(Tree<Integer> input) {
        Tree<String> answer = new Tree<>();
        answer.root = fizzBuzzHelper(input.root);
        return answer;
    }

    private static Node<String> fizzBuzzHelper(Node<Integer> node) {
        if(node == null) {
            return null;
        } else {
            Node<String> answer = new Node<>();
            if (node.value % 15 == 0) {
                answer.value = "fizzbuzz";
            } else if (node.value % 5 == 0) {
                answer.value = "buzz";
            } else if (node.value % 3 == 0) {
                answer.value = "fizz";
            } else {
                answer.value = node.value.toString();
            }
            // We recurse on the left (circle the left side of the tree) and
            // we recurse on the right side of the tree (circle the right side of the tree).
            answer.left = fizzBuzzHelper(node.left);
            answer.right = fizzBuzzHelper(node.right);
            return answer;
        }
    }
}
