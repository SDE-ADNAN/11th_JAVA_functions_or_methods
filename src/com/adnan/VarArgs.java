package com.adnan;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // variable length arguments
        // we use varargs when no.of arguments is not known to us
        fun(1,2,3,4,5,6);
        multiDataTypeArgs(1,2,"adnan", "khan");
    }
    // here it can be any datatype
    // and also any array name instead of ...v i.e ...s/...d/...a each one is acceptable
    // the main part is the (...) operator responsible for varargs/variableLengthArguments;
    // the varargs must be in the last of multiple types args or this will throw error;
    // u cannot skip the sequence of methods parameters with different args; i.e sequence of param == sequence of arguments


    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiDataTypeArgs(int a,int b,String ...s ){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(s));
    }
}
