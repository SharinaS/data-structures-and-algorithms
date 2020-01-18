package code401Challenges.array;


public class ArrayMethods {

    // A method that, given an array nums of integers,
    // returns how many of those integers contain an even number of digits.
    // Resourced https://www.baeldung.com/java-number-of-digits-in-int

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

}
