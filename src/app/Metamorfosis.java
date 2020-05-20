package app;

public class Metamorfosis extends Poder {

    private boolean esUnAnimal;

    public Metamorfosis(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuración) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuración);
    }

    public Metamorfosis(){}
    
    public boolean isEsUnAnimal() {
        return esUnAnimal;
    }

    public void setEsUnAnimal(boolean esUnAnimal) {
        this.esUnAnimal = esUnAnimal;
    }

  
    

    
}