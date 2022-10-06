package com.company.java_core.homework20.task1;

public class RunnableThread implements Runnable{
    private String name;
    private int delay;
    private Thread thread;

    public RunnableThread(String name, int delay) {
        this.name = name;
        this.delay = delay;
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Name : " + name + "---" + i);
            if (i == 19)
                System.out.println("Thread :" + name + " is done");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
