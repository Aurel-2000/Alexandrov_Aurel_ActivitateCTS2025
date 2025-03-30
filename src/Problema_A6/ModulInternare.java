package Problema_A6;

public class ModulInternare {

    private Medic medic;
    private Problema_A6.Salon salon;

    public ModulInternare(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient) {
        System.out.println("Internare");
        if (pacient.areStareGrava() &&
                medic.confirmaInternare(pacient) &&
                salon.arePaturiLibere()) {
            salon.ocupaPat();
            System.out.println("Internat cu succes");
        } else {
            System.out.println("Internare esuata");
        }
    }
}

