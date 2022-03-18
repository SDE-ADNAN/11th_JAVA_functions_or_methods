package com.adnan;

public class Function_Overloading {
    public static void main(String[] args) {
        // function overloading is only done when two or more functions of same name exist
        // but have different no.of or typeof parameters while declaring the functions
        // function overloading happens in compiletime when our code is being compiled .
    }

    // 1st declaration of func with parameter int a;
    static void func(int a){
        System.out.println(a);
    }

    // 2nd declaration of func with parameter int a, int b;
    static void func(int a,int b){
        System.out.println(a);
    }

    // 3rd declaration of func with parameter String a;
    static void func(String a){
        System.out.println(a);
    }

    static void func(int a ,String ev){
        System.out.println(a);
    }
}
