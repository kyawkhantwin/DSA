package com.example.dsa.linearSearchTest;

import com.example.dsa.linearSearch.LinearSearch;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {
    private  final  LinearSearch linearSearch= new LinearSearch();
    private  final int[] inputs = {1,2,3,4,5,6,7,8,9,-1};

    @ParameterizedTest
    @CsvSource( {"1,0","10,-1","-1,9"})
    public void searchTest (int toSearch,int expected){
        int index = linearSearch.search(inputs,toSearch);
        assertEquals(expected,index);
    }
}
