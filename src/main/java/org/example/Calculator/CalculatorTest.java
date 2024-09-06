package org.example.Calculator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator;
    final int a = 10;
    final int b = 5;

    @BeforeClass
    public void setCalculator(){
        calculator = new Calculator();
    }

    @Test(priority = 1, description = "Додавання")
    public void testAddition() {
        int result = calculator.add(a,b);
        System.out.println("Додавання " + a + " + " + b + " = " + result);
    }
    @Test(priority = 2, description = "Віднімання")
    public void testSubtraction(){
        int result = calculator.subtract(a,b);
        System.out.println("Віднімання " + a + " - " + b + " = " + result);
    }
    @Test(priority = 3, description = "Множення")
    public void testMultiplication() {
        int result = calculator.multiply(a,b);
        System.out.println("Множення " + a + " * " + b + " = " + result);
    }
    @Test(priority = 4, description = "Ділення")
    public void testDivision() {
        double result = calculator.divide(a,b);
        System.out.println("Ділення " + a + " / " + b + " = " + result);
    }
    @Test(priority = 5, description = "Ділення на нуль", expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        calculator.divide(a, 0);
    }

    @AfterClass
    public void cleaner(){
        calculator = null;
    }
}
