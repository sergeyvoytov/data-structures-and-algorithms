##Code challenge for ArrayShift

I'm using separate function to determine the middle point of the array and then I shift the rest of the array and ouput it to the new array.

![Image description](/code401challenges/assets/arrayShift.jpg)


## Stacks and Queues

Stacks
- used push method makes any value as an argument and adds a new node with that value to the top
- used pop method does not take any argument, removes the node from the top of the stack, and returns the node’s value.
- used peek method does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
- used isEmpty method does not take an argument, and returns a boolean indicating whether or not the stack is empty

Queues

- Enqueue method takes any value as an argument and adds a new node with that value to the back of the queue
- Dequeue method does not take any argument, removes the node from the front of the queue
- Peek method does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
- isEmpty method does not take an argument, and returns a boolean indicating whether or not the queue is empty

## Challenge 11
Implement a Queue using two Stacks.


## Approach & Efficiency
enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.
dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.

O(n) space

O(n) time
## Whiteboard image
![Image description](/code401challenges/assets/queue-with-stacks.jpg)


## Challenge 12
First-in, First out Animal Shelter.


## Approach & Efficiency
enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

O(1) space

O(n) time
## Whiteboard image
![Image description](/code401challenges/assets/AnimalShelter.jpg)


## Challenge 13
Multi-bracket Validation.


## Approach & Efficiency
created multiBracketValidation(String input)  method to verify that brackets create a matching pair. Stack is used to verify. If the all pairs are the amtch then returns true.

O(n) space

O(n) time
## Whiteboard image
![Image description](/code401challenges/assets/multi-bracket-validation.jpg)


# Trees
A Tree is a non-linear data structure where data objects are organized in terms of hierarchical relationship. The structure is non-linear in the sense that, unlike simple array and linked list implementation, data in a tree is not organized linearly. 
Featured tasks completed:
- Created a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- Created a BinaryTree class
- Defined a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns a list
of the values, ordered appropriately.
- Created a BinarySearchTree class
- Defined a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
- Defined a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

## Challenge 16
Conduct “FizzBuzz” on a tree while traversing through it. Change the values of each of the nodes dependent on the current node’s value


## Approach & Efficiency
O(n) for space and O(n) for time

I decided to do it recursely using helper method
## Whiteboard image
![Image description](/code401challenges/assets/fizzbuzz.jpg)



## Challenge 17
Breadth-first Traversal.


## Approach & Efficiency
O(n) for space and O(n) for time

Write a breadth first traversal method which takes a Binary Tree as its unique input.## Whiteboard image
![Image description](/code401challenges/assets/breadth-first.jpg)

## Challenge 18
Find the Maximum Value in a Binary Tree


## Approach & Efficiency
O(n) for space and O(n) for time

- Wrote an instance method called find-maximum-value , returns the maximum value stored in the tree, assuming that the values stored in the Binary Tree will be numeric.
- Used search helper method to recursevly search the binary tree using Node as a parameter 
![Image description](/code401challenges/assets/find-maximum-value.jpg)

## Selection Sort

Insert Sort is a sorting algorithm that traverses the array multiple times as it slowly builds out the sorting sequence.
  O(n2) for space
  O(1) for time
 
 
 ![Image description](/code401challenges/assets/1sort.jpg)

## Merge Sort

Merge Sort is a sorting algorithm that traverses the array multiple times as it slowly builds out the sorting sequence.
  O(logN) for space
  O(n) for time
 
 ![Image description](/code401challenges/assets/merge.jpg)
 
## Quick Sort

O(nlogN) for space
O(nlogN) for time
 ![Image description](/code401challenges/assets/quick.jpg)