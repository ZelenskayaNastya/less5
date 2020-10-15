package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2= new MyThread();
        System.out.println(thread1.getState());


        thread1.start();
        System.out.println(thread1.getState());

        thread2.start();
        thread2.join();
        System.out.println(thread1.getState());


        thread1.interrupt();
        if (thread1.isInterrupted())
        System.out.println(thread1.getState());

    }

}
