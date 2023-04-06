package main.java.laboratoare.laborator4;

public class Universitate {
    private String nume;
    // agregare - has-a relationship
    private Profesor[] profesori;

    private Departament[] departamente;
    public Universitate(String nume, Profesor[] profesori) {
        this.nume = nume;
        this.profesori = profesori;
    }

    public void setProfesori(Profesor[] profesori) {
        this.nume = nume;
        this.profesori = profesori;
    }

    @Override
    public String toString() {
        return "Universitate{" +
                "profesori=" + profesori +
                '}';
    }
}
