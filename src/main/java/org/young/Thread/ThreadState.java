package org.young.Thread;

public class ThreadState {
    static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                while (running) {
                    System.out.println("ti即将睡眠");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("t1此时的状态：" + t1.getState());
        t1.start();
        Thread.sleep(2000);
        running = false;
        Thread.sleep(2000);
        System.out.println("t1此时的状态：" + t1.getState());
    }
}
