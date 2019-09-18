# data-structures-and-algorithms
Includes Code challenges from Code301d50 course and from Code401Javad6. All descriptions of code challenges that follow are from Code401 Java.

## Contributor
Sharina Stubbs


# Reverse an Array
Whiteboarding done with James Dansie. Actual code written solo by Sharina Stubbs.

## Challenge
Write a function called reverseArray that takes an array as an argument and returns an array with elements in reversed order. Avoids any built-in language specific methods.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I decided to approach this problem with creating a new array, instead of the other option I had considered, which was to change the array in place. I chose the new array approach since it made the most sense to me initially, however creating a new array would sacrifice memory. 

Big 0 time - O(n)
Big 0 space - 0(n)

## Solution
![screenshot of page](code401Challenges/assets/array-reverse.jpg)

# Array Shift
Whiteboarding done with Ahren Swett. Actual code written solo by Sharina Stubbs.

## Challenge
Write a function called ArrayShift that takes an array and a number. Output is a new array that includes that number added to the middle of the original array. Avoids any built-in language specific methods.

## Approach & Efficiency
I approached this problem by identifying the middle index of the original array, and I made a new array. I iterated through the original array up until the point of the middle index, at which point the input number was added to that middle index location. The iteration continued after the middle index with adding in the rest of the original array elements to the new array. 
Big 0 time - O(n)
Big 0 space - 0(n)

## Solution
![screenshot of page](code401Challenges/assets/array-shift.jpg)
