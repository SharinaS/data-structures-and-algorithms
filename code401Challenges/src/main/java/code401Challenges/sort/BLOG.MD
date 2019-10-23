# Sorting Algorithms Discussed Here:
* [Insertion Sort](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/sort/InsertionSort.java)
* [Merge Sort](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/sort/MergeSort.java)

# Insertion Sort

Insertion is a simple sorting algorithm that works the way humans sort a hand of cards. 

It is a good algorithm to use when you are receiving a new piece of data. It is good for maintaining a sorted thing as new pieces of data are being added in.

It does not have good time complexity of big o of n. It is O(n^2). This is because in the worst case scenario, you have to swap and compare every single item if the array starts in decreasing order. For smaller sets of data, however, perhaps less than 1000 items, it can be fairly fast.

## Learning Objectives
* Understand what a storted list does, what it is not good at, and how it sorts a list.

## Information Flow

* Array is sorted in place
  * Items are rearranged within the array
* We start from the second item
  * An array with only one item is a sorted list. 
* If the item at index i (called a key) is smaller than the value of the item at index j, then the key moves one position to the left ([Baeldung](https://www.baeldung.com/java-insertion-sort))
  
## Diagram
From [Geeks for Geeks](https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwiU0NHk6K7lAhXuHTQIHXBWDKoQjRx6BAgBEAQ&url=https%3A%2F%2Fwww.geeksforgeeks.org%2Finsertion-sort%2F&psig=AOvVaw1nYanfQCDzyfBPIShuHQCc&ust=1571797675549321)
![insertion sort](/code401Challenges/assets/insertionsort.png)

## Algorithm

1. Work left to right
2. Examine each item and compare that item to items on its left.
3. Insert the item in the correct position in the array, given the item's value.

## Pseudocode
````
InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
````

## Readings and References

**Watch**
* [Khan Academy's Insertion Sort](https://www.youtube.com/watch?v=lCzQvQr8Utw)

**Read**
* [Insertion Sort from Geeks for Geeks](https://www.geeksforgeeks.org/insertion-sort/)
* [Insertion Sort in Java from Baeldung](https://www.baeldung.com/java-insertion-sort)

**Bookmark**
* [Insertion Sort Visualizer](https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/visualize/)

# Merge Sort
Merge sort is a Divide and Conquer algorithm. We divide by recursively splitting up the array into two parts. We conquer when we sort and merge the two arrays from bottom to top.

### Eficiency
* Time Complexity: O(n log n)
* Space Complexity: O(n)

### Downside: 
It does require creating extra space on the callstack, since a new array is required to be built from the two original arrays.

## Learning Objectives
* Understand what a merge sort does
* Pseudocode for merge sort
* Java code for merge sort
* See what great references there are out there.

## Diagram
From [Wikipedia](https://en.wikipedia.org/wiki/File:Merge_sort_algorithm_diagram.svg):
![merge sort](/code401Challenges/assets/merge-sort.png)

## Algorithm
Divide an input array into two halves. The pivot is the midpoint of the array.Do this recursively for all the half arrays until there are no more half arrays to divide. Sort and merge the divided arrays from bottom to top, to ultimately get the sorted array ([Baeldung](https://www.baeldung.com/java-merge-sort))


## Pseudocode
```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

```

## Readings and References

**Watch**

[Algorithms: Merge Sort](https://www.youtube.com/watch?v=KF2j-9iSf4Q)  with Gayle Laakmann McDowell, from Cracking the Coding Interview.

**Read**

[Merge Sort in Java](https://www.baeldung.com/java-merge-sort) by baeldung. 

**Bookmark**

[Merge sort visualization(2500 elements)](https://www.youtube.com/watch?v=_r0gV2hQYf0)



