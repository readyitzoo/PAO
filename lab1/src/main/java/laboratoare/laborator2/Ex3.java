package main.java.laboratoare.laborator2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex3 {

    public static void main (String[] args){
        int[] ar1;
        int ar2[], i3, ar3[][], i4[];

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[5];
        int[] array3 = new int[]{1, 2, 3, 4, 5};
        int[] array4 = array2;

        System.out.println("comparatie referinte " + (array1 == array3));
        System.out.println("comparatie continut " + Arrays.compare(array1, array3));
        System.out.println("comparatie obiecte " + Arrays.equals(array1, array3));

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

//        for (int i = 0; i <= array3.length; i++) { // exceptie
//            System.out.println(array1[i]);
//        }
    }
}
