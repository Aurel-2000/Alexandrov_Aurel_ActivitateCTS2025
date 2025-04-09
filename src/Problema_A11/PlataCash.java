package Problema_A11;

public class PlataCash implements ModPlata {
    @Override
    public void plateste(float suma) {
        System.out.println("Se plateste cash " + suma + " lei.");
    }
}
