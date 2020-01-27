##Code challenge for ArrayShift

I'm using separate function to determine the middle point of the array and then I shift the rest of the array and ouput it to the new array.

![Image description](/code401challenges/assets/arrayShift.jpg)


# Stacks and Queues

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
<!-- Short summary or background information -->

## Challenge
<!-- Description of the challenge -->

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

## API
<!-- Description of each method publicly available in each of your trees -->