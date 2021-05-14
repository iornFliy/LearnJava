package com.learn.concurrent;

/**
 * 几个售票员同时卖票，直到把票卖完, 如果解决同一张票被多次卖出,将票池和售票员分开来。
 * */

class TicketPool{
    private int tickets = 100;

    public synchronized int getTicket(){
        if (tickets > 0) {
            int tmp = tickets - 1;
            tickets = tickets - 1;
            return tmp;
        }
        else{
            return 0 ;
        }
    }
}

class Saler1 extends Thread{
    private String name;
    private TicketPool pool;

    public Saler1(String name, TicketPool pool){
        this.name = name;
        this.pool = pool;
    }

    public void run(){
        while (true) {
            int no = this.pool.getTicket();
            if (no > 0) {
                System.out.println(this.name + ":" + no);
                try {
                    Thread.sleep(100);
                }
                catch (Exception e){}
//                yield();
            }
            else {
                return;
            }
        }
    }
}

class UseSynchronized2{
    public static void main(String[] args){
        TicketPool pool = new TicketPool();

        Saler1 s1 = new Saler1("Marry", pool);
        Saler1 s2 = new Saler1("john", pool);
        Saler1 s3 = new Saler1("Jack", pool);

        s1.start();
        s2.start();
        s3.start();
    }
}