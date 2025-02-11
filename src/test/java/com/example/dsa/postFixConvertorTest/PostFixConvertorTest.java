package com.example.dsa.postFixConvertorTest;

import com.example.dsa.PostFixConvertor.PostFixConvertor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PostFixConvertorTest {
    PostFixConvertor convertor = new PostFixConvertor();

    @Test
    public void testBaseCase(){
        String postfix = convertor.toPostFix("a+b");
        assertEquals("ab+",postfix);
        assertEquals("ab*",convertor.toPostFix("a*b"));
    }
    @Test
    public void testWithDifferentOperator(){
        String postfix = convertor.toPostFix("a+b-c");

        assertEquals("ab+c-",postfix);
        assertEquals("ab*c+", convertor.toPostFix("a*b+c"));
        assertEquals("abc*+", convertor.toPostFix("a+b*c"));
        assertEquals("ab*cd*+", convertor.toPostFix("a*b+c*d"));
        assertEquals("ab/cd*+", convertor.toPostFix("a/b+c*d"));
    }
}
