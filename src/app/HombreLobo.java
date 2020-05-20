package app;

public class HombreLobo extends Criatura{

private final int danioConMordida = 5;


public HombreLobo(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño,
        int poderDeCuración) {
    super(nombre, descripcion, energiaMagica, salud, poderDeDaño, poderDeCuración);
}

public HombreLobo(){}

public int getDanioConMordida() {
    return danioConMordida;
}


}