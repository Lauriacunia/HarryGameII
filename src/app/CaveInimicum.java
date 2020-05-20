package app;

public class CaveInimicum extends HechizoDefensa{

    private boolean esPoderoso; 

    public CaveInimicum(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public CaveInimicum(){}

    public boolean getEsPoderoso() {
        return esPoderoso;
    }

    public void setEsPoderoso(boolean esPoderoso) {
        this.esPoderoso = esPoderoso;
    }

    
    

}