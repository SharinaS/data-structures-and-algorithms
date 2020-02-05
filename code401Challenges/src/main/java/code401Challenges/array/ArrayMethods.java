package code401Challenges.array;


import java.util.HashSet;

public class ArrayMethods {

    // A method that, given an array nums of integers,
    // returns how many of those integers contain an even number of digits.
    // A question from Baeldung - https://www.baeldung.com/java-number-of-digits-in-int

    public static int findDigitsWithEvenNumberLengthsInArray(int[] nums) {
        int numsWithEvenNumDigits = 0;

        for (int i = 0; i < nums.length; i++) {
            int jumpsBy10 = 1;
            int digitLength = 0;

            // at each digit, count by 1 each time another number jumps by 10, until the value at i has been
            // jumped past. This gives the length of a digit.
            while (jumpsBy10 <= nums[i]) {
                digitLength++;
                jumpsBy10 *= 10;
            }
            // count up only those digits that are of even numbered lengths
            if (digitLength % 2 == 0) {
                numsWithEvenNumDigits++;
            }
        }
        return numsWithEvenNumDigits;
    }

    // Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
    // (A question from CodingBat.com)
    //either24([1, 2, 2]) → true
    //either24([4, 4, 1]) → true
    //either24([4, 4, 1, 2, 2]) → false
    public static boolean checkForAPairOf2AndPairOf4(int[] nums) {
        boolean flag = false;
        HashSet<Integer> checkerOf2And4 = new HashSet<>();
        for(int i = 0; i < nums.length-1; i++ ) {
            if (nums[i] == 2 && nums[i+1] == 2) {
                checkerOf2And4.add(2);
                flag = true;
            } if (nums[i] == 4 && nums[i+1] == 4) {
                checkerOf2And4.add(4);
                flag = true;
            }
            if (checkerOf2And4.contains(2) && checkerOf2And4.contains(4)){
                flag = false;
            }
        }
        return flag;
    }
}
