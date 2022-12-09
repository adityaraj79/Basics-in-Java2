package com.basicsinjava;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int arr[] = {1,3,65,7,9};
        change(arr);
        System.out.println(arr[0]); 
    }

    static void change(int num[]){
        num[0] = 99;
        // if you make a change in the object via reference variable, same object will be changed.
        //if you create a new object in reference variable, previous object will not changed.
    }
}
