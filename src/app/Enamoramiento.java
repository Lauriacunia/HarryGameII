package app;

public class Enamoramiento extends Pocion{

    public void enamorar(Personaje p){
        p.setNombre("♥ ♥ ♥ ♥ " + p.getNombre() + "♥ ♥ ♥ ♥ ");

        System.out.println("Te comiste unos bombones rellenos de Pocion de Enamoramiento");
        System.out.println("Querido Wizard: el amor ha llegado a tu corazon");
        System.out.println(                p.getNombre());
    }
    
}