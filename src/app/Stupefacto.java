package app;

public class Stupefacto extends HechizoOcio{

    private boolean inmobilizaObjetos;

    public Stupefacto(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public Stupefacto(){}
    
    public boolean isInmobilizaObjetos() {
        return inmobilizaObjetos;
    }

    public void setInmobilizaObjetos(boolean inmobilizaObjetos) {
        this.inmobilizaObjetos = inmobilizaObjetos;
    }

    

    
}