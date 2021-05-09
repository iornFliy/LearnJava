package com.zhanqi.learnjava;

//class Benz{
//    private Engine engine = new Engine();
//    private String color = "black";
//    private int tires;
//
//    class Engine{
//        private int power;
//        public void fire() {
//            System.out.print(color + "里面点火");
//        }
//    }
//
//    public void run(){
//        new Engine().fire();
//        System.out.println("开跑...");
//    }
//}
//
//class Engine{
//    private int power;
//    public static void fire(){
//        System.out.println("外面点火.");
//    }
//}


abstract class Bird{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract int fly();
}

class Test{
    public void test(Bird bird){
        System.out.println(bird.getName() + "能够飞" + bird.fly() + "米");
    }

    public static void main(String[] args){
        Test test = new Test();
        test.test(new Bird() {
        public int fly(){
            return 10000;
        }
        public String getName(){
            return "大雁";
        }
        });
    }
}