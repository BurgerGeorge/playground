package org.young.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest {
    public static AtomicInteger ti = new AtomicInteger(0);

    public void increase() {
        ti.getAndIncrement();
    }

    public static void main(String[] args) throws Exception {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        VolatileTest vt = new VolatileTest();
        long start = System.currentTimeMillis(); //
        for (int i = 0; i < 5; i++) {
            threadPool.execute(() -> {
                for (int j = 0; j < 500; j++) {
                    vt.increase();
                }
            });
        }
        long end = System.currentTimeMillis(); //
        System.out.println("共耗时>>" + (end - start) + "ms");

        Thread.sleep(2000);
        System.out.println(ti);
        threadPool.shutdown();
    }
}
