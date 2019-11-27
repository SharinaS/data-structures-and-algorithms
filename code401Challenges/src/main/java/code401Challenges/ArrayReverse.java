package code401Challenges;

import java.util.Arrays;

public class ArrayReverse {
  //main method for running my code 
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

