package code401Challenges;

public class ArrayShift {

    public static int[] insertShiftArray(int[] input, int numberToAdd) {
        // find middle index of array
        int middleIndex;
        if (input.length % 2 == 0) {
            middleIndex = input.length/2;
        } else {
            middleIndex = (input.length + 1) / 2;
        }
        // make a new array
        int[] longerBy1Arr = new int[input.length + 1];

        //iterate through old array and populate new array
        for(int i = 0; i < longerBy1Arr.length; i++){
            if (i < middleIndex){
                longerBy1Arr[i] = input[i];
            } else if (i == middleIndex) {
                longerBy1Arr[i] = numberToAdd;
            } else {
                longerBy1Arr[i] = input[i-1];
            }
        }
        return longerBy1Arr;
    }
}
