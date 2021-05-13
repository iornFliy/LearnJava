package com.learn.concurrent;

import jdk.nashorn.internal.ir.WhileNode;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Date;

/**
 * 在ktv中，服务员每隔一段时间就报时一次，但是等所有的包厢都没人了就停止报时
 * */

class Box extends Thread{
    private String name;
    private int seconds;

    public Box(String name, int seconds){
        this.name = name;
        this.seconds = seconds;
    }

    public void run(){
        try{
            System.out.println("我们是包厢"+this.name);
            Thread.sleep(this.seconds*1000);
            System.out.println("我们是包厢"+this.name+"我们结账了.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}


class Waiter extends Thread{
    public void run(){
        while (true) {
            try {
                System.out.println("现在时间是" + new java.util.Date());
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class UseDemon {
    public static void main(String[] args){
        Box b1 = new Box("a", 3);
        Box b2 = new Box("b", 5);
        Box b3 = new Box("c", 2);
        Box b4 = new Box("d", 8);

        Waiter w = new Waiter();
        w.setDaemon(true);


        b1.start();
        b2.start();
        b3.start();
        b4.start();

        w.start();
    }
}
