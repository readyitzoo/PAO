package main.java.laboratoare.laborator2;

import java.util.Arrays;

public class Ex4 {

    public static void main (String[] args){
        char[] chars = {'j', 'a', 'v', 'a'};

        for (char c1 : chars){
            System.out.println(c1);
        }

        System.out.println("Arrays.toString()");
        System.out.println(Arrays.toString(chars));
    }
}
