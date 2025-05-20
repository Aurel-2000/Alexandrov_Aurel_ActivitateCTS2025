package Facade_1;

public class ContractAsigurare {
    AsigurareCladire asigurareCladire;
    AsigurareDezastreNaturale asigurareDezastreNaturale;
    AsigurareParcAuto asigurareParcAuto;
    AsigurareProductie asigurareProductie;

    public ContractAsigurare(AsigurareCladire asigurareCladire, AsigurareDezastreNaturale asigurareDezastreNaturale, AsigurareParcAuto asigurareParcAuto, AsigurareProductie asigurareProductie) {
        this.asigurareCladire = asigurareCladire;
        this.asigurareDezastreNaturale = asigurareDezastreNaturale;
        this.asigurareParcAuto = asigurareParcAuto;
        this.asigurareProductie = asigurareProductie;
    }

    void adaugaAsigurareCasa(){
        asigurareCladire.adaugaAsigurare();
        asigurareDezastreNaturale.adaugaAsigurare();
    }
    void adaugaAsigurareFirmaProductie(){
        asigurareCladire.adaugaAsigurare();
        asigurareDezastreNaturale.adaugaAsigurare();
        asigurareProductie.adaugaAsigurare();
    }
    void asigurareTotala(){
        asigurareCladire.adaugaAsigurare();
        asigurareDezastreNaturale.adaugaAsigurare();
        asigurareProductie.adaugaAsigurare();
        asigurareParcAuto.adaugaAsigurare();
    }

    @Override
    public String toString() {
        return "ContractAsigurare [asigurareCladire=" +
                asigurareCladire.esteInclusa
                + ", asigurareDezastreNaturale=" +
                asigurareDezastreNaturale.esteInclusa
                + ", asigurareParcAuto=" +
                asigurareParcAuto.esteInclusa
                + ", asigurareProductie=" +
                asigurareProductie.esteInclusa + "]";
    }
}
