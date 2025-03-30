package Problema_A6;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Gheorghe Ion");
        Medic medic = new Medic();
        Salon salon = new Salon(3);

        ModulInternare modulInternare = new ModulInternare(medic, salon);
        modulInternare.interneazaPacient(pacient);
    }
}