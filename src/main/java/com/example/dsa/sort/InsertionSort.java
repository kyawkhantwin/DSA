package com.example.dsa.sort;

public class InsertionSort {
    int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }
    public int[] sort(){
        for (int i = 1; i < this.array.length; i++) {
            int compareValue = this.array[i];
            int j = i -1;
            while (j >=0 && j > compareValue ){
                this.array[j +1] = this.array[j];
                j--;
            }
            // j + 1 is because of j--;
            this.array[j + 1] = compareValue;
        }
        return this.array;
    }

}
