package code401Challenges.array;

import java.util.Arrays;

// The class matches the name of the file
public class ArrayReverse {

  public static void main(String[] args) {
    int[] arrToReverse = new int[]{500, 30, 13, 1, -2};
    int[] reversedArray = reverseArray(arrToReverse);
    System.out.println(Arrays.toString(reversedArray));
  }

  // Reverse an array - Uses new array
  public static int[] reverseArray(int[] incomingArr) {
    int arrayLength = incomingArr.length;
    int[] newCoolArr= new int[arrayLength];
    
    for(int i = 0; i < arrayLength; i++){
      newCoolArr[arrayLength - i - 1] = incomingArr[i];
    }
    return newCoolArr;
  }

  //====== Following methods have tests written in their test class.

  // Reverse an array - uses new array, option 2
  public static int[] reverseAnArrayAndMakeNewArray(int[] nums) {
    int[] newArr = new int[nums.length];
    for(int i = 0; i < nums.length; i++) {
      newArr[i] = nums[nums.length-1-i];
    }
    return newArr;
  }
}

