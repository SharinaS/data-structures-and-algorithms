# data-structures-and-algorithms
Includes Code challenges from Code301d50 course and from Code401Javad6. All descriptions of code challenges that follow are from Code401 Java.

## Contributor
Sharina Stubbs

# Java Code Challenges Found Within:
* [Reverse Array](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/ArrayReverse.java)
* [Array Shift](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/ArrayShift.java)
* [Binary Search](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/BinarySearch.java)
* Linked List 

# Approaches, Efficiency and Whiteboarding Solution for Java Code Challenges
Whiteboarding done with James Dansie. Actual code written solo by Sharina Stubbs.

## Reverse Array
Write a function called reverseArray that takes an array as an argument and returns an array with elements in reversed order. Avoids any built-in language specific methods.

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I decided to approach this problem with creating a new array, instead of the other option I had considered, which was to change the array in place. I chose the new array approach since it made the most sense to me initially, however creating a new array would sacrifice memory. 

Big 0 time - O(n)
Big 0 space - 0(n)

### Solution
![screenshot of page](code401Challenges/assets/array-reverse.jpg)

## Array Shift
Whiteboarding done with Ahren Swett. Actual code written solo by Sharina Stubbs.

### Challenge
Write a function called ArrayShift that takes an array and a number. Output is a new array that includes that number added to the middle of the original array. Avoids any built-in language specific methods.

### Approach & Efficiency
I approached this problem by identifying the middle index of the original array, and I made a new array. I iterated through the original array up until the point of the middle index, at which point the input number was added to that middle index location. The iteration continued after the middle index with adding in the rest of the original array elements to the new array. 
Big 0 time - O(n)
Big 0 space - 0(n)

### Solution
![screenshot of page](code401Challenges/assets/array-shift.jpg)


## Binary Search
Whiteboarding done with Jon Veach. Code written by Sharina Stubbs.

### Challenge
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

### Approach & Efficiency
Given the sorted array, my approach was to find the middle of the array, then check to see if the element at the middle matched the key. If it did, then the program simply returned the index of that element. If not, we check if the key is greater than or less than the midpoint, so we can ultimately reset the bounds of array that is searched to either the last half or the first half of the searched array, respectively. We repeat this entire process over and over again using a while loop until either the entire array has been searched, or the key has been found. 
Big 0 time - O(n)
Big 0 space - 0(n)

### Solution
![screenshot of page](code401Challenges/assets/binary-search.jpg)

## Linked List
Contains methods:
* insertAtHead()
* toString()
* includes()

### InsertAtHead
Adds a value to the linked list at the beginning of the list.

### toString
Takes the linked list values and outputs them as a string.

### includes()
Checks the values of the linked list for a particular value.
