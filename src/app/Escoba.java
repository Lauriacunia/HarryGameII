package app;

public class Escoba extends Transporte { 
    
    private String nombre;
    private int precio;

    public Escoba(String nombre, int velocidadMax, String descripcion, int gastoDeEnergiaMagica, int precio) {
        super(velocidadMax, descripcion, gastoDeEnergiaMagica);
        this.precio = precio;
        this.nombre = nombre;
    }
    public Escoba(){}
    
    public String getNombre() {
        return nombre;
    }
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

   
}