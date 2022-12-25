package com.basicsinjava;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[][] arr = {
            {2, 12, 4},
            {18, 12, 3, 9},
            {78, 99, 34, 56}
        };
        int target = 12;
        search(arr, target);        
    }

    static void search(int[][] arr, int target){
        int flag = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(target == arr[i][j]){
                    System.out.println("Found at index:"+" "+i+","+j);
                    flag = 1;
                }
            }
        }
        if(flag!=1){
            System.out.println("Not found!");
        }
    }
} 
