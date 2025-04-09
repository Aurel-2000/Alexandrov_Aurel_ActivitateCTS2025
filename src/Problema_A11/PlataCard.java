package Problema_A11;

public class PlataCard implements ModPlata {
    @Override
    public void plateste(float suma) {
        System.out.println("Se plateste card" + suma + " lei.");
    }
}
