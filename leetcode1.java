package com.basicsinjava;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[] arr = {12, 23, 2, 5232, 9865};
        even(arr);
    }

    static void even(int[] arr){
        int count = 0;
        int c=0;
        for(int i=0; i<arr.length; i++){
            for(count = 0; arr[i]!=0; count++){
                arr[i] = arr[i]/10;
            }
            if(count%2==0){
                c=c+1;
            }
        }
        System.out.println(c);
        
    }
}  
