package app;

public class Serpiente extends Animal{

private final int danioConVeneno = 60;


public Serpiente(){}

public Serpiente(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño,
        int poderDeCuración) {
    super(nombre, descripcion, energiaMagica, salud, poderDeDaño, poderDeCuración);
}

public int getDanioConVeneno() {
    return danioConVeneno;
}


public void atacar(Personaje p){

    Lapiz l = new Lapiz();
    l.dibujarBasilisco();

    System.out.println("Corre! Lucha! El basilisco está detrás de ti");
    System.out.println("Logra rozarte con sus colmillos y te afecta con su veneno");
    System.out.println("Por eso pierdes 60 puntos de salud");

    Serpiente s = new Serpiente();
    p.setSalud(p.getSalud() - s.danioConVeneno);
}


}