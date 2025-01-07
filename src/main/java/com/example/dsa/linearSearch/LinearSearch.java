package com.example.dsa.linearSearch;

import java.lang.reflect.Array;

public class LinearSearch {

    public int search(int[] inputs, int toSearch) {
      for (int i = 0;i< inputs.length;i++){
          if(inputs[i] == toSearch){
              return i;
          }
      }
        return -1;

    }

}
