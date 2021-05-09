package com.zhanqi.learnjava;

//计算器的借口
interface ICalculator{
    public void KeyBoard();
}

// mp3的接口
interface IMp3{
    public void Headset();
}

// 声明一个计算机借口，定义了键盘，鼠标，耳机方法，成员变量cpu
interface IComputer extends ICalculator, IMp3{
    String Cpu = "intel";
    public void Mouse();
}

// xbox 接口
interface IXbox{
    //提供了手柄方法
    public void handle();
}

class MAC implements IComputer{
    public void KeyBoard(){
        System.out.println("苹果自带键盘");
    };
    public void Mouse(){
        System.out.println("苹果自带鼠标");

    };
    public void Headset(){
        System.out.println("苹果自带耳机");

    };
}

class PC implements IComputer, IXbox{
    String cpu = "amd";

    public void KeyBoard(){
        System.out.println("罗技键盘");
    };
    public void Mouse(){
        System.out.println("罗技鼠标");
    };
    public void Headset(){
        System.out.println("罗技耳机");
    };
    // 实现IXbox接口中的方法
    public void handle(){
        System.out.println("北通游戏手柄");
    };
}




// 平板电脑类，并没有实现借口中所有的方法，所以要声明为抽象类。
abstract class TabletPC implements IComputer{
    public void KeyBoard(){
        System.out.println("内置键盘");
    };
    public void Headset(){
        System.out.println("线控耳机");
    };
}


class Ipad extends TabletPC{
    public void Mouse(){
        System.out.println("IPad专属鼠标。");

    };
}

public  class TestInterface{
    public static void main(String[] args){
        PC p = new PC();
        p.KeyBoard();
        p.Headset();
        p.Mouse();
    }
}