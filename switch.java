package com.basicsinjava;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // String fruit  = sc.next();

        // switch(fruit){
        //     case "mango":
        //           System.out.println("King of the fruits");
        //           break;
        //     case "apple":
        //           System.out.println("a red sweet fruit");
        //           break;
        //     case "orange":
        //         System.out.println("a round fruit");
        //         break;
        //     default:
        //         System.out.println("Invalid key");                
        // }

        int day = sc.nextInt();

        // switch(day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        // }

        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekdays");
                break;
            case 6:
            case 7:
                System.out.println("weekends");
                break;

        }
    }
}
