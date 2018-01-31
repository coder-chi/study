package scheduleexecutorservicestudy;

public class EchoServer implements Runnable{
    public void run(){
        try{
            System.out.println("This is a echo server, mission is start, the current time is " +
                System.currentTimeMillis());
            Thread.sleep(50);
            System.out.println("This is a echo server, mission is end, the current time is " +
                System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
