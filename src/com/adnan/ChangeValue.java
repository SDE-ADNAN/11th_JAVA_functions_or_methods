package com.adnan;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[]arr= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Change(int[]nums){
        nums[0] = 99;
    }
}
