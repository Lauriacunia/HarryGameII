package app;

import java.util.ArrayList;
import java.util.List;

public class Criatura extends Personaje implements IEsMagico {

    private boolean vuela;
    private int poderDeDaño;
    private int poderDeCuración;

    public Criatura() {
    }

    public Criatura(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño,
            int poderDeCuración) {
        super(nombre, descripcion, energiaMagica, salud);
        this.poderDeDaño = poderDeDaño;
        this.poderDeCuración = poderDeCuración;
    }


    @Override
    public boolean esInvisibleAMuggles() {
        if (this instanceof Elfo || this instanceof Dragon || this instanceof Patronus){
            return true;
        }else return false;
    }

    @Override
    public boolean esInvisible() {
        if (this instanceof Elfo || this instanceof Dragon || this instanceof Patronus || this instanceof Fenix ){
            return true;
        }else return false;
        
    }

    public int getPoderDeDaño() {
        return poderDeDaño;
    }

    public void setPoderDeDaño(int poderDeDaño) {
        this.poderDeDaño = poderDeDaño;
    }

    public int getPoderDeCuración() {
        return poderDeCuración;
    }

    public void setPoderDeCuración(int poderDeCuración) {
        this.poderDeCuración = poderDeCuración;
    }

    public boolean siVuela() {
        if (this instanceof Dementor || this instanceof Dragon || this instanceof Lechuza || this instanceof Fenix ){
            return true;
        }else return false;
    }


}