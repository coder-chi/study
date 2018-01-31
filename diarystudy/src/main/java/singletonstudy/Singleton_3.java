package singletonstudy;

/**
 *
 * 饿汉
 */
public class Singleton_3 {
    private static Singleton_3 instance = new Singleton_3();
    private Singleton_3(){}
    public static Singleton_3 getInstance(){
        return instance;
    }
}
