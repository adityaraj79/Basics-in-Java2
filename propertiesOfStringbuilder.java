package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Tony Stark");
        System.out.println(name);

        // Properties of StringBuilder
            // 1) Length

        System.out.println(name.length());
            //Output:10

            // 2) charAt at index i

        System.out.println(name.charAt(0));
            //Output:T

            // 3) setCharAt at index i

        name.setCharAt(0,'P');
        System.out.println(name);
            //Output:Pony Stark
    }
}
