package app;

public class Lechuza extends Animal {

String dueño;

public Lechuza(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño, int poderDeCuración) {
    super(nombre, descripcion, energiaMagica, salud, poderDeDaño, poderDeCuración);
}

public Lechuza(){}

public String getDueño() {
    return dueño;
}

public void setDueño(String dueño) {
    this.dueño = dueño;
}


}