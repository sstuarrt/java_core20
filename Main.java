package com.company.java_core.homework20.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyThread myThread = new MyThread(new int[]{sc.nextInt()}, 1);
        myThread.start();

        RunnableThread runnableThread = new RunnableThread("MyRunnable", 1);

    }
}
