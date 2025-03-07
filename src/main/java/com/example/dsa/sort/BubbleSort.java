package com.example.dsa.sort;

public class BubbleSort{
    int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public int[] sort(){
        for(int i = 0; i < this.array.length - 1;i++){
            for (int j = 0 ; j < this.array.length -1 - i ;j++){
                if(this.array[j] > this.array[j + 1]){
                    int temp = this.array[j];
                    this.array[j] = this.array[j+1];
                    this.array[j+ 1]  = temp;
                }

            }
        }
        return this.array;
    }
}
