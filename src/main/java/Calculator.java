// src/main/java/Calculator.java

public class Calculator {

    public int add(int a, int b) {

        return a + b;

    }

    public double subtract(double a, double b) {

        return a - b;

    }



    public double multiply(double a, double b) {

        return a * b;

    }



    public double divide(double a, double b) {

        if (b == 0) {

            throw new IllegalArgumentException("Divisão por zero não é permitida.");

        }

        return a / b;

    }
}
