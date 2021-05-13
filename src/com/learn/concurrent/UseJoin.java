package com.learn.concurrent;


/**
 * 四个人打麻将，必须等四个到齐了才能开局
 * */


class Player extends Thread{
    private String name;
    private int seconds;

    public Player(String name, int seconds){
        this.name = name;
        this.seconds = seconds;
    }

    public void run(){
        try {
            System.out.printf("我是%s, 我出发了.\n", this.name);
            Thread.sleep(this.seconds * 1000);
            System.out.printf("我是%s, 我到了，花费了%d 秒.\n", this.name, this.seconds);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}


public class UseJoin {
    public static void main(String[] args) throws Exception{
        Player p1 = new Player("甄子丹",1);
        Player p2 = new Player("成龙", 2);
        Player p3 = new Player("赵文卓", 1);
        Player p4 = new Player("李小龙",3);

        p1.start();
        p2.start();
        p3.start();
        p4.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();

        System.out.println("人到齐了，开局.");
    }
}
