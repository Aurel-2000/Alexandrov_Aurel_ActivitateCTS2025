package Facade_1;

public class Main {
    public static void main(String[] args) {
        ContractAsigurare contractAsigurare=new ContractAsigurare(new AsigurareCladire(),new AsigurareDezastreNaturale(), new AsigurareParcAuto(), new AsigurareProductie());

        contractAsigurare.adaugaAsigurareCasa();
        System.out.println(contractAsigurare);
        contractAsigurare.adaugaAsigurareFirmaProductie();
        System.out.println(contractAsigurare);
        contractAsigurare.asigurareTotala();
        System.out.println(contractAsigurare);
    }
}
