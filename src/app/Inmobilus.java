package app;

public class Inmobilus extends HechizoAtaque {

    private boolean funcionaConAnimales;
    
    public Inmobilus(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public Inmobilus(){}
    
    public boolean isFuncionaConAnimales() {
        return funcionaConAnimales;
    }

    public void setFuncionaConAnimales(boolean funcionaConAnimales) {
        this.funcionaConAnimales = funcionaConAnimales;
    }

    

}