package edu.baylor.csi3471.setup;

public class Calculator {
    // compute factorial of an integer n with validation
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}