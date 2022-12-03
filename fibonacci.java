package com.basicsinjava;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nos");
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int temp = b;
            b+=a;
            a = temp;
        }
        System.out.println(b);
    }
}
