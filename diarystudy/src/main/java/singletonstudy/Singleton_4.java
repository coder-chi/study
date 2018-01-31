package singletonstudy;

/**
 *
 * 静态内部类
 */
public class Singleton_4 {
    private static class SingletonHolder{
        private static final Singleton_4 INSTANCE = new Singleton_4();
    }
    private Singleton_4(){}
    public static final Singleton_4 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
