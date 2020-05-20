package app;

public class Patronus extends Criatura {

int luminosidad = 70;


public Patronus(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño, int poderDeCuración) {
    super(nombre, descripcion, energiaMagica, salud, poderDeDaño, poderDeCuración);
}

public Patronus(){}

public int getLuminosidad() {
    return luminosidad;
}

public void setLuminosidad(int luminosidad) {
    this.luminosidad = luminosidad;
}

public void proteger(Personaje p){

Lapiz l= new Lapiz();
l.dibujarPatronus();

p.setSalud(p.getSalud() + 50 );

System.out.println("El patronus te protege y por eso sumas 50 puntos a tu salud");

}


}