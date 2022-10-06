package com.company.java_core.homework20.task1;

import java.util.Arrays;
import java.util.Scanner;

public class MyThread extends Thread{
    Scanner sc = new Scanner(System.in);

    private int[] fibonacci;
    private int delay;

    public MyThread(int[] fibonacci, int delay) {
        this.fibonacci = fibonacci;
        this.delay = delay;
    }

    @Override
    public void run() {
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Fibonacci : " + Arrays.toString(fibonacci) + "---" + i);
            if (i == 19)
                System.out.println("Thread :" + Arrays.toString(fibonacci) + " is done");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
