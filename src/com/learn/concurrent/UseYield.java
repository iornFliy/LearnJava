package com.learn.concurrent;


class MyThread extends Thread{
    public void run(){
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            }
            catch (Exception e){}
            Thread.yield();
        }
    }
}

public class UseYield {
    public static void main(String[] args){
            MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();

            t1.start();
            t2.start();
    }
}
