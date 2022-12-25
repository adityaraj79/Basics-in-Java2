package com.basicsinjava;

import java.util.Scanner;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
         System.out.println("Hello!");

         Scanner sc = new Scanner(System.in);
         int[] arr = {2, 21, 32, 323, 87, 132};

         System.out.print("Enter the searching element: ");
         int n = sc.nextInt();
         search(arr, n);
         
    }

    static void search(int arr[], int n){
        int flag = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                System.out.println("Present at index :"+" "+i);
                flag = 1;
                break;
            }
         }
         if(flag!=1){
            System.out.println("not found!");
         }
    }
}
