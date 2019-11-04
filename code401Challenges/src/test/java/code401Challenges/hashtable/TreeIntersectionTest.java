package code401Challenges.hashtable;

import code401Challenges.tree.Node;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashSet;

public class TreeIntersectionTest {

    @Test
    public void treeIntersectionTest1 () {
        //              10
        //             /  \
        //            5    15
        //           / \   / \
        //          2  7  12  17


        Node root1 = new Node(10,
                new Node(5, new Node(2), new Node(7)),
                new Node(15, new Node(12), new Node(17)));

        //            5
        //           / \
        //          0  2

        Node root2 = new Node(5,
                new Node(0), new Node(2));

        HashSet<Integer> expected = new HashSet<>();
        expected.add(2);
        expected.add(5);

        System.out.println(TreeIntersection.treeIntersection(root1, root2));


//        assertArrayEquals("2 and 5 are in both trees",
////                expected.toArray(),
////                TreeIntersection.treeIntersection(root1, root2));
////        );
    }

        @Test
        public void treeIntersectionTest2 (){
            //              10
            //             /  \
            //            5    15
            //           / \   / \
            //          2  7  12  17


            Node root1 = new Node(10,
                    new Node(5, new Node(2), new Node(7)),
                    new Node(15, new Node(12), new Node(17)));

            //            9
            //           / \
            //          0  6

            Node root2 = new Node(9,
                    new Node(0), new Node(6));

            HashSet<Integer> expected = new HashSet<>();
            // expected should be empty;

            System.out.println(TreeIntersection.treeIntersection(root1, root2));


//        assertArrayEquals("nothing match both trees",
////                expected.toArray(),
////                TreeIntersection.treeIntersection(root1, root2));
////        );

    }

    @Test
    public void treeIntersectionTest3 () {
        //              10
        //             /  \
        //            5    15
        //           / \   / \
        //          2  7  12  17


        Node root1 = new Node(10,
                new Node(5, new Node(2), new Node(7)),
                new Node(15, new Node(12), new Node(17)));

        //            5
        //           / \
        //          0  2
        //         /\
        //       12 17

        Node root2 = new Node(5,
                new Node(0, new Node(12), new Node(17)),
                new Node(2));

        HashSet<Integer> expected = new HashSet<>();
        expected.add(2);
        expected.add(5);
        expected.add(12);
        expected.add(17);
        expected.toArray();

        System.out.println(TreeIntersection.treeIntersection(root1, root2));


//        assertArrayEquals("2 and 5 are in both trees",
//                expected,
//                TreeIntersection.treeIntersection(root1, root2));

    }
}
