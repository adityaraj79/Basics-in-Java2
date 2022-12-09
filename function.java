package com.basicsinjava;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int ans  = sum();
        System.out.println(ans);
    }

    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int y = sc.nextInt();
        int sum = x+y;
        System.out.print("The sum is: ");
        return sum;
    }
}
