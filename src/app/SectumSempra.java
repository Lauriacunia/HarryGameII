package app;

public class SectumSempra extends HechizoAtaque {

    private boolean usoContraEnemigos;

    public SectumSempra(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public SectumSempra(){}
    
    public boolean isUsoContraEnemigos() {
        return usoContraEnemigos;
    }

    public void setUsoContraEnemigos(boolean usoContraEnemigos) {
        this.usoContraEnemigos = usoContraEnemigos;
    }

    


}