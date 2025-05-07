package Adapter2;

public class EvaluareClientFirmaA implements IEvaluareClientFirmaA{
    @Override
    public void valoareDiscountA(int sumaTotala) {
        System.out.println("valoareDiscountA");
        double discount=sumaTotala*0.10;
        System.out.println("Valoarea discountului este: "+discount);
    }
}
