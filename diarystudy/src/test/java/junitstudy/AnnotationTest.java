package junitstudy;

import org.junit.*;

public class AnnotationTest {

    int i = 0;

    public AnnotationTest(){
        System.out.println("构造方法");
    }

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("AfterClass");
    }

    @Before
    public void setUp(){
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        System.out.println("After");
    }

    @Test
    public void test1(){
        i++;
        System.out.println("test1的i为 " + i);
    }

    @Test
    public void test2(){
        i++;
        System.out.println("test2的i为 " + i);
    }

    @Ignore
    public void test3(){
        System.out.println("test3");
    }
}
