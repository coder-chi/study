package junitstudy;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {
    @Test
    public void sayHello() throws Exception {
        new Hello().sayHello();
    }

}