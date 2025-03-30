package Problema_A5;

public class MedicamentAdapter implements IMedicament {

    private MedicamentFarmacie medicamentFarmacie;

    public MedicamentAdapter(MedicamentFarmacie medicamentFarmacie) {
        this.medicamentFarmacie = medicamentFarmacie;
    }

    @Override
    public void achizitioneazaMedicament() {
        System.out.println("Se  sare peste verificarea retetei -Farmacie");
        medicamentFarmacie.cumparaMedicament();
    }
}
