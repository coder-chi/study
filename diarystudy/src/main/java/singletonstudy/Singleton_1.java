package singletonstudy;

/**
 *
 * 懒汉，线程不安全
 */

public class Singleton_1 {
    private static Singleton_1 instance;
    private Singleton_1(){}

    public static Singleton_1 getInstance(){
        if(instance == null){
            instance = new Singleton_1();
        }
        return instance;
    }
}
