### Stack:
A stack is a simple data structure used for storing data. In stack, the order in which the data
arrives is important.

##### Definition:
A *STACK* is an ordered list in which insertion and deletion are done at one end, called as *top*.
The last element inserted is the first one to be deleted, Hence it is called *Last In First Out* (LIFO)
or *First In Last Out* (FILO) list.

##### Stack Operation:
1. void push(E element) : insert data onto stack.
2. void pop() : Removes and returns the last inserted element from the stack.
3. int top() : Return the top element that is last inserted element without removing it.
4. int size() : Returns size of the stack
5. boolean isEmpty() : indicates a empty stack or not.
6. boolean isStackFull() : indicates the stack is full or not.

Since the insertion and deletion operations on a `Stack` are made only end of the stack. It is the more efficient to
implement a stack with an `ArrayList` then `LinkedList` .

Using Composition : We can define an `ArrayList` as a data field in the stack class and LinkedList ad a data field in
the queue class.

Using composition is better because it enables you to define completely new Stack class and Queue class
without inheriting the unnecessary and inappropriate methods from the `ArrayList` & `LinkedList` .