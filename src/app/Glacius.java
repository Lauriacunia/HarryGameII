package app;

public class Glacius extends HechizoAtaque {

    private boolean esFrio;
    String ANSI_CYAN = "\u001B[36m";

    public Glacius(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public Glacius(){}
    
    public boolean isEsFrio() {
        return esFrio;
    }

    public void setEsFrio(boolean esFrio) {
        this.esFrio = esFrio;
    }

    public void hechizar(Wizard w){

        w.setNombre(ANSI_CYAN+ w.getNombre());
        System.out.println("¡¡¡Ahora estás congelado Wizard!!! " + w.getNombre());
        System.out.println("Brrrrr.... ¡¡¡¡Que Frio!!!");

    }

    

}