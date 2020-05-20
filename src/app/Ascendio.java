package app;

public class Ascendio extends HechizoOcio{


    public Ascendio(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public Ascendio(){}

    public void hechizar(Personaje p){
        System.out.println("              " + p.getNombre());
        System.out.println("                      |||");
        System.out.println("                      |||");
        System.out.println("                      |||");
        System.out.println("                      |||");
        System.out.println("                      |||");
        System.out.println("                      |||");
        System.out.println("                      |||");
        System.out.println("                      |||");
        System.out.println("                      |||");
        System.out.println("        ............oOoOoOoO......");
        System.out.println("                                         ");
        System.out.println(" Lograste salir a la superficie y no ahogarte gracias al Hechizo Ascendio");
        System.out.println("         Tienes mucha suerte!! Recuperas 30 puntos de Salud!!         ");

        p.setSalud(p.getSalud()+30);
    }
    
    


}