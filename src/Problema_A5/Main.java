package Problema_A5;

public class Main {
    public static void main(String[] args) {

        IMedicament medicamentSpital = new MedicamentSpital();
        medicamentSpital.achizitioneazaMedicament();

        System.out.println("\n\n");

        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();
        IMedicament adapter = new MedicamentAdapter(medicamentFarmacie);
        adapter.achizitioneazaMedicament();
    }
}
