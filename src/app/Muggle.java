package app;

public class Muggle extends Persona{

    private boolean tieneHijeWizard;

    public Muggle(String nombre, String descripcion, int energiaMagica, int salud) {
        super(nombre, descripcion, energiaMagica, salud);
    }
    
    public Muggle(){}
    
    public boolean isTieneHijeWizard() {
        return tieneHijeWizard;
    }

    public void setTieneHijeWizard(boolean tieneHijeWizard) {
        this.tieneHijeWizard = tieneHijeWizard;
    }






}