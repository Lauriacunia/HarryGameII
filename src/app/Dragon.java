package app;

public class Dragon extends Criatura {

private int danioConFuego = 30;
String ANSI_RED = "\u001B[31m";

public Dragon(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño, int poderDeCuración) {
    super(nombre, descripcion, energiaMagica, salud, poderDeDaño, poderDeCuración);
}
public Dragon(){}

public int getDanioConFuego() {
    return danioConFuego;
}

public void setDanioConFuego(int danioConFuego) {
    this.danioConFuego = danioConFuego;
}

public void quemar(Personaje p){
    p.setNombre(ANSI_RED + p.getNombre());
    System.out.println("El Dragon escupe su fuego!! Cuidado Wizard!");
    System.out.println(p.getNombre());
    System.out.println("Te quemó. Perdiste 40 puntos de Salud");
    p.setSalud(p.getSalud()-40);
}
}