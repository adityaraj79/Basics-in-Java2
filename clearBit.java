package com.basicsinjava;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();                          // clearBit: to make the ith bit 0
        int bitmask = 1<<pos;
        int notBitMask = ~(bitmask);
        int newNumber = (notBitMask & n);
        System.out.println(newNumber);
    }
}

