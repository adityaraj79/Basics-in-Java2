package com.basicsinjava;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};

        for(int i = 0; i<arr.length; i++ ){
            for(int j = 0; j<arr.length-i-1; j++ ){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
