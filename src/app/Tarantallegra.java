package app;

public class Tarantallegra extends HechizoAtaque {

    private boolean esGracioso;
    
    public Tarantallegra(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public Tarantallegra(){}
    
    public boolean isEsGracioso() {
        return esGracioso;
    }

    public void setEsGracioso(boolean esGracioso) {
        this.esGracioso = esGracioso;
    }

    

}