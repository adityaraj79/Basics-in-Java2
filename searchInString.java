// package com.basicsinjava;

// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          String name = "Aditya";
//          char target = 's';

//         search(name, target);
//     }

//     static void search(String str, char target){
        
//         int flag=0;
//         for(int i = 0; i < str.length(); i++){
//             if(target == str.charAt(i)){
//                 System.out.println("target present at: "+" "+i);
//                 flag=1;
//             }
//         }
//         if(flag!=1){
//             System.out.println("not found!");
//         }
//     }
// }

package com.basicsinjava;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String name = "Aditya";
        char target = 's';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}    
