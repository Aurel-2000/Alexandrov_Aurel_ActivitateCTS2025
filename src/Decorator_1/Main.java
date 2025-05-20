package Decorator_1;

public class Main {
    public static void main(String [] args){
        APizza pizza1 =new PizzaConcreta();
        System.out.println(pizza1.getComponente()+"\n"+pizza1.getPret());
    }

}
