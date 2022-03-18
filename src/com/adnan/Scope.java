package com.adnan;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b = 20;
//        System.out.println(num); // not available here as it is defined in another function
    }

    static void random(){
        int num =45;
        System.out.println(num);
    }
}

