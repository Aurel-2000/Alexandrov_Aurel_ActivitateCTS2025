package Problema_A6;

public class Salon {
    private int paturiLibere;

    public Salon(int paturiLibere) {
        this.paturiLibere = paturiLibere;
    }

    public boolean arePaturiLibere() {
        System.out.println("PAturi libere " + paturiLibere + " paturi libere");
        return paturiLibere > 0;
    }

    public void ocupaPat() {
        if (paturiLibere > 0) {
            paturiLibere--;
            System.out.println("Un pat s-a ocupat. Au ramas " + paturiLibere);
        }
    }
}
