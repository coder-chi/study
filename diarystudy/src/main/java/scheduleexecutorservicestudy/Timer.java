package scheduleexecutorservicestudy;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Timer {
    /**
     * 以固定周期频率执行任务
     */
    public static void executeFixedRate(){
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(
                new EchoServer(),
                0,
                100,
                TimeUnit.MILLISECONDS
        );
    }
    /**
     * 以固定延迟时间进行执行
     * 本次任务执行完成后，需要设定延迟时间才会执行新的任务
     */
    public static void executeFixedDelay() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleWithFixedDelay(
                new EchoServer(),
                0,
                100,
                TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) {
        executeFixedDelay();
    }
}
