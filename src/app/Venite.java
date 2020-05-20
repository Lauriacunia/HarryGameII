package app;

public class Venite extends HechizoDefensa {

    private int esIrreversible;

    public Venite(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public Venite(){}
    
    public int getEsIrreversible() {
        return esIrreversible;
    }

    public void setEsIrreversible(int esIrreversible) {
        this.esIrreversible = esIrreversible;
    }

    

}