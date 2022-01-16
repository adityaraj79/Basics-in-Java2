package com.basicsinjava;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitmask = 1<<pos;

        if((bitmask & n) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }

    }
}

