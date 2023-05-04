package com.kgisl.JunitTestSample;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class ParameterizedCalculatorTest {
    private int firstNumber;
    private int secondNumber;
    private int expected;
    private Calculator calculator;
    
    public ParameterizedCalculatorTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }
    
    @BeforeClass
    public static void setup() {
      System.out.println("Before class");
    }
   
    @Before
    public void setupThis() {
      System.out.println("Before");
      calculator=new Calculator();
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{{1,2,3},{10,20,30}});
    }
    @Test
    public void method() {
      System.out.println("method2");
      System.out.println("Sum of numbers = "+expected);
      assertEquals(expected, calculator.add(firstNumber,secondNumber));
    }
    @After
    public void tearThis() {
      System.out.println("After");
    }
    @AfterClass
    public static void tear() {
      System.out.println("After class");
    }
}
