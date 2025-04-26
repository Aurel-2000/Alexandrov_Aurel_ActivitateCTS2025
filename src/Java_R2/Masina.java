package Java_R2;

import java.util.Scanner;

public class Masina {
    private String nume;
    private int an;
    Scanner scanner=new Scanner(System.in);
    public void pornesteMasina(){
        System.out.println("Masina "+nume+" din anul "+an+" a pornit");
    }
    public void schimbaAn(){
        System.out.println("Introdu nou an: ");
        this.an=scanner.nextInt();
        scanner.nextLine();
    }
    public void schimbaNume(){
        System.out.println("Introdu noul nume: ");
        this.nume = scanner.nextLine();

    }
    public Masina(String nume, int an) {
        this.nume = nume;
        this.an = an;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAn(int an) {
        this.an = an;
    }
}
