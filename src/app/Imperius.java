package app;

public class Imperius extends HechizoImperdonable{
    String ANSI_BLACK = "\u001B[30m";

    public Imperius(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuración) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuración);
    }

    public Imperius(){}
    

    public void hechizar(Personaje p){

        p = (MagoOscuro)p; // castea al personaje como MagoOscuro

        System.out.println("Solo los magos oscuros utilizar los hechizos imperdonables");
        System.out.println("Por eso usar el hechizo Imperius para controlar a otro mago");
        System.out.println("te convirtió en un mago oscuro");
        System.out.println("El resto del juego serás un Mago Oscuro: "+ ANSI_BLACK + p.getNombre() );
    }
    
}