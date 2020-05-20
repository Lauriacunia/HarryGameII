package app;

public class EspadaDeGryffindor extends Artefacto {

    String dueño;

    //CONSTRUCTOR
    public EspadaDeGryffindor(String nombre, int poderDeDaño, int poderDeCuración, double amplificadorDeDanio,
            double amplificadorDeCuracion) {
        super(nombre, poderDeDaño, poderDeCuración, amplificadorDeDanio, amplificadorDeCuracion);
    }
    
    public EspadaDeGryffindor(){}
 
// GETTERS AND SETTERS

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

  public void usarEspada(Personaje p){
      Lapiz l = new Lapiz();
      l.dibujarEspada();
      System.out.println("                                                            ");
      System.out.println("La Espada de Gryffindor tiene la capacidad de Destruir un Horrocrux");
      System.out.println("Al destruir a Nigini están mas cerca de vencer a Voldemort");
      
      System.out.println("Por eso ganas 30 puntos de Salud");
      p.setSalud(p.getSalud()+30);
  }
}