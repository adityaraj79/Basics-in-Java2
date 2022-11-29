package com.basicsinjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            //float i = sc.nextFloat();
            //System.out.println(i);
        
        //type casting
        // int num = (int)(67.34f);
        // System.out.println(num);

        // int a = 257;
        // byte b = (byte)(a);
        // System.out.println(b);   //257 % 256 = 1

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a * b) / c;
        // System.out.println(d); 

        // int numb = 'A';
        // System.out.println(numb);

        // System.out.println(3 * 3.9f);
         
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
        //float + int - double = double
        System.out.println((f*b) +" "+ (i/c) +" "+ (d*s));
        System.out.println(result);
    }
}
