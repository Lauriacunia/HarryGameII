package app;

public class Invisibilidad extends Poder {

    private boolean protege;

    public Invisibilidad(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuración) {
      super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuración);
    }
    
    public Invisibilidad(){}
    
    public boolean isProtege() {
        return protege;
    }

    public void setProtege(boolean protege) {
		this.protege = protege;
	}

 
} 

   