package main.java.laboratoare.laborator2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex5 {
    public static void main (String[] args){
        int[][] arrayOfArrays = new int[3][3];
        arrayOfArrays[0][0] = 0;
        arrayOfArrays[1][2] = 10;
        arrayOfArrays[1][1] = 11;
        arrayOfArrays[2][0] = 20;
        arrayOfArrays[2][1] = 21;
        arrayOfArrays[2][2] = 22;

        System.out.println(Arrays.toString(arrayOfArrays));
        System.out.println(Arrays.deepToString(arrayOfArrays));
    }

}
