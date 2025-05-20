package Facade_1;

public class AsigurareProductie {
    protected boolean esteInclusa=false;
    public void adaugaAsigurare(){
        System.out.println("AsigurareProducție a fost adaugata");
        esteInclusa=true;

    }
    public void stergeAsigurare(){
        System.out.println("AsigurareProducție a fost stearsa");
        esteInclusa=false;
    }
}
