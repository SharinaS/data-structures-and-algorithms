package code401Challenges.string;


import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StringStuff {

    public static void main(String[] args) {
        String str1 = "look at the cat!";
        String str2 = str1.replaceAll(" ", "");
        String str3 = str2.replace("!", "");

        for (char c : str3.toCharArray()) {
            System.out.println(c);
        }

        char[] str4 = str2.toCharArray();
        System.out.println("str4 is: " + str4);

//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }
//
//        String[] splitStr = str.split(" ");
//        System.out.println(splitStr);
//
//        for (int i = 0; i < splitStr.length; i++){
//            System.out.println("should be at: " + i + " is " + splitStr[i]);
//        }
//
//        String pattern = "/\\w[cat]\\w/ig";

        // Split a String
//        String[] arrOfStr = str.split(" ");
//        for (String a : arrOfStr) {
//            System.out.println(a);
//        }

        // ===== check for unique characters in a string ======
//        HashSet<Character> setty = new HashSet<>();
//        str.toLowerCase();
//        for (char c : str.toCharArray()) {
//            if (setty.contains(c)) {
//                System.out.println(c);
//            } else {
//                setty.add (c);
//            }
//        }

        ////////////////////////////////////////////

//        String str = "In a galaxy far far away";
//        HashMap<String, Integer> hashy = new HashMap<>();
//        String wordy = " ";
//        int counter = 0;
//
//        // do you remove punctuation from str first?
//
//        String[] splitStr = str.split(" ");
//
//        for (int i = 0; i < splitStr.length; i++) {
//            int tempCounter = 0;
//            String tempWord = " ";
//
//            if (!hashy.containsKey(splitStr[i])) {
//                hashy.put(splitStr[i], 1);
//                tempCounter += 1;
//                tempWord = splitStr[i];
//            } else {
//                hashy.put(splitStr[i], hashy.get(splitStr[i] + 1)); // update the value by 1
//                tempCounter = hashy.get(splitStr[i]);
//                tempWord = splitStr[i];
//            }
//
//            if (tempCounter > counter) {
//                //wordy = splitStr[i];
//                wordy = tempWord;
//                counter = tempCounter;
//            }
//        }
//        System.out.println(wordy);


        // ====== remove punctuation ======
        String str = "In a! galaxy far, far away";
        str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);

        System.out.println("*******************");

        // ======= grab the key that has the highest value =======
        HashMap<String, Integer> hashy = new HashMap<>();
        hashy.put("apples", 1);
        hashy.put("apricots", 300);
        hashy.put("bananas", 200);

        String highestValuedWord = " ";
        int tempValue = Integer.MIN_VALUE;

        if(hashy.containsKey("bananas")){
            System.out.println("grabbing the banana value... " + hashy.get("bananas"));
        }


        for (Map.Entry<String, Integer> theStuff : hashy.entrySet()) {
            System.out.println("the key " + theStuff.getKey());
            System.out.println("the value " + theStuff.getValue());

            if (theStuff.getValue() > tempValue) {
                highestValuedWord = theStuff.getKey();
                tempValue = theStuff.getValue();
            }
        }
        System.out.println("The word you are looking for is: " + highestValuedWord);

        System.out.println("*******************");

        // ======= Iterate through a hashset ========
        HashSet<String> setty = new HashSet<>();
        setty.add("potatoes");
        setty.add("apples");
        setty.add("tomatoes");

        for (String settyStuff : setty) {
            System.out.println(settyStuff);
        }

//        if (setty.contains("tomatoes")) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }


        System.out.println("*******************");

        int[] arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
            //System.out.println("i is " + arr[i]);
            for (int j = 0; j < arr.length; j++) {
                System.out.println("i is " + arr[i] + " j is " + arr[j]);
            }
        }
        System.out.println("*******************");

        int[] sumArr = {1,2,3,4,5};
        int sumOfArr = 0;
        for(int i = 0; i < sumArr.length; i++){
            sumOfArr += sumArr[i];
        }
        System.out.println("sum of sumArr: " + sumOfArr);

        System.out.println("*******************");


        // Playing with Strings and chars
        String testString = "hello";
        char aChar = testString.charAt(0);
        System.out.println(testString + aChar);

        //System.out.println("adding up chars to empty string: " + wasEmptyString + testString.charAt(0) + testString.charAt(1));
        System.out.println("using substring: " + testString.substring(0,2));

        String firstBit = testString.substring(0,2);
        String threeFirstBits = firstBit + firstBit + firstBit;
        System.out.println("three firstBits: " + threeFirstBits);

        System.out.println("using repeat to print out firstBit 3 times: " + firstBit.repeat(3));


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");

        String str45 = "HilloHi";
        int length = str45.length();
        char secondFromEnd = str45.charAt(length-2);
        char firstFromEnd = str45.charAt(length-1);

        System.out.println(firstFromEnd);
        System.out.println(secondFromEnd);

        String lastTwo = str45.substring(length-2, length); //Hi

        System.out.println("last two: " + lastTwo);
        System.out.println("first two: " + str45.substring(0,2));

        if(str45.substring(0,2).equals(lastTwo)) {
            System.out.println("they match");
        } else {
            System.out.println("they don't match");
        }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");

        String echo = "echo";
        String answerEcho = "";
        int n = 0;
        for(int i = 0; i < n; i++) {
            answerEcho += echo;
        }
        System.out.println(answerEcho);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");

        String countCode = "aaacodebbb";
        for(int i = 0; i < str.length(); i++) {
            if(countCode.charAt(4) == 'a'){
                System.out.println("a is found at index 0");
                break;
            } else {
                System.out.println("got to the else");
                break;
            }
        }


        int countCodeCounter = 0;
        for(int i = 0; i < countCode.length()-1 ; i++) {
            if (countCode.charAt(i) == 'c' && countCode.charAt(i+1) == 'o' && countCode.charAt(i+3) == 'e') {
                countCodeCounter +=1;
            }
        }
        System.out.println("c occurrences: " + countCodeCounter);



        System.out.println("**************************");

        int evenCounter = 0;
        int[] arrayEvens = {1, 2, 3, 4};
        for(int i = 0; i < arrayEvens.length; i++) {
            if(i == 0) {
                evenCounter++;
            }
            if(i % 2 == 0 ) {
                evenCounter++;
            }
        }
        System.out.println(evenCounter);



    }
}

