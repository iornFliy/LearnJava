package com.zhanqi.learnjava;

class Wine{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Wine(){
    }

    public String drink(){
        return "喝的是 "+ getName();
    }

    public String soString(){
        return null;
    }
}


class JNC extends Wine{
    public JNC(){
        setName("JNC");
    }

    public String drink(){
        return "喝的是 " + getName();
    }

    public String toString(){
        return "Wine : " + getName();
    }
}

class JGJ extends Wine{
    public JGJ(){
        setName("JGJ");
    }

    public String drink(){
        return "喝的是 "+getName();
    }

    public String toString(){
        return "Wine :" + getName();
    }
}


public class TestPolymorphism {
    public static void main(String[] args) {
        Wine[] wines = new Wine[2];

        JNC jnc = new JNC();
        JGJ jgj = new JGJ();

        wines[0] = jnc;
        wines[1] = jgj;

        for(int i = 0; i < 2; i++){
            System.out.println(wines[i].toString() + "--" + wines[i].drink());
        }
        System.out.println("-------------------------------");
    }
}


