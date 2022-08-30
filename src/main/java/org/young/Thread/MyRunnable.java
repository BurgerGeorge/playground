package org.young.Thread;

public class MyRunnable implements Runnable{
    private final String command;

    public MyRunnable(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ">>>started");
        System.out.println("[command]:" + command);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ">>>ended");
    }

    @Override
    public String toString() {
        return this.command;
    }
}
