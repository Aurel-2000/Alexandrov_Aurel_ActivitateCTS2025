package Problema_A11;

public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura(new PlataCard());
        factura.platesteFactura(350.75f);

        factura.setModPlata(new PlataCash());
        factura.platesteFactura(150.00f);
    }
}
