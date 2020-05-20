package app;

public class Pocion extends Artefacto {

    String efecto;

    // CONSTRUCTOR
    public Pocion(String nombre, String efecto, int poderDeDaño, int poderDeCuración, double amplificadorDeDanio,
            double amplificadorDeCuracion) {
        super(nombre, poderDeDaño, poderDeCuración, amplificadorDeDanio, amplificadorDeCuracion);
        this.efecto = efecto;
    }

    public Pocion(){}
    
    // GETTERS AND SETTERS
    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

}