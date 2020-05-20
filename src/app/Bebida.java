package app;

public class Bebida extends Artefacto{


    public Bebida(String nombre, int poderDeDaño, int poderDeCuración, double amplificadorDeDanio,
            double amplificadorDeCuracion) {
        super(nombre, poderDeDaño, poderDeCuración, amplificadorDeDanio, amplificadorDeCuracion);
    }

    public Bebida(){}


    public void emborrachar(Personaje p, Bebida b){
        if(b.getNombre().equals("Cerveza De Mantequilla")){
            p.setSalud(p.getSalud()-15);
            System.out.println("Lo siento, emborracharse no esta permitido dentro de Howards");
            System.out.println("Perdiste 15 puntos de Salud");
        }

    }
 
    
}