package com.zhanqi.learnjava;

abstract class Animal{
    Animal(){
        System.out.println("我是一个动物.");
    };

    public void born(){
        System.out.println("我是胎生的.");
    }

    // 定义两个抽象方法，子类必须把这两个抽象方法全部实现
    public abstract void eat();
    public abstract void walk();
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫在吃.");
    }

    public void walk(){
        System.out.println("猫在走.");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗在吃.");
    }

    public void walk(){
        System.out.println("狗在走.");
    }
}

class TestAbstract{
    public static void main(String[] args){
        Cat c = new Cat();
        c.eat();
        c.walk();

        Dog d = new Dog();
        d.eat();
        d.walk();
    }
}