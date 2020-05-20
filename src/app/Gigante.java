package app;

public class Gigante extends Criatura {

private final int danioConPisada = 10;

public Gigante(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño, int poderDeCuración) {
    super(nombre, descripcion, energiaMagica, salud, poderDeDaño, poderDeCuración);
}

public Gigante(){}

public int getDanioConPisada() {
    return danioConPisada;
}
  
}