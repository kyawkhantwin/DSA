package com.example.dsa.sort;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSorting(int[] array,int left ,int right){ // left = 0 rith = length
      if(left < right){
          int mid = left+(right - left) /2;

          mergeSorting(array,left,mid);
          mergeSorting(array,mid + 1,right);
          merge(array,left,mid,right);
      }

    }
    public static void merge(int[] array , int left , int mid , int right) {
        int[] copyArrayFirst = Arrays.copyOfRange(array, left ,mid +1);
        int[] copyArraySecond = Arrays.copyOfRange(array,mid + 1,right + 1);

        int i=0;
        int j=0;
        int k=left;

        while (i < copyArrayFirst.length && j < copyArraySecond.length ){
            if(copyArrayFirst[i] <= copyArraySecond[j]){
                array[k++] = copyArrayFirst[i++];
            }else {
                array[k++] = copyArraySecond[j++];
            }
        }

        while (i < copyArrayFirst.length ){
            array[k++] = copyArrayFirst[i++];
        }
        while (j < copyArraySecond.length ){
            array[k++] = copyArraySecond[j++];
        }
    }
}
