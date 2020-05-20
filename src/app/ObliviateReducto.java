package app;

public class ObliviateReducto extends HechizoAtaque {

    private boolean pierdeLaMemoria;
    
    public ObliviateReducto(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public ObliviateReducto(){}

    public boolean isPierdeLaMemoria() {
        return pierdeLaMemoria;
    }

    public void setPierdeLaMemoria(boolean pierdeLaMemoria) {
        this.pierdeLaMemoria = pierdeLaMemoria;
    }

    


    

}