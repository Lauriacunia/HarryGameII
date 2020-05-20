package app;

public class Chimenea extends Transporte{

    private String ubicacion;

    public Chimenea(int velocidadMax, String descripcion, int gastoDeEnergiaMagica, String ubicacion) {
        super(velocidadMax, descripcion, gastoDeEnergiaMagica);
        this.ubicacion = ubicacion;
    }

    public Chimenea(){}
    
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}