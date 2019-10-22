# Blog Notes: Insertion Sort

Insertion is a simple sorting algorithm that works the way humans sort a hand of cards. 

Is it more efficient than others? How does it attack the problem differently?

## Learning Objectives
* What
* Will
* The 
* Students
* Learn
* Today

## Information Flow

* Main Point
  * Supporting Points
* Another main point
  * More details
  * Go here 
  
## Diagram

Include your "Visual" here

## Algorithm

Describe in detail how the algorithm works.
Include small code snippets to possibly support the points

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
* [Video](http://link-to-amazing-video)

**Read**
* [Insertion Sort](https://www.geeksforgeeks.org/insertion-sort/)
* [Insertion Sort in Java](https://www.baeldung.com/java-insertion-sort)

**Bookmark**
* [Insertion Sort Visualizer](https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/visualize/)