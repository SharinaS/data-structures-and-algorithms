package code401Challenges.utilities;

import java.util.Stack;

// some help with the final logic from a leetcode discussion at
// https://leetcode.com/problems/valid-parentheses/discuss/9248/My-easy-to-understand-Java-Solution-with-one-stack
//Stack<Character> charStack = new Stack<Character>();

public class MultiBracketValidation {

    public static boolean multiBracketValidation (String input) {

        Stack<String> bracketsCollection = new Stack<>();

        if (input.length() < 2) {
            return false;
        }

        for(int i = 0; i < input.length(); i++){
            String strEle = Character.toString(input.charAt(i));

            if (strEle.equals('(') || strEle.equals('[') || strEle.equals('{')) {
                bracketsCollection.push(strEle);

            } else if (strEle.equals(')')) {
                if(!bracketsCollection.pop().equals('(')) {
                    return false;
                }
            } else if (strEle.equals(']')) {
                if(!bracketsCollection.pop().equals('[')) {
                    return false;
                }
            } else if (strEle.equals('}')) {
                if(!bracketsCollection.pop().equals('{')) {
                    return false;
                }
            }
        }
        return true;
    }
}

// Attempted to write the code from the whiteboarding,
// but abandoned this strategy when I started thinking about queues as more likeable solution.

//        ArrayList<Character> bracketArr = new ArrayList<>();
//        for(int i = 0; i < input.length(); i++) {
//            if (i == '(' || i == ')' || i == '[' || i == ']' || i == '{' || i == '}') {
//                bracketArr.add( input.charAt(i) );
//            }
//        }
//        int searcher = 0;
//        int stepper= 0;
//        boolean flag = true;
//        while(stepper < bracketArr.size() && flag) {
//            int searcherCount = 0;
//
//        }
