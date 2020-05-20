package app;

public class Muffliato extends HechizoOcio {

    private boolean hayZumbido;
    
    public Muffliato(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public Muffliato(){}
    
    public boolean isHayZumbido() {
        return hayZumbido;
    }

    public void setHayZumbido(boolean hayZumbido) {
        this.hayZumbido = hayZumbido;
    }

    

}