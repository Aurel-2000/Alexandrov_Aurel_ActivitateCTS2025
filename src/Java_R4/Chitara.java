package Java_R4;

public class Chitara extends Instrument{
    public Chitara(String nume){
        super(nume) ;

    }

    @Override
    public void canta() {
        System.out.println("Chitara "+nume+ " canta");
    }
}
