package com.example.dsa.sort;

import java.util.Arrays;

public class QuickSort {

    public void sort(int[] arr, int low , int high){
     if(low < high){
         int pivotIndex = findPivot(arr,low,high);
         sort(arr,low,pivotIndex -1);
         sort(arr,pivotIndex + 1,high);
     }
    }
    public int findPivot(int[] arr, int low , int high){
      int pivot = arr[high];
        // this is to know where small value index is stopped
      int smallValueTracker = low -1;
      for(int j = low; j < high;j++){
          if(arr[j] <= pivot){
              //if there is no big value small value tracker and j will match
              //smallValueTracker++ will same index
              //so even though swapping it is swapping same index

              // if there is big value smallValueTracker and j will have gap
              //smallValueTracker++ will be larger value
              // The larger value swaps with arr[j], placing the smaller value at j's position
              smallValueTracker++;
              int temp = arr[smallValueTracker];
               arr[smallValueTracker] = arr[j];
               arr[j] = temp;
          }
      }
      //this will move to greater value than pivot value
      smallValueTracker++;
        int temp = arr[high];
        arr[high] = arr[smallValueTracker];
        arr[smallValueTracker] = temp;
        return  smallValueTracker;

    }
}
