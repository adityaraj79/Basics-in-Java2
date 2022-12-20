package com.basicsinjava;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        fun(2,3,5,23,45,67,123,456);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
