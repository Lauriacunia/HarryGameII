package app;

public class GrajeasDeSabores extends Artefacto{

    String descripcion;

    public GrajeasDeSabores(String nombre, String descripcion, int poderDeDaño, int poderDeCuración, double amplificadorDeDanio,
            double amplificadorDeCuracion) {
        super(nombre, poderDeDaño, poderDeCuración, amplificadorDeDanio, amplificadorDeCuracion);
        this.descripcion = descripcion;
    }

    public GrajeasDeSabores(){}
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

}