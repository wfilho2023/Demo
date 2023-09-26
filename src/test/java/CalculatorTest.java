// src/test/java/CalculatorTest.java 

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class CalculatorTest {

    @Test

    public void testAddition() {

        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);

    }

    @Test

    public void testSubtraction() {

        Calculator calculator = new Calculator();

        double result = calculator.subtract(5.0, 3.0);

        assertEquals(2.0, result, 0.01);

    }

    @Test

    public void testMultiplication() {

        Calculator calculator = new Calculator();

        double result = calculator.multiply(5.0, 3.0);

        assertEquals(15.0, result, 0.01);

    }

    @Test

    public void testDivision() {

        Calculator calculator = new Calculator();

        double result = calculator.divide(10.0, 2.0);

        assertEquals(5.0, result, 0.01);

    }

} 