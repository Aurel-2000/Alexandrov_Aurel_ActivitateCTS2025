package Problema_A11;

public class Factura {
    private ModPlata modPlata;

    public Factura(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteFactura(float suma) {
        modPlata.plateste(suma);
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
}
