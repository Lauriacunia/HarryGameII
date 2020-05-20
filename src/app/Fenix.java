package app;

public class Fenix extends Animal {

private int danioConGarra = 10;
private int poderDeCuracion = 50;
private int poderDeResurreccion = 150;


public Fenix(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño, int poderDeCuración) {
    super(nombre, descripcion, energiaMagica, salud, poderDeDaño, poderDeCuración);
}
public Fenix(){}

public int getDanioConGarra() {
    return danioConGarra;
}

public void setDanioConGarra(int danioConGarra) {
    this.danioConGarra = danioConGarra;
}

public int getPoderDeCuracion() {
    return poderDeCuracion;
}

public void setPoderDeCuracion(int poderDeCuracion) {
    this.poderDeCuracion = poderDeCuracion;
}

public int getPoderDeResurreccion() {
    return poderDeResurreccion;
}

public void setPoderDeResurreccion(int poderDeResurreccion) {
    this.poderDeResurreccion = poderDeResurreccion;
}



}