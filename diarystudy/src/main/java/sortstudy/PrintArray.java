package sortstudy;

public class PrintArray implements Runnable{
    private int index;
    public PrintArray(int index){
        this.index = index;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(index*1000);
            System.out.println(index);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
