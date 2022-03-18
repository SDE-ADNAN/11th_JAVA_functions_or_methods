package com.adnan;

public class Shadowing {
    static int x = 5; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //5

        int x;//the class variable at line 4 is being shadowed by this x variable
      // System.out.println(x); // this will show error as we have declared the x variable at line 8 but
                                // not initialized the x variable
        x = 1000;
        System.out.println(x); //1000
        fun();
    }

    static void fun() {
        System.out.println(x);//5
    }
}
