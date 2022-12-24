package com.basicsinjava;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
          1  2  3
          4  5  6
          7  8  9
        */

        //  int[][] arr = new int[3][];    or,

        // int[][] arr = {
        //     {1,2,3}, 
        //     {4,5}, 
        //     {6,7,8,9}
        // };
        // System.out.println(Arrays.toString(arr[2]));

        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        //input
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // output
        // for(int row = 0; row<arr.length; row++){
        //     for(int col = 0; col<arr[row].length; col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }   //or,
        
        for(int row = 0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        } 
    }
}
