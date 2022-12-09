package com.basicsinjava;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int empID = sc.nextInt();
        String department = sc.next();

        switch(empID){
            case 1:
                System.out.println("Aditya Raj");
                break;
            case 2:
                System.out.println("Aman Raj");
                break;
            case 3:
                System.out.println("Employ no 3");

                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management quota");
                        break;
                    default:
                        System.out.println("Enter valid department");   
                        break; 
                }
                break;
            default:
                System.out.println("Enter correct empID");         
        }
    }
}
