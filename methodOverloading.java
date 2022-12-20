package com.basicsinjava;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        fun(14);
        fun("Aditya");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){    // no of arguments or types of arguments should be different if function name is same
        System.out.println(name);
    }
}
