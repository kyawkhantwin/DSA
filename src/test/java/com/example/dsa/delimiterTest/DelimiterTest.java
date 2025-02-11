package com.example.dsa.delimiterTest;

import com.example.dsa.delimiter.Delimiter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class DelimiterTest {

    private Delimiter delimiter;

    @BeforeEach
    public void setUp() {
        delimiter = new Delimiter();
    }
    @ParameterizedTest
    @CsvSource({
            "'()', true",
            "'[]', true",
            "'{}', true",
            "'({[]})', true"
    })    public void delimiterTest (String input,boolean expected){
        assertEquals(expected,delimiter.isBalanced(input));
    }

    @Test
    public void testBracket() {
        assertTrue(delimiter.isBalanced("()"));
        assertTrue(delimiter.isBalanced("[]"));
        assertTrue(delimiter.isBalanced("{}"));
        assertTrue(delimiter.isBalanced("({[]})"));
    }

    @Test
    public void testBracketNegative() {
        assertFalse(delimiter.isBalanced("("));
        assertFalse(delimiter.isBalanced(")"));
        assertFalse(delimiter.isBalanced("[)"));
        assertFalse(delimiter.isBalanced("({[}])"));
    }

    @Test
    public void testMultipleDelimiterNegative() {
        assertFalse(delimiter.isBalanced("({[}])"));
        assertFalse(delimiter.isBalanced("({[)"));
        assertFalse(delimiter.isBalanced("({[}"));
        assertFalse(delimiter.isBalanced("({[})"));
    }

    @Test
    public void testEmpty() {
        assertTrue(delimiter.isBalanced(""));
    }
}