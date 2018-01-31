package junitstudy;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void factorial() throws Exception {
        assertEquals(120,new Math().factorial(5));
    }

    @Test (expected = RuntimeException.class)
    public void testFactorial() throws Exception{
        new Math().factorial(-1);
        fail("factorial参数为负数没有抛出异常");
    }

    @Test(timeout = 1000)
    public void testSpeedFactorial() throws Exception{
        new Math().factorial(10);
    }
}