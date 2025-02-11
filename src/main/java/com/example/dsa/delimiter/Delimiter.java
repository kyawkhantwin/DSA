package com.example.dsa.delimiter;

import com.example.dsa.stack.Stack;

import java.util.ArrayList;

public class Delimiter {
    ArrayList<Character> startTags = new ArrayList<>();
    ArrayList<Character> endTags = new ArrayList<>();
    public  Delimiter(){
        startTags.add('[');
        endTags.add(']');

        startTags.add('(');
        endTags.add(')');

        startTags.add('{');
        endTags.add('}');
    }

    public boolean isBalanced(String input){

        Stack<Character> stack = new Stack<>(20);
        for( int i = 0;i < input.length() ; i++){
            char ch = input.charAt(i);
            if (isInvalidDelimiter(ch, stack)) return false;
        }
        return  stack.isEmpty();
    }

    private boolean isInvalidDelimiter(char ch, Stack<Character> stack) {
        if(isCharacterStartTag(ch)){
            stack.push(ch);
        } else if (isCharacterEndTag(ch)){
            return isMismatchedClosingTag(stack, ch);
        }
        return false;
    }

    private boolean isMismatchedClosingTag(Stack<Character> stack, char ch) {
        if (stack.isEmpty()) return true;
        Character topOfStack = stack.pop();
        int endTagIndex =endTags.indexOf(ch);
        int startTagIndex =startTags.indexOf(topOfStack);

        return endTagIndex != startTagIndex;
    }
    private boolean isCharacterEndTag(char ch) {
        return endTags.contains(ch);
    }
    private boolean isCharacterStartTag(char ch) {
        return startTags.contains(ch);
    }

}
