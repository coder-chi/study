package singletonstudy;

public class Singleton_5 {
    private volatile static Singleton_5 instance;
    private Singleton_5(){}
    public static Singleton_5 getInstance(){
        if(instance == null){
            synchronized (Singleton_5.class){
                if (instance == null){
                    instance = new Singleton_5();
                }
            }
        }
        return instance;
    }
}
