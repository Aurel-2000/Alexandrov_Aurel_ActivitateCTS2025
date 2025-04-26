package Java_R4;

public class Toba extends Instrument{
    public Toba(String nume){
        super(nume);
    }
    @Override
    public void canta() {
        System.out.println("Toba "+nume+" bate");
    }
}

