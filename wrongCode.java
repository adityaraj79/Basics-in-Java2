package com.basicsinjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=T; i++){
            int a= sc.nextInt();
            for (int j = 1; j<=a; j++){
                int ans = sum + a;
                System.out.println(ans);
            }
        }
    }
}
