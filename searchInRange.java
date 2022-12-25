package com.basicsinjava;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String name = "Aditya";
         char target = 'a';
         int a = 1;
         int b = 4;
        search(name, target, a, b);
    }

    static void search(String str, char target, int a, int b){
        
        int flag=0;
        for(int i = a; i <= b; i++){
            if(target == str.charAt(i)){
                System.out.println("target present at: "+" "+i);
                flag=1;
            }
        }
        if(flag!=1){
            System.out.println("not found!");
        }
    }
}

// package com.basicsinjava;

// import java.util.Arrays;
// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args) {
//         String name = "Aditya";
//         char target = 'y';
//         int a = 1;
//         int b = 4;
//         System.out.println(search(name, target, a, b));

//         System.out.println(Arrays.toString(name.toCharArray()));
//     }
//     static boolean search(String str, char target, int a, int b){
//         if(str.length() == 0){
//             return false;
//         }

//         for(int i=a; i<=b; i++){
//             if(target == str.charAt(i)){
//                 return true;
//             }
//         }
//         return false;
//     }
// }    
