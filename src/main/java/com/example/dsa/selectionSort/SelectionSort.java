package com.example.dsa.selectionSort;

public class SelectionSort {
    int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }
    public int[] sort(){
        for(int i = 0; i < this.array.length - 1;i++){
            int minIndex = i;
            for (int j = i + 1 ; j < this.array.length ;j++){
                if(this.array[minIndex] > this.array[j]){
                    minIndex = j;
                }
            }
            int temp = this.array[i];
            this.array[i] = this.array[minIndex];
            this.array[minIndex] =temp;
        }
        return this.array;
    }
}
