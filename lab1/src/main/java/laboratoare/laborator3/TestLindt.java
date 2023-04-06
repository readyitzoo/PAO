package main.java.laboratoare.laborator3;

public class TestLindt {
    public static void main(String[] args) {
        Lindt lindt1 = new Lindt();
        System.out.println(lindt1);

//        Lindt lindt2 = new Lindt("Strawberry", "Romania");
//        System.out.println(lindt2);

        lindt1.flavor = "Strawberry";
        lindt1.origin = "Romania";
        System.out.println(lindt1);
        System.out.println(lindt1.getVolume());
        System.out.println(lindt1.flavor);
        System.out.println(lindt1.origin);

        CandyBox lindt2 = new CandyBox("fff", "ggg");
        System.out.println(lindt2);
        System.out.println(lindt2.flavor);
        System.out.println(lindt2.origin);
    }
}
