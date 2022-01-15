package com.basicsinjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("tony");
        System.out.println(name);

             // Properties in StringBuilder
           // 4) insert at index i

        name.insert(0,'S');
        System.out.println(name);
           //Output:Stony
        name.insert(3,'n');
        System.out.println(name);
           //Output: Stonny

           // 5) delete at index i

        name.delete(3,4);
        System.out.println(name);
            //Output:Stony
        name.delete(3,4);
        System.out.println(name);
           //Output: Stoy
    }
}
