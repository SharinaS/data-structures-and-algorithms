# Hashtables and My Code Challenge Solutions
The following four methods in the [class Hashtable](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/hashtable) have a Time Complexity of O(1), and a Space Complexity of O(1):

* add()
  * Takes in both the key and value. This method hashes the key, and adds the key and value pair to the table, handling collisions as needed.
* get()
  * Takes in the key and returns the value from the table.
* contains()
  * Takes in the key and returns a boolean, indicating if the key exists in the table already.
* hash()
  * Takes in an arbitrary key and returns an index in the collection.

# Repeated Word
The class [RepeatedWord](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/hashtable/RepeatedWord.java) contains a code challenge that checks a lengthy string to find the first word that is repeated. It then repeats that word. 

Finding the first word that is repeated is done with my own hashtable class, versus the built in Java class.

![image of whiteboard](/code401Challenges/assets/repeated-word.png)

# Tree Intersection
[TreeIntersection](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/hashtable/TreeIntersection.java) is a class that contains methods that find common values within two binary trees. Hashmap and Tree are two classes used to solve this coding challenge. 

![image of whiteboard](/code401Challenges/assets/tree-intersection.jpg)

# LeftJoin
The class [LeftJoin](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/hashtable/LeftJoin.java) includes the solution to a code challenge that LEFT JOINs two hashmaps into a single data structure.

The function I wrote contains two parameters - the first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
The code combines the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.

### Left Join Logic
LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.

### Time and Space
Time Complexity: O(n)

Space Complexity: O(n)

### Data Structures used in this problem:
* Hashtable (my own class)
* Array
* ArrayList

## Whiteboarding 
![image of whiteboard](/code401Challenges/assets/left-join.jpg)
