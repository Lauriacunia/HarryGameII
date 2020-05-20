package app;

public class Hipogrifo extends Animal {

private final int danioConPico = 20;


public Hipogrifo(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño,
        int poderDeCuración) {
    super(nombre, descripcion, energiaMagica, salud, poderDeDaño, poderDeCuración);
}

public Hipogrifo(){}

public int getDanioConPico() {
    return danioConPico;
}


}