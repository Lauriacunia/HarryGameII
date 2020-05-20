package app;

public class Engorgio extends HechizoOcio {

    private boolean esGrande;
   
    public Engorgio(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public Engorgio(){}
    
    public boolean isEsGrande() {
        return esGrande;
    }

    public void setEsGrande(boolean esGrande) {
        this.esGrande = esGrande;
    }

    public void hechizar(Personaje p){
        
        System.out.println("Engorgio "+ p.getNombre());

        System.out.println("¡¡ Oh, Estas engordando!!");

        System.out.println("...ooo000 " + p.getNombre().toUpperCase());
    }
    

}