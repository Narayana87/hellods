### Recursion
> **A way of solving a problem by having a function calling itself.**
- Performing the same operations multiple times with different inputs.
- In every step, we try smaller inputs to make the problem smaller.
- Base condition is needed to stop the recursion, otherwise infinite loop will occur.

##### Example :
```
public static openRecusrion(int doll){
    if(doll == 1){
        System.out.println("All dolls are opened);
    }
    else {
        openRecusrion(doll - 1);
    }   
}
```
#### Why we need Recursion?
> Recursive thinking is really important in programming and it helps us to break down 
> big problems into smaller one and easier to use.
> 
#### When to choose Recursion?

- If we can divide the problems into smaller sub-problems.
- Design and algorithm to computer n*th... .
- Write code to list the n... .
- Implement a method to compute all.
- Practise.
- The prominent usage of recursion in data structure like `Trees` and `Graphs`.

#### The Logic behind Recursion

- A method call itself.
- Exit from infinite loop. If we miss the base condition we'll get the infinite loop.

##### A Sample Code of Recursion
```
public static String recursionMethod(String[] params){
    if(exit_from_condition satisfied) { 
        return someValue;
    }else{
        recursionMethod(mofified_parameters);
    }
}
```
###### Note: Stack Memory is used to manage the recursive.

#### When to use Recursion.

- when we can easily break down a problem into smaller problem.
- When we are fine with extra overhead (both time & space) that comes it.
- When we need a quick working solution instead of efficient solution.
- When traverse a tree.

#### When to avoid Recursion.

- If time & Space complexity matters for us.
- Recursion uses more memory. If we use embedded memory.
- Recursion can be slow.

#### How to write recursion ?

- Step 1 - Recursive case the flow.
- Step 2 - Base Case - Stopping criterion.
- Step 3 - Unintentional case - the constraint.

e.g: factorial of number.
```
public int fact(int n){
    if(n < 1) {
        return -1;
    }
    if(n == 0 || n == 1){
        return 1;
    }
    return n * fact(n-1);
}

```

  
