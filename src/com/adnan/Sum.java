package com.adnan;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
//	sum();
        int ans = sum2();
        System.out.println(ans);
    }

    //function returning a value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number  : ");
        int num1 = in.nextInt();
        System.out.println("Enter second number : ");
        int num2 = in.nextInt();
        System.out.println("sum is : ");
        int sum = num1+num2;
        return sum;

    }

    static void sum (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number  : ");
        int num1 = in.nextInt();
        System.out.println("Enter second number : ");
        int num2 = in.nextInt();
        System.out.println("sum is : ");
        int sum = num1+num2;
        System.out.println(sum);


    }


    // returntype name (parameters){
    //        body
    // return statement;
    //}


}
