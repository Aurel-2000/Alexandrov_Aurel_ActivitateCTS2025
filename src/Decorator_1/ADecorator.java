package Decorator_1;

public abstract class ADecorator extends APizza{
    protected APizza pizza;
    public ADecorator(APizza pizza){
        super();
        this.pizza=pizza;
    }
    @Override
    String getComponente(){
       return pizza.getComponente();
    };


    @Override
    abstract int getPret();
}
