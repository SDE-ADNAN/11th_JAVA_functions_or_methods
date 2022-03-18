package com.adnan;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b = 20;
//        System.out.println(num); // not available here as it is defined in another function

        { // block start
            a= 20; // can change any variable's value  but cannot initialize a variable with same variable name
            int as = 33;
        } //block end
        System.out.println(a);
//        System.out.println(as);  // as variable is not available here due to restrictions of block scope
    }

    static void random(){
        int num =45;
        System.out.println(num);
    }
}

