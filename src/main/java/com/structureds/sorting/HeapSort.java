package com.structureds.sorting;

import java.util.Arrays;

/*
Heap Sort is an algorithm that relies on a binary head (a complete binary tree). the time complexity cases are as follows:
Best case : O(n log n)
Average case : O(n log n)
Worst Case : O(n log n)
Space Complexity : O(1)

Sorting elements in ascending order can be accomplished via a Max Heap(the parent node is always greater than equal to the child nodes),
and descending order via a Min Heap (the parent node is always smaller than or equal to the child nodes.
Steps:
1. Transform the given array into max Binary Heap.
2. Next, the root is swapped with the last element from the heap and the heap's size is reduced by 1 ( this is like deleting the root element of the heap).
   So, the greater element ( the heap sort) goes to the lat position.
3. The final step consists of heapifying the remaining heap (apply the recursive process that reconstructs the max heap in a top-down manner).
4. Repeat from step 2 while the heap size is greater than 1.
 */
public class HeapSort {
   private static int[] a;
   private static int size;
   private static int left;
   private static int right;
   private static int largest;

   //Building Heap
   public static void buildHeap(int[] a ){
      size = a.length;
      for (int i = size / 2; i >= 0; i--){
         maxHeap(a, i);
      }
   }

   //MaxHeap
   public static void maxHeap(int[] a, int i){
      left = 2 * i;
      right = 2 * i + 1;
      if(left <= size && a[left] > a[i]){
         largest = left;
      }else {
         largest = i;
      }

      if(right <= size-1 && a[right] > a[largest]){
         largest = right;
      }

      if(largest != i){
         swap(i, largest);
         maxHeap(a, largest);
      }
   }

   //Swapping
   public static void swap(int i, int j){
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }

   //Sort algo using buildHeap, swap and maxHeap
   public static void sort(int[] elements){
      a = elements;
      buildHeap(a);
      for (int i = size; i > 0; i--){
         swap(0, size - 1);
         size--;
         maxHeap(a, 0);
      }
   }

}
