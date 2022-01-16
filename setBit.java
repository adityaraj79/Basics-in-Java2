package com.basicsinjava;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();             // setBit: to make the ith bit 1
        int bitmask = 1<<pos;
        int newNumber = (bitmask|n);
        System.out.println(newNumber);
    }
}

