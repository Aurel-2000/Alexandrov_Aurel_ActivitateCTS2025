package Problema_A5;

public class MedicamentSpital implements IMedicament {

    @Override
    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Cumparat prin Spital");
    }

    private void prezintaReteta() {
        System.out.println("Se verifica reteta");
    }
}

