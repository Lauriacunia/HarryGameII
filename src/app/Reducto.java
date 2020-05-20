package app;

public class Reducto extends HechizoAtaque{

    private boolean tieneFuerza;

    public Reducto(String nombreDelPoder, String descripcionDelPoder, int poderDeDaño, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDaño, poderDeCuracion);
    }

    public Reducto(){}
    
    public boolean isTieneFuerza() {
        return tieneFuerza;
    }

    public void setTieneFuerza(boolean tieneFuerza) {
        this.tieneFuerza = tieneFuerza;
    }
    
    

}