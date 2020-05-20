package app;

public class CapaInvisibilidad extends Artefacto implements IReliquiaMuerte {

    private boolean estaVisible;

    // CONSTRUCTOR

    public CapaInvisibilidad(String nombre, int poderDeDaño, int poderDeCuración, double amplificadorDeDanio,
            double amplificadorDeCuracion, boolean estaVisible) {
        super(nombre, poderDeDaño, poderDeCuración, amplificadorDeDanio, amplificadorDeCuracion);
        this.estaVisible = estaVisible;
    }

    public CapaInvisibilidad() {
    }

    // GETTERS Y SETTERS
    public boolean isEstaVisible() {
        return estaVisible;
    }

    public void setEstaVisible(boolean estaVisible) {
        this.estaVisible = estaVisible;
    }

    @Override
    public boolean esReliquiaMuerte() {
        return false;
    }

    public void hacerInvisible(Personaje p){
        p.setNombre(" ( ◕ ٥ ◕ estás invisible)                          ");
    }
}