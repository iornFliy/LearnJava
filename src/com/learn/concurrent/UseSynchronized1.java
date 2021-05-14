package com.learn.concurrent;

/**
 * 几个售票员同时卖票，直到把票卖完, 如果解决同一张票被多次卖出
 * */

class Saler extends Thread {
    private String name;
    private static int tickets = 100; //票数 , 一定要设置成静态成员变量，否则会变成每个售票员都有100张票
    private static Object lock = new Object();

    public Saler(String name){
        this.name = name;
    }

    public void run(){
        while (true){
            if (this.tickets > 1){
                synchronized (lock){   //取票，卖票这个动作要加同步
                    int tmp = this.tickets;
                    tmp = tmp -1;
                    this.tickets = tmp;
                    System.out.println(this.name + ":"+ this.tickets);
                }
                try {
                    Thread.sleep(100);   //加sleep是为了引出同一张票多次售出的现象
                }
                catch (Exception e){}
            }
            else {
                return;
            }
        }
    }
}

public class UseSynchronized1 {
    public static void main(String[] args){
        Saler s1 = new Saler("Marry");
        Saler s2 = new Saler("jhon");
        Saler s3 = new Saler("Jack");

        s1.start();
        s2.start();
        s3.start();
    }
}
