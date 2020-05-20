package app;

import java.util.ArrayList;
import java.util.List;

public class Poder {
    
    int poderDeDanio;
    int poderDeCuración;

    private String nombreDelPoder;
    private String descripcionDelPoder;
    private List<Poder> poderes = new ArrayList<>(); 

  // CONSTRUCTOR
  public Poder(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuración ) {
    this.poderDeDanio = poderDeDanio;
    this.poderDeCuración = poderDeCuración;
    this.nombreDelPoder = nombreDelPoder;
    this.descripcionDelPoder = descripcionDelPoder;
}


    public Poder(){}
    
    public String getNombreDelPoder() {
        return nombreDelPoder;
    }

    public void setNombreDelPoder(String nombreDelPoder) {
        this.nombreDelPoder = nombreDelPoder;
    }

    public String getDescripcionDelPoder() {
        return descripcionDelPoder;
    }

    public void setDescripcionDelPoder(String descripcionDelPoder) {
        this.descripcionDelPoder = descripcionDelPoder;
    }

    public List<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }

    public int getPoderDeDanio() {
        return poderDeDanio;
    }

    public void setPoderDeDanio(int poderDeDanio) {
        this.poderDeDanio = poderDeDanio;
    }

    public int getPoderDeCuracion() {
        return poderDeCuración;
    }

    public void setPoderDeCuración(int poderDeCuración) {
        this.poderDeCuración = poderDeCuración;
    }

 
    




}