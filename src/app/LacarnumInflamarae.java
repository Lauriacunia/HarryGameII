package app;

public class LacarnumInflamarae extends HechizoOcio{

    private boolean haceLuz;

    public LacarnumInflamarae(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }
    
    public LacarnumInflamarae(){}

    public boolean isHaceLuz() {
        return haceLuz;
    }

    public void setHaceLuz(boolean haceLuz) {
        this.haceLuz = haceLuz;
    }

    
    
}