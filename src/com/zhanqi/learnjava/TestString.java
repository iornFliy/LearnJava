package com.zhanqi.learnjava;

import java.lang.*;

public class TestString {
    public static void main(String[] args){
        String s = "abc123AaBCc321";
        StringBuffer ss = new StringBuffer("abc123");
        System.out.println(s.charAt(3));
        System.out.println(s.indexOf("A"));
        System.out.println(s.indexOf("a", 2));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.lastIndexOf("2", 0));
        System.out.println(s.startsWith("abc", 1));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 3));
        System.out.println(s.replace("abc", "ABC"));
        System.out.println(s.replaceAll("2", "0"));
        System.out.println(ss.append("ABC"));
        System.out.println(ss.insert(2, "C"));
        System.out.println(ss.delete(0, 2));
    }
}

