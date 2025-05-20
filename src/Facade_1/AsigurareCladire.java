package Facade_1;

public class AsigurareCladire {
    protected boolean esteInclusa=false;


    public void adaugaAsigurare(){
        System.out.println("AsigurareCladire a fost adaugata");
        esteInclusa=true;
    }
    public void stergeAsigurare(){
        System.out.println("AsigurareCladire a fost stearsa");
        esteInclusa=false;
    }

}
