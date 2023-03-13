package main.java.laboratoare.laborator1;

public class Exemplu1{
    int numarLaborator; // package-default ca sa fie accesibila din ex2
    public int getNumarLaborator() {
        return numarLaborator;
    }

    public void setNumarLaborator(int numarLaborator) {
        this.numarLaborator = numarLaborator;
    }

    // membri unei clase: campuri si metode

    // single line
    /*
    saf
    sas
     */

    /**
     * documentatie
     * .
     * @param args list de parametri pasati aplicatiei la run
     */

    // public - cel mai permisiv
    // private - cel mai restrictiv
    // protected - cel mai
    // default - cel mai permisiv din cele 2

    public static void main (String[] args) {
        System.out.println("Hello world!");
    }
}
