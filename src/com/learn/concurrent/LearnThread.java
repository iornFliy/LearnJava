package com.learn.concurrent;

class ThreaDemo extends Thread{

        private String name;
        private int seconds;

        public  ThreaDemo(String name, int seconds){
            this.name = name;
            this.seconds = seconds;
        }

    public void run() {
            while (true){
                Thread.currentThread().setName(this.name);
                System.out.println("My name is "+Thread.currentThread().getName()+", I am runing!");
                yield();
            }
    }
}


class LearnThread{
    public static void main(String[] args){
        ThreaDemo t1 = new ThreaDemo("t1", 8);
        ThreaDemo t2 = new ThreaDemo("t2", 8);
        t1.start();
        t2.start();
    }
}
