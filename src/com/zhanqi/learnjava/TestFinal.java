package com.zhanqi.learnjava;

import java.util.Random;

class Person{
    private String name;

    Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}


public class TestFinal {
    private final String final_01 = "chenyao";
    private final String final_02;

    private static Random random = new Random();
    private final int final_03 = random.nextInt();

    public final Person final_04 = new Person("chenyao");

    TestFinal(String final_02){
        this.final_02 = final_02;
    }

    public String toString(){
        return "final_01 = " + final_01 +" final_02 = " + final_02 + "  final_03 = "+ final_03 + " final_04 = " + final_04.getName();
    }

    public static void main(String[] args){
        System.out.println("------------第一次创建对象------------");
        TestFinal final1 = new TestFinal("cm");
        System.out.println(final1);
        System.out.println("------------第二次创建对象------------");
        TestFinal final2 = new TestFinal("zj");
        System.out.println(final2);
        System.out.println("------------修改引用对象--------------");
        final2.final_04.setName("chenssy");
        System.out.println(final2);
    }
}
