package Adapter1;

public class EvaluareContractAsiguratorA implements IEvaluareContractAsiguratorA {
    @Override
    public void analizaContractA(int costTotalAchizitii) {
        System.out.println("Metoda analiza Contract de către Firma A");
        double costAsigurare = costTotalAchizitii * 0.05;
        System.out.println("Costul aferent contractului este " + costAsigurare);
    }
}
