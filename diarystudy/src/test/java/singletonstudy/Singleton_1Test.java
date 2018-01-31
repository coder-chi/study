package singletonstudy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Singleton_1Test {
    @Test
    public void getInstance() throws Exception {
        Singleton_1 instance_1 = Singleton_1.getInstance();
        Singleton_1 instance_2 = Singleton_1.getInstance();
        assertEquals(instance_1,instance_2);
    }

}