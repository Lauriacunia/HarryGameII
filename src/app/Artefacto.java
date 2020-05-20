package app;

public class Artefacto implements IEsMagico {

    private String nombre;
    private int poderDeDaño;
    private int poderDeCuración;
    private double amplificadorDeDanio;
    private double amplificadorDeCuracion;
    private Poder poder;

    public Artefacto(String nombre, int poderDeDaño, int poderDeCuración, double amplificadorDeDanio,
            double amplificadorDeCuracion) {
        this.nombre = nombre;
        this.poderDeDaño = poderDeDaño;
        this.poderDeCuración = poderDeCuración;
        this.amplificadorDeDanio = amplificadorDeDanio;
        this.amplificadorDeCuracion = amplificadorDeCuracion;
       
    }
    public Artefacto(){}


	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoderDeDaño() {
        return poderDeDaño;
    }

    public void setPoderDeDaño(int poderDeDaño) {
        this.poderDeDaño = poderDeDaño;
    }

    public int getPoderDeCuración() {
        return poderDeCuración;
    }

    public void setPoderDeCuración(int poderDeCuración) {
        this.poderDeCuración = poderDeCuración;
    }

    public double getAmplificadorDeDanio() {
        return amplificadorDeDanio;
    }

    public void setAmplificadorDeDanio(double amplificadorDeDanio) {
        this.amplificadorDeDanio = amplificadorDeDanio;
    }

    public double getAmplificadorDeCuracion() {
        return amplificadorDeCuracion;
    }

    public void setAmplificadorDeCuracion(double amplificadorDeCuracion) {
        this.amplificadorDeCuracion = amplificadorDeCuracion;
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    @Override
    public boolean esInvisibleAMuggles() {
        if (this instanceof CapaInvisibilidad || this instanceof EspadaDeGryffindor || this instanceof Horrocrux){
            return true;
        }else return false;
        
    }

    @Override
    public boolean esInvisible() {
        if (this instanceof CapaInvisibilidad){
            return true;
        }else return false;
    }

}