package Java_R1;

public class Main{
    public static void main(String[] args) {
        Masina  audi=new Masina("Audi a6");
        System.out.println(audi.getName());
        audi.setName("Audi a4");
        System.out.println(audi.getName());
        audi.pornesteMasina();
    }


}