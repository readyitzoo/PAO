package main.java.laboratoare.laborator4;

public class TestUniversitate {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Ion", "mate");
        Profesor p2 = new Profesor("Gheorghe", "info");
        Profesor[] profesoriMateinfo = new Profesor[]{p1,p2};

        Universitate mateinfo = new Universitate("mateinfo", profesoriMateinfo);
        System.out.println(mateinfo);

        profesoriMateinfo = new Profesor[]{p2};
        mateinfo.setProfesori(profesoriMateinfo);
        System.out.println(mateinfo);


    }
}
