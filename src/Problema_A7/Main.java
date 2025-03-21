package Problema_A7;

public class Main {
    public static void main(String[] args) {
        Rezultate manager = Rezultate.getInstanta();
        manager.afiseazaRezultat();
        manager.setLivrare("online");
        manager.afiseazaRezultat();
    }
}
