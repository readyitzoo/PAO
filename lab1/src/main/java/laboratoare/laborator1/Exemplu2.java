package main.java.laboratoare.laborator1;

public class Exemplu2
{
    public static void main(String[] args)
    {
        Exemplu1.main(null);
        Exemplu1 obiect1 = new Exemplu1();
        obiect1.setNumarLaborator(1);
        obiect1.main(null);
//        Exemplu1.setNumarLaborator(1);

        System.out.println(obiect1.getNumarLaborator());
        System.out.println(obiect1.numarLaborator);

        Exemplu1 obiect2 = new Exemplu1();
        obiect2.setNumarLaborator(2);

        Exemplu1 obiect3 = new Exemplu1();
        System.out.println(obiect3.getNumarLaborator());
    }
}
