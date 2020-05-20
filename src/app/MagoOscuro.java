package app;

import java.util.List;

public class MagoOscuro extends Wizard {

    private boolean esMortifago;

    public MagoOscuro(){}

    public MagoOscuro(String nombre, String descripcion, int energiaMagica, int salud, Varita varita, Escoba escoba) {
        super(nombre, descripcion, energiaMagica, salud, varita, escoba);
    }

    public boolean isEsMortifago() {
        return esMortifago;
    }

    public void setEsMortifago(boolean esMortifago) {
        this.esMortifago = esMortifago;
    }
    
   

}