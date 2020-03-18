package by.itstep.goryachev.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorImplTest {
    CalculatorImpl calculator  = new CalculatorImpl();

    @Before
    public void setUp() throws Exception {
//        calculator = new CalculatorImpl();
    }
    int expected = calculator.sum(20,20);
    @Test
    public void sum() throws Exception {
        assertEquals(40, expected);
    }
//
//    @Test
//    public void diff() throws Exception {
//        assertEquals (1,calculator.diff(20,20));
//    }
//
//    @Test
//    public void mul() throws Exception {
//        fail("Not implemented");
//    }
//
    @Test
    public void div() throws Exception {
        assertEquals(1,calculator.div(20,20), 0.00001);
        assertEquals (0.5, calculator.div(20,40), 0.0001);
    }


}