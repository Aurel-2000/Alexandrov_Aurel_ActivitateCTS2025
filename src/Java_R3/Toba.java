package Java_R3;

public class Toba implements Instrument{
    String nume;

    public Toba(String nume) {
        this.nume=nume;
    }

    public void canta(){
        System.out.println("Toba "+ nume+" bate");
    }
}
