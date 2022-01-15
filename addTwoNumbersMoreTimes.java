package com.basicsinjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i<=T; i++){
            for(int j = 1; j<=T; j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int ans = a+b;
                System.out.println(ans);
            }
        }
    }
}
