package Problema_A6;

public class Pacient {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public boolean areStareGrava() {
        System.out.println(nume + " are o stare grava");
        return true;
    }
}

