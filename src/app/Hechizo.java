package app;

public class Hechizo  extends Poder{

    private boolean esOscuro;

    public Hechizo(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuración) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuración);
    }

    public Hechizo(){}

    public boolean esOscuro(Hechizo h) {
        if(h instanceof Imperius){
        return true;   
        }
        return false;
    }

    public void setEsOscuro(boolean esOscuro) {
        this.esOscuro = esOscuro;
    }
    
  
    
}

