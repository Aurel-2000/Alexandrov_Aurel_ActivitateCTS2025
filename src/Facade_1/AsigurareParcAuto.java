package Facade_1;

public class AsigurareParcAuto {
    protected boolean esteInclusa=false;
    public void adaugaAsigurare(){
        System.out.println("AsigurareParcAuto a fost adaugata");
        esteInclusa=true;

    }
    public void stergeAsigurare(){
        System.out.println("AsigurareParcAuto a fost stearsa");
        esteInclusa=false;
    }
}
