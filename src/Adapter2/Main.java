package Adapter2;

public class Main {
    public static void main(String[] args) {
        int firma1=1000;
        int []firma2=new int[]{100,200,400};
        IEvaluareClientFirmaA evaluareClientFirmaA=new EvaluareClientFirmaA();
        IEvaluareClientFirmaB evaluareClientFirmaB= new EvaluareClientFirmaB();
        evaluareClientFirmaA.valoareDiscountA(firma1);
        evaluareClientFirmaB.valoareDiscountB(firma2);




    }
}
