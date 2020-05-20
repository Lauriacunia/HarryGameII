package app;

public class Veneno extends Pocion{

    public void envenenar(Personaje p){

        p.setSalud(0); 
        System.out.println("Acabas de morir tomando una Pocion de Veneno");
        System.out.println("El juego termina para vos. ¡Que pena Wizard!");

    }
    
}