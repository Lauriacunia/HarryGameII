package app;

public class VulneraSanentur extends HechizoCuracion{

    private boolean curaHeridas;

    public VulneraSanentur(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public VulneraSanentur(){}

    public boolean isCuraHeridas() {
        return curaHeridas;
    }

    public void setCuraHeridas(boolean curaHeridas) {
        this.curaHeridas = curaHeridas;
    }

    

}