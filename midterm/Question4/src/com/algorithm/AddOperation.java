package com.algorithm;

public class AddOperation implements MathOperation{

    String name = "AddOperation";

    @Override
    public int performOperation(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + num2;
    }
}
