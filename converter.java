package com.basicsinjava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        // if(true){
        //     System.out.println("Hello");
        // }

        // int i = 1;
        // while(i<=5){
        //     System.out.println(i);
        //     i++;
        // }

        // for( int i = 0; i<=6; i++){
        //     System.out.println(i);
        // }

        float tempC = sc.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}
