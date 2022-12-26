package com.basicsinjava;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[][] arr = {{1,3,4,11}, {2,5,1}, {3,2,6}};
        search(arr);
    }

    static void search(int[][] arr){
        int max=0;
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                count= count+arr[i][j];
            }
            
            if(count>max){
                max=count;
            }
            count=0;
        }
        System.out.println(max);
        
    }
}  
