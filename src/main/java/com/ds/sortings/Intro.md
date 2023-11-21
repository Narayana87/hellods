#### **Introduction**
*Sorting is a classic subject in computer science. There are three reason to study sorting algorithms.*
1. First, sorting algorithms illustrate many creative approaches to problem solving, and these approaches can be applied to solve other problems.
2. Second, sorting algorithms are good for practicing fundamental programming techniques, using selection statements, loops, methods,and arrays.
3. Third, sorting algorihms are excellent examples to demonstrate algorithm performance.

There are many algorithms for sorting. These are given below.
1. Insertion Sort
2. Selection Sort
3. Bubble Sort
4. Merge Sort
5. Quick Sort
6. Bucket Sort
7. Radix Sort
8. External Sort

****
**1. Insertion Sort**

*The Insertion Sort algorithm sorts a list of values by repeatedly inserting a new element into sorted sublist, until the whole list is sorted.*

Algorithms are given below :
```
for(int i = 1; i < list.length ; i++){
    insert list[i] into sorted sublist list[0..i-1] so that
    list[0..i] is sorted.
}
```
**Sudo Code for Insertion Sort**
```
public void insertionSort(int[] A){
    int i, j, v;
    for(i= 2;  i <= A.length; i++){
        v = A[i];
        j = i;
        while(A[j-1] > v && j >= 1){
            A[j] = A[j - 1];
            j--;
        }
        A[j] = v;
    }
}
```