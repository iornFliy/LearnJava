package com.zhanqi.learnjava;


class MyException1 extends Exception{

}


class MyException2 extends Exception{
    MyException2(Throwable cause){
        super(cause);
    }

    MyException2(){
        super();
    }
}

class A{
    public void f() throws MyException2{
        try {
            g();
        } catch (MyException1 e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            //这里做了修改
            throw new MyException2(e);
        }
    }
    public void g() throws MyException1{
        throw new MyException1();
    }
}

public class TestException {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.f();
        } catch (MyException2 e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

