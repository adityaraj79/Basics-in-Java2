package com.basicsinjava;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        fun();
        multiple(2,13 ,"Aditya", "Aman");
    }

    static void multiple(int a,int b, String ...v){  //varags should always come at the end
        System.out.println();
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
