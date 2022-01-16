package com.basicsinjava;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = sc.nextInt();
        int pos = sc.nextInt();                          // updateBit: to change the ith bit
        int bitmask = 1<<pos;
        int notBitMask = ~(bitmask);
        if(oper==0){
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }else{
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        }
    }
}

