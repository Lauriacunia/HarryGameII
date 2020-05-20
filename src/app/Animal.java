package app;

public class Animal extends Criatura {

private boolean esDomestico;

public Animal(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño, int poderDeCuración) {
    super(nombre, descripcion, energiaMagica, salud, poderDeDaño, poderDeCuración);
}

public Animal(){}

public boolean esDomestico() {
    if (this instanceof Lechuza || this instanceof Fenix){
        return true;
    }else return false;
}

}