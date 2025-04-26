package Java_R1;


public class Masina {
    public Masina(String name) {
        this.name = name;
    }

    private String name;

    void pornesteMasina(){
        System.out.println("Misina a pornit");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}