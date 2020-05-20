package app;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombre;
    private String descripcion;
    private int edad;
    private int casilleroActual = 0;
    private int energiaMagica = 150;
    private int salud = 100;
    private Artefacto artefacto;
    
    
    public Personaje(String nombre, String descripcion, int energiaMagica, int salud) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.energiaMagica = energiaMagica;
        this.salud = salud;
    }
    
    public Personaje(){}

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getCasilleroActual() {

        return casilleroActual;
    }

    public void setCasilleroActual(int casilleroActual) {
        this.casilleroActual = casilleroActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Artefacto getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }

    public boolean estaVivo(){
        if(this.getSalud()>0){
            return true;
        }else return false;                 
    }
  
    public int tirarDado(Personaje p){

            int dado = (int)(Math.random()*(6-1+1)+1);

            System.out.println(">> El jugador:" + p.getNombre() + " tira los dados. ¡Buena Suerte Wizard!");

            System.out.println(">> " + p.getNombre() + " sacó: " + dado + " en su tiro."); 

            return dado; 
          
    }
	public void irACasillero(Personaje p, int dado) {

        p.setCasilleroActual(p.getCasilleroActual() + dado); 

        System.out.println(">> Te movés hasta el casillero número: " + p.getCasilleroActual());
       
        Casillero c = new Casillero();

        c.jugarCasillero(p, p.getCasilleroActual() );
    }
   
    public void mostrarEstado(Personaje p) {
        System.out.println("****************");
        System.out.println("ESTADO ACTUAL");
        System.out.println("****************");
        System.out.println("Jugador: " + p.getNombre());
        System.out.println("Casillero actual: " + p.getCasilleroActual());
        System.out.println("Energia Mágica: " + p.getEnergiaMagica());
        System.out.println("Salud: " + p.getSalud());
        if (p instanceof Wizard) {
        Wizard w = (Wizard)p;
        System.out.println("Varita: " + w.getVarita().getNombre());
        System.out.println("Escoba: " + w.getEscoba().getNombre());
        
        } 
        
    }



}