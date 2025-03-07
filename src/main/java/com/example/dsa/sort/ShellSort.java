package com.example.dsa.sort;

public class ShellSort {

    public int[] sort(int[] array){
     int n = array.length;
     for(int gap = n/2; gap> 0;gap /= 2) {
         for(int i = gap;i < n;i++){
             int temp = array[i];
             int j;
             for(j = i; j >= gap && array[j-gap] > temp; j -= gap){
                 array[j] = array[j-gap];
             }
             array[j] = temp;
         }
     }
        return array;

     }
    int[] arr = {9, 8, 3, 7, 5, 6, 4, 1};
}
