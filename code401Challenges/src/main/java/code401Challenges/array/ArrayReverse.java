package code401Challenges.array;

import java.util.Arrays;

// The class matches the name of the file
public class ArrayReverse {

  //main method for running my code  - main method is "the entry point" to this file.
  public static void main(String[] args) {
    int[] arrToReverse = new int[]{500, 30, 13, 1, -2};
    int[] reversedArray = reverseArray(arrToReverse);
    System.out.println(Arrays.toString(reversedArray));
  }

  //arrayReverse Method
  public static int[] reverseArray(int[] incomingArr) {
    int arrayLength = incomingArr.length;
    int[] newCoolArr= new int[arrayLength];
    
    for(int i = 0; i < arrayLength; i++){
      newCoolArr[arrayLength - i - 1] = incomingArr[i];
    }
    return newCoolArr;
  }
}

