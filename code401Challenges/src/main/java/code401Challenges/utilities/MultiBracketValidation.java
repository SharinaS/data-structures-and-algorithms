package code401Challenges.utilities;

import java.util.ArrayList;
import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation (String input) {
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
        // some help with the final logic from a leetcode discussion at
        // https://leetcode.com/problems/valid-parentheses/discuss/9248/My-easy-to-understand-Java-Solution-with-one-stack
        //Stack<Character> charStack = new Stack<Character>();

        Stack<Character> charStack = new Stack<>();
        // push open parens onto stack
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ')' || input.charAt(i) == ']' || input.charAt(i) == '}') {
                charStack.push(input.charAt(i));
                // pop off all the matching brackets
            } else if (input.charAt(i) == '(' && !charStack.isEmpty() && charStack.peek() == ')'){
                charStack.pop();
            } else if (input.charAt(i) == '[' && !charStack.isEmpty() && charStack.peek() == ']'){
                charStack.pop();
            } else if (input.charAt(i) == '{' && !charStack.isEmpty() && charStack.peek() == '}'){
                charStack.pop();
                // if there's not a match, there's a lonely bracket in there.
            } else
                return false;
        }
        //if there are no open parens left in stack, return true...
        return charStack.isEmpty();
    }
}
