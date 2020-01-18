# Code Challenges 
My collection of solutions in Java to code challenges that involve arrays.

## Contributor
Sharina Stubbs

# Reverse Array
## Problem Domain 
Write a function called reverseArray() that takes an array as an argument and returns an array with elements in reversed order. Avoids any built-in language specific methods. 

See the [code](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/ArrayReverse.java) in my GitHub repo].

## Approach & Efficiency
There are two different algorithms available for reversing the elements of an array:
* Create a new array. Copy each element into the mirrored position in the new array. Return the new array.
  * This will not modify the original array.
* Swap the two elements in the mirrored spots from each other. Stop at the middle. Return the input array.
  * This will not take up more memory.

I decided to approach this problem with creating a new array, instead of the other option I had considered, which was to change the array in place. I chose the new array approach since it made the most sense to me initially, however creating a new array would sacrifice memory. 

Big 0 time - O(n)
Big 0 space - 0(n)

## Solution
![screenshot of page](/code401Challenges/assets/array-reverse.jpg)

# Array Shift
Whiteboarding done with Ahren Swett. Actual code written solo by Sharina Stubbs. My code can be found in my [GitHub repo](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/ArrayShift.java), along with associated [tests](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/test/java/code401Challenges/ArrayShiftTest.java).

## Challenge
Write a function called ArrayShift that takes an array and a number. Output is a new array that includes that number added to the middle of the original array. Avoids any built-in language specific methods.

## Approach & Efficiency
I approached this problem by identifying the middle index of the original array, and I made a new array. I iterated through the original array up until the point of the middle index, at which point the input number was added to that middle index location. The iteration continued after the middle index with adding in the rest of the original array elements to the new array. The new array that is created is +1 size compared to the old array.

### Time and Space
Big 0 time - O(n)
Big 0 space - O(n)

## Solution
![screenshot of page](/code401Challenges/assets/array-shift.jpg)

# Binary Search
Whiteboarding done with Jon Veach. Code written by Sharina Stubbs. Find the code in [my GitHub repo](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/BinarySearch.java) and the tests I wrote [here](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/test/java/code401Challenges/BinarySearchTest.java).

## Challenge
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

## Approach & Efficiency
Given the sorted array, my approach was to find the middle of the array, then check to see if the element at the middle matched the key. If it did, then the program simply returned the index of that element. If not, we check if the key is greater than or less than the midpoint, so we can ultimately reset the bounds of array that is searched to either the last half or the first half of the searched array, respectively. We repeat this entire process over and over again using a while loop until either the entire array has been searched, or the key has been found. 
Big 0 time - O(n)
Big 0 space - 0(n)

## Solution
![screenshot of page](/code401Challenges/assets/binary-search.jpg)

# Multi-Bracket Validation
Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

* Round Brackets : ()
* Square Brackets : []
* Curly Brackets : {}

Examples:
* {}	TRUE
* {}{Code}[Fellows](())	TRUE
* {(})	FALSE
* [({}]	FALSE

Check out my code in [my GitHub repo](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/utilities).

## Algorithm
The algorithm I implemented in my code uses a stack to store all open brackets. For each iteration through the string, the potential mate of the bracket stored in the stack is compared to the top of the stack. If there's a match, the bracket in the stack is popped. What should be left is an empty stack. If not, there's an unclaimed bracket in the stack, and so the algorithm returns false.

Big O:
* Time: O(1)  
* Space: O(n) 

## Whiteboarding
I created an algorithm for this code challenge during my whiteboarding that I decided not to implement. When I started coding, I realized that using a stack would be easier. 
![whiteboarding](/code401Challenges/assets/bracket-validation.jpg)

# Count Even Numbers 
## Problem Domain
Count up the number of even numbers that exist in an array.

### The Code
No code is yet available for this problem, beyond that shown in the image of the whiteboard.

### Whiteboarding
![whiteboarding](/code401Challenges/assets/count-evens.jpg)

# Count Numbers Except Those Between 6 and 7
## Problem Domain
Return the sum of the numbers in an array, except ignore sections of numbers starting with a six and extending to the next 7 (every six will be followed by at least one seven). Return 0 for no numbers.

### The Code
No code is yet available for this problem, beyond that  shown in the image of the whiteboard.

### Whiteboarding
![whiteboarding](/code401Challenges/assets/count-except-67a.jpg)

![whiteboarding](/code401Challenges/assets/count-except-67b.jpg)

# Array Methods
This is a collection of methods that solve common code challenges involving arrays. Code challenges sourced from sites such as Leetcode and CodingBat.

Only the code is available, minus an image taken of a whiteboard, unless an image is imbedded with the method listed below.
## Methods 
* findDigitsWithEvenNumberLengthsInArray()