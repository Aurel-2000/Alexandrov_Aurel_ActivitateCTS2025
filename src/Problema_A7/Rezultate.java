package  Problema_A7;

public class Rezultate {
    private static Rezultate instanta;
    private String tipRezultat;
    public static Rezultate getInstanta(){
        if(instanta==null){
            instanta=new Rezultate();
        }
        else {
            return instanta;
        }
        return instanta;
    }
    public void setLivrare(String Livrare){
        this.tipRezultat=Livrare;
    }

    private Rezultate(){
        this.tipRezultat="Printat";
    };
    public void afiseazaRezultat(){
       if(tipRezultat.equals("Printat")){
           System.out.println("A fost printat");
       }
       else {
           System.out.println("A fost afisat online");
       }
    }

}