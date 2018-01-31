package junitstudy;

public class Math {
    public int factorial(int n) throws RuntimeException, InterruptedException {
        if(n < 0){
            throw new RuntimeException("负数没有阶乘");
        }else if(n <= 1){
            return 1;
        }else {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new InterruptedException("产生中断异常");
            }
            return n * factorial(n-1);
        }
    }
}
