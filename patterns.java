package com.basicsinjava;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
        System.out.println(" ");
        pattern2(n);
        System.out.println(" ");
        pattern3(n);
        System.out.println(" ");
        pattern4(n);
        System.out.println(" ");
        pattern5(n);
        System.out.println(" ");
        pattern6(n);
        System.out.println(" ");
        pattern7(n);
        System.out.println(" ");
        pattern28(n);
        System.out.println(" ");
        pattern30(n);
        System.out.println(" ");
        pattern17(n);
        System.out.println(" ");
        pattern31(n);
    }

    static void pattern1(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            } 
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row = 1; row<=n ;row++){
            for(int col = 1; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row = n; row>=1 ;row--){
            for(int col = 1; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i = 1; i<=(2*n)-1; i++){
            int tj = i>n ? 2*n - i : i;
            for(int j = 1; j<=tj; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<i-1; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for(int i = 1; i<=(2*n)-1; i++){
            int tj_space = i>n ? i-n : n-i;
            int tj_star = i>n ? 2*n-i : i;

            for(int j = 1; j<=tj_space; j++){
                System.out.print(" ");
            }

            for(int j = 0; j<tj_star; j++){
                System.out.print("* ");
            }
            
                             //OR
            // if(i<=n){
            //     for(int j = 1; j<n-i+1; j++){
            //         System.out.print(" ");
            //     }
            //     for(int j =0; j<i; j++){
            //         System.out.print("* ");
            //     }
            // }else if(i>n){
            //     for(int j = 1; j<=i-n; j++){
            //         System.out.print(" ");
            //     }
            //     for(int j = 0; j<n+5-i; j++){
            //         System.out.print("* ");
            //     }
            // }
            System.out.println();
        }
    }
    
    static void pattern30(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int i = 1; i<=2*n-1; i++){
            int c = i>n ? 2*n-i : i;

            for(int j = 1; j<=n-c; j++){
                System.out.print("  ");
            }
            for(int j = c; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j = 2; j<=c; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int originalN = n;
        n = 2*n;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j<=n; j++){
                int atEachIndex = originalN - Math.min(Math.min(i, j), Math.min(n-i, n-j) );
                System.out.print(atEachIndex + " ");
            }
            System.out.println();
        }
    }

}
