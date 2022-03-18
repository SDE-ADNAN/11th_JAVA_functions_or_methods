package com.adnan;

public class Function_returning_string_value {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        String Cgreet = CustomGreet("'ADNAN KHAN'");
        System.out.println(Cgreet);
    }

    private static String CustomGreet(String a) {
        String variable = "Hello  "+a;
        return variable;
    }


    public static String greet(){
        String greet = "hello how are  u  ....";
        return greet;
    }
}
