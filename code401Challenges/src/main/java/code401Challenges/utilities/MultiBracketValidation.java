package code401Challenges.utilities;

import java.util.Stack;

// some help with the final logic from a leetcode discussion at
// https://leetcode.com/problems/valid-parentheses/discuss/9248/My-easy-to-understand-Java-Solution-with-one-stack
//Stack<Character> charStack = new Stack<Character>();

// consider: char ch = input.charAt(i);

public class MultiBracketValidation {

    public static boolean multiBracketValidation (String input) {

        Stack<String> bracketsCollection = new Stack<>();

        if (input.length() < 2) {
            return false;
        }

        for(int i = 0; i < input.length(); i++){
            String strEle = Character.toString(input.charAt(i));

            if (strEle.equals("(") || strEle.equals("[") || strEle.equals("{")) {
                bracketsCollection.push(strEle);

            } else if (strEle.equals(")")) {
                if(!bracketsCollection.pop().equals("(")) {
                    return false;
                }
            } else if (strEle.equals("]")) {
                if(!bracketsCollection.pop().equals("[")) {
                    return false;
                }
            } else if (strEle.equals("}")) {
                if(!bracketsCollection.pop().equals("{")) {
                    return false;
                }
            }
        }
        return bracketsCollection.isEmpty();
    }
}

// See Jan 23 Java 401d9 class demo notes in repo for discussion of alternative solution
