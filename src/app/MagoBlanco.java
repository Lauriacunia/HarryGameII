package app;

import java.util.List;

public class MagoBlanco extends Wizard {

    private boolean esProfesorHowards;

    public MagoBlanco(){}
    
    public MagoBlanco(String nombre, String descripcion, int energiaMagica, int salud, Varita varita, Escoba escoba) {
        super(nombre, descripcion, energiaMagica, salud, varita, escoba);
    }

	public boolean isEsProfesorHowards() {
        return esProfesorHowards;
    }

    public void setEsProfesorHowards(boolean esProfesorHowards) {
        this.esProfesorHowards = esProfesorHowards;
    }



    
 

}