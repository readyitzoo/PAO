package main.java.laboratoare.laborator2;

import java.util.Scanner;

public class Ex2 {

    public static void main (String[] args){

        /* cititi de la tastatura 2 valori : numele si varsta
        afisati numele
        Daca varsta e impara, afisati toate numerele impara <= varsta, altfel pare

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele: ");
        String nume = scanner.nextLine();
        System.out.println("Introduceti varsta: ");
        int varsta = scanner.nextInt();

        System.out.println("numele introdus este: " + nume);
        if (varsta % 2 == 0) {
            for (int i = 0; i <= varsta; i += 2) {
                System.out.println(i);
            }
        } else {
            for (int i = 1; i <= varsta; i += 2) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
