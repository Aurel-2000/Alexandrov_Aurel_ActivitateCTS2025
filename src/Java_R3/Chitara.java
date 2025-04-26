package Java_R3;

public class Chitara implements Instrument{
    String nume;
    public Chitara(String nume) {
        this.nume = nume;
    }

    @Override
    public void canta() {
        System.out.println("Chitara "+nume+" canta");
    }
}
