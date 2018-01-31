package exceptionstudy;

public class ActionAfterTry {
    public static void main(String[] args) {
        rightCatch();
    }

    static void rightCatch(){
        int a[] = new int[3];
        for(int i = 0;i < 3;i++){
            a[i]=i;
        }
        try{
            a[3]=1;
            System.out.println("然而这句不会执行，因为try中一旦出现了错误，下一步就不会执行");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("捕获到了越界异常");
            //do nothing
        }
        System.out.println("catch到正确的异常会继续执行");
    }

    static void wrongCatch(){
        int a[] = new int[3];
        for(int i = 0;i < 3;i++ ){
            a[i] = i;
        }
        try {
            a[3] = 1;
        }catch (NoClassDefFoundError e){
            System.out.println("捕获到了错误的异常");
        }
        System.out.println("尝试catch错误的异常会正确执行");
    }

    static void noCatch(){
        int a[] = new int[3];
        a[3] = 1;
        System.out.println("没有捕获异常，程序会接着向下执行");
    }
}
