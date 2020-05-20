package app;

public class Dementor extends Criatura {

private final int danioConBeso = 70;

public Dementor(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño, int poderDeCuración) {
    super(nombre, descripcion, energiaMagica, salud, poderDeDaño, poderDeCuración);
}

public Dementor(){}

public int getDanioConBeso() {
    return danioConBeso;
}

public void darBeso(Personaje p){
    p.setSalud(p.getSalud()-50);
}


}