package main.java.laboratoare.laborator2;

import java.awt.*;

public class Ex1 {

    public static void main(String[] args){

        char c = 't';
        Character cc = c;

        Integer i1 = 4;
        Integer i2 = Integer.valueOf(4);
        Integer i3 = Integer.valueOf("4");

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        System.out.println(i2 == i3);

        Integer i4 = Integer.valueOf(128);
        Integer i5 = Integer.valueOf("128");
        System.out.println(i4 == i5);

        boolean b1 = Boolean.valueOf("true");
        System.out.println(b1);

        long l1 = Long.parseLong("4444");
        System.out.println(l1);
    }
}
