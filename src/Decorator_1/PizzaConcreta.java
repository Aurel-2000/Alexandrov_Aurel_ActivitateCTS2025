package Decorator_1;

public class PizzaConcreta extends APizza{
    @Override
    String getComponente() {
        return "Aluat, rosii, cascaval";
    }

    @Override
    int getPret() {
        return 30;
    }
}
