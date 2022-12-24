package com.basicsinjava;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[] nums = {1 ,23, 34, 45, 56};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));
        
    } 

    static void change(int[] arr){
        arr[1] = 99; 
    }
}


