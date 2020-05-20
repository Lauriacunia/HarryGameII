package app;

public class Impedimenta extends HechizoDefensa {

    private boolean tieneContraEfecto;

    public Impedimenta(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public Impedimenta(){}
    
    public boolean isTieneContraEfecto() {
        return tieneContraEfecto;
    }

    public void setTieneContraEfecto(boolean tieneContraEfecto) {
        this.tieneContraEfecto = tieneContraEfecto;
    }

    

}