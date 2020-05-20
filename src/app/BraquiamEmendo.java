package app;

public class BraquiamEmendo extends HechizoCuracion {


    public BraquiamEmendo(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public BraquiamEmendo(){}
    

    public void hechizar(Personaje p){
        System.out.println("Gracias al hechizo Braquiam Emendo puedes respirar bajo el agua");
        System.out.println("Por eso avanzas 10 casilleros");
        p.setCasilleroActual(p.getCasilleroActual()+ 10);
    }
    

    
}