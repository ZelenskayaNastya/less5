package com.company;

public class MyThread extends Thread{

    public synchronized void run(){
        System.out.println(this.getState());
//        synchronized (this) {
//        System.out.println("Привет, Java");

            try {
                sleep(1000);
//                System.out.println(this.getState());

            } catch (Exception e) {

            }

    }

}
