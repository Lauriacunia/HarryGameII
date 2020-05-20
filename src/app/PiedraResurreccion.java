package app;

public class PiedraResurreccion extends Artefacto implements IReliquiaMuerte {

    private String color;

    public PiedraResurreccion(String nombre, int poderDeDaño, int poderDeCuración, double amplificadorDeDanio,
            double amplificadorDeCuracion, String color) {
        super(nombre, poderDeDaño, poderDeCuración, amplificadorDeDanio, amplificadorDeCuracion);
        this.color = color;
    }

    public PiedraResurreccion() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean esReliquiaMuerte() {
        
        return true;
    }

}