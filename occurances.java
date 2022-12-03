package com.basicsinjava;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int check = sc.nextInt();
        for(int i=0; n>0; i++){
            if((n%10)==check){
                count = count+1;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
