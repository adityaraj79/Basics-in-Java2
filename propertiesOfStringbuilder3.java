package com.basicsinjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("tony");
        System.out.println(name);

             // Properties in StringBuilder
           // 6) append  (add an extra index at last)
        name.append(" ");
        name.append("s");
        name.append("t");
        name.append("a");
        name.append("r");
        name.append("k");
        System.out.println(name);
            //Output: tony stark
    }
}
