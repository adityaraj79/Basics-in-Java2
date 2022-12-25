package com.basicsinjava;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[] arr = {18, -1, 7, 13, 14, 28};
        mini(arr);
    }

    static void mini(int arr[]){
        int min = arr[0];

        for(int i = 1; i<arr.length; i++){
    
            if(arr[i]<min){
                min = arr[i];
            }    
        }
        System.out.println(min);
    }
}
