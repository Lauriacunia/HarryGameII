package app;

public class PetrificusTotalus extends HechizoAtaque {

    private boolean petrifica;

    public PetrificusTotalus(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public PetrificusTotalus(){}
    
    public boolean isPetrifica() {
        return petrifica;
    }

    public void setPetrifica(boolean petrifica) {
        this.petrifica = petrifica;
    }

    

}