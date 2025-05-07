package Adapter1;


public class Main {
        public static void main(String[] args) {
            int[] costuriAchizitii = new int[]{1000, 2000, 20000, 1000, 5000};
            int sumaAchizitieFirma2=10000;


            Contract contract = new Contract("Test S.A.", 5, costuriAchizitii);

            IEvaluareContractAsiguratorB evaluareContractB = new AdaptorEvaluareContract();
            evaluareContractB.analizaContractB(contract);
            EvaluareContractAsiguratorA firma2=new EvaluareContractAsiguratorA();
            firma2.analizaContractA(sumaAchizitieFirma2);

    }

}
