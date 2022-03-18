package com.adnan;

public class Function_returning_string_value {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        int Sum = sum(20,30);

        System.out.println(Sum);

    }

    //pass the values while function call
    static int sum(int a ,int b){
        return a+b;
    }

     public static String greet(){
        String greet = "hello how are  u  ....";
        return greet;
    }
}
