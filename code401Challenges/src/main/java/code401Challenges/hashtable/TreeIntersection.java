package code401Challenges.hashtable;


import code401Challenges.tree.Node;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TreeIntersection {
    // starting code from Michelle Ferreirae's code review on Oct 30, 2019 Code401-Java-d6
    // Algorithm: Add all values from first tree into a hashmap, and then check to see if any of the
    // values in the second tree are in the hashmap. If so, add those values to a hashset and return
    // the hashset, since it will contain only those node values that both trees share.

    public static Set<Integer> treeIntersection(Node root1, Node root2) {
        HashSet<Integer> answer = new HashSet<>();
        //Hashtable valuesFromRoot1 = new Hashtable();
        HashMap<Integer, Boolean> valuesFromRoot1 = new HashMap<>();
        LinkedList<Node> nodesToProcess = new LinkedList<>();

        nodesToProcess.add(root1);
        while(!nodesToProcess.isEmpty()) {
            // set current to the first element removed from nodesToProcess:
            Node current = nodesToProcess.removeFirst();
            valuesFromRoot1.put((Integer) current.value, null);

            // if there are any children to the node, add them to the list of nodes to process
            // uses breadth-first traversal (adding to end of linked list, and removing from start
            // of linkedlist, so it's acting like a queue.
            if (current.left != null) {
                nodesToProcess.add(current.left);
            }
            if (current.right != null) {
                nodesToProcess.add(current.right);
            }
        }
        // deal with tree2
        nodesToProcess.add(root2);

        while(!nodesToProcess.isEmpty()) {
            Node current = nodesToProcess.removeFirst();
            if(valuesFromRoot1.containsKey(current.value)) {
                answer.add((Integer) current.value);
            }
            // traverse through tree2 (breadth-first)
            if (current.left != null) {
                nodesToProcess.add(current.left);
            }
            if (current.right != null) {
                nodesToProcess.add(current.right);
            }
        }
        return answer;
    }
}
