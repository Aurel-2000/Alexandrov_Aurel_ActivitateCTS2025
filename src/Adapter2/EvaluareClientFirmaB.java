package Adapter2;

public class EvaluareClientFirmaB extends EvaluareClientFirmaA   implements IEvaluareClientFirmaB{
    @Override
    public void valoareDiscountB(int[]sumeleTotale) {
        System.out.println("valoareDiscountB");
        int s=0;
        for (int i = 0; i <sumeleTotale.length; i++) {
            s+=sumeleTotale[i];
        }

        this.valoareDiscountA(s);
        
        
    }
}
