package com.kgisl.JunitTestSample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
public class CalculatorTest {
    @BeforeClass
    public static void setup() {
      System.out.println("Before class");
    }
   
    @Before
    public void setupThis() {
      System.out.println("Before");
    }
   
    @Test
    public void method() {
      Calculator c=new Calculator();
      int expected=5;
      int actual = c.add(2,3);
      //Assert.assertEquals(expected,actual);
      assertEquals(expected,actual);
    }
    @Test
    public void method1() {
      System.out.println("method1");
    }
    @Test
    public void method2() {
      System.out.println("method2");
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
