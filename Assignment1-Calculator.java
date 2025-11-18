package com.example.calculator;

public class Calculator {

    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public double sin(double x) { return Math.sin(Math.toRadians(x)); }
    public double cos(double x) { return Math.cos(Math.toRadians(x)); }
    public double tan(double x) { return Math.tan(Math.toRadians(x)); }
    public double log(double x) { return Math.log10(x); }
    public double ln(double x) { return Math.log(x); }
    public double sqrt(double x) { return Math.sqrt(x); }
    public double pow(double base, double exp) { return Math.pow(base, exp); }

    public long factorial(int n) {
        if (n < 0) throw new ArithmeticException("Invalid Input");
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
}
