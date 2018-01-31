package sortstudy;

public class SleepSort {
    public void sort(int []a){
        int N = a.length;
        Thread[] threads = new Thread[N];
        PrintArray[] printArrays = new PrintArray[N];
        for (int i = 0;i < N;i++){
            printArrays[i] = new PrintArray(a[i]);
            threads[i] = new Thread(printArrays[i]);
        }
        for (int i = 0;i < N;i++){
            threads[i].start();
        }
    }
}
