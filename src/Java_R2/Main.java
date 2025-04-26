package Java_R2;

public class Main {
    public static void main(String[] args) {
        Masina mercedes=new Masina("Mercedes", 1998);
        mercedes.pornesteMasina();
        mercedes.setAn(2000);
        mercedes.setNume("Mercedes S-class");
        mercedes.pornesteMasina();
        mercedes.schimbaAn();
        mercedes.schimbaNume();
        mercedes.pornesteMasina();



    }
}
