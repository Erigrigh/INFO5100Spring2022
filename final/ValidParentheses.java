package com.algorithm;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }

            if(ch == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    //System.out.println(false);
                    return false;
                }
            }

            if(ch == '}'){
                if(stack.isEmpty() || stack.pop() != '{'){
                    //System.out.println(false);
                    return false;
                }
            }

            if(ch == ']'){
                if(stack.isEmpty() || stack.pop() != '['){
                    //System.out.println(false);
                    return false;
                }
            }

        }

//        if(stack.isEmpty()){
//            System.out.println(true);
//        }

        return stack.isEmpty();
    }

}
