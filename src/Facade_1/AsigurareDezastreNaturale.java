package Facade_1;

public class AsigurareDezastreNaturale {
    protected boolean esteInclusa=false;
    public void adaugaAsigurare(){
        System.out.println("AsigurareDezastreNaturale a fost adaugata");
        esteInclusa=true;
    }
    public void stergeAsigurare(){
        System.out.println("AsigurareDezastreNaturale a fost stearsa");
        esteInclusa=false;
    }
}
