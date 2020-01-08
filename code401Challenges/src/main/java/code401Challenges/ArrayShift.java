package code401Challenges;

public class ArrayShift {

    public static int[] insertShiftArray(int[] input, int numberToAdd) {
        // find middle index of array
        int middleIndex = (input.length + 1) / 2;

        // make a new array
        int[] answer = new int[input.length + 1];

        // populate new array
        for(int i = 0; i < answer.length; i++){
            if (i < middleIndex){
                answer[i] = input[i];
            } else if (i == middleIndex) {
                answer[i] = numberToAdd;
            } else {
                answer[i] = input[i-1];
            }
        }
        return answer;
    }
}
