package com.algorithm;

public class Context {
    MathOperation operation;

    public Context(MathOperation operation) {
        this.operation = operation;
    }

    public int execute(int num1, int num2) {
    // Implement your code here

        int res = operation.performOperation(num1, num2);

        return res;
    }
}
