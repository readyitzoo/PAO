package main.java.laboratoare.laborator4;

public class Departament {
    private String nume;

    public Departament(String nume, Profesor[] profesori) {
        this.nume = nume;
    }
    public Departament (Departament departament){
        this.nume = departament.nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
