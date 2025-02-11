package com.example.dsa.PostFixConvertor;

import com.example.dsa.stack.Stack;

import java.util.ArrayList;
import java.util.HashMap;

public class PostFixConvertor {
    HashMap<Character,Integer> precedences = new HashMap<>();
    public PostFixConvertor(){
        this.precedences.put('+',1);
        this.precedences.put('-',1);
        this.precedences.put('*',2);
        this.precedences.put('/',2);
    }

    public boolean stackCharacterIsLargerOrEqual(char infixChr, char  stackChr){
        int infixPrecedencesValue = precedences.get(infixChr);
        int stackPrecedencesValue = precedences.get(stackChr);

       return  stackPrecedencesValue >=  infixPrecedencesValue;
    }
    public String  toPostFix(String infix){
        Stack<Character> stack = new Stack<>(10);
        StringBuilder postfix = new StringBuilder();
        for(int i = 0; i < infix.length(); i++){
            char ch = infix.charAt(i);
            if(this.isOperand(ch)){
                postfix.append(ch);
            } else if( this.isOperator(ch)){
                if(stack.isEmpty()){
                    stack.push(ch);
                } else {
                  while(!stack.isEmpty() && stackCharacterIsLargerOrEqual(ch,stack.peek())){
                      postfix.append(stack.pop());
                  }
                  stack.push(ch);
                }
            }
        }
        while (!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }
    boolean isOperand(char ch){
        return !isOperator(ch) && !isParenthesis(ch);
    }
    boolean isParenthesis(char ch){
        return ch == ')' || ch == '(' ;
    }
    boolean isOperator(char ch) {
        return "+-*/".indexOf(ch) >= 0;
    }

}
