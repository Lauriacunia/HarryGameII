package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wizard extends Persona implements IHaceMagia {
    public static Scanner Teclado = new Scanner(System.in);
    
    private Varita varita;
    private Escoba escoba;
    private Poder poderInicial; // De nacimiento
    private Artefacto artefacto;
    private List<Artefacto> artefactos = new ArrayList<>();
    private List<Hechizo> hechizos = new ArrayList<>();
    private boolean magoOscuro;


    public Wizard(String nombre, String descripcion, int energiaMagica, int salud, Varita varita, Escoba escoba) {
        super(nombre, descripcion, energiaMagica, salud);
        this.varita = varita;
        this.escoba = escoba;
    }

    public Wizard() {}

	
    public Varita getVarita() {
        return varita;
    }

    public void setVarita(Varita varita) {
        this.varita = varita;
    }

    public Escoba getEscoba() {
        return escoba;
    }

    public void setEscoba(Escoba escoba) {
        this.escoba = escoba;
    }

    public List<Artefacto> getArtefactos() {
        return artefactos;
    }

    public void setArtefactos(List<Artefacto> artefactos) {
        this.artefactos = artefactos;
    }

    public List<Hechizo> getHechizos() {
        return hechizos;
    }

    public void setHechizos(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    public boolean isMagoOscuro() {
        return magoOscuro;
    }

    public void setMagoOscuro(boolean magoOscuro) {
        this.magoOscuro = magoOscuro;
    }
    public void setPoderInicial(Poder poderInicial) {
        this.poderInicial = poderInicial;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }

  

    @Override
    public Poder getPoderInicial() {
       Poder p= this.getPoderInicial();
        return p;
    }

    @Override
    public void setPoder(Poder poder) {
        this.setPoder(poder);
    }

    @Override
    public Artefacto getArtefacto() {
        Artefacto a = this.getArtefacto();
        return a;
    }

    @Override
    public void aprender(Hechizo h) {
        this.getHechizos().add(h);
    }

    @Override
    public void atacar(Personaje victima, Hechizo hechizo) {
        
        victima.setSalud(victima.getSalud() - (hechizo.getPoderDeDanio() + (int)victima.getArtefacto().getAmplificadorDeDanio())); 
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("Usaste el hechizo " + hechizo.getNombreDelPoder());
        System.out.println("                                                                                                 ");
        System.out.println("Lograste debilitar a tu oponente restandole: " + (hechizo.getPoderDeDanio() + (int)victima.getArtefacto().getAmplificadorDeDanio()) + " puntos a su salud.");
        System.out.println("                                                                                                 ");
        System.out.println("---------------------------------------------------------------------------------------------------------");

    }

    @Override
    public void atacar(Personaje victima, String hechizo) {
        Hechizo he = new Hechizo(); 
        for(Hechizo h: hechizos){
            if(h.getNombreDelPoder().equals(hechizo)){
               he = h;
            }
           
        }   
        victima.setSalud(victima.getSalud() - (he.getPoderDeDanio() + (int)victima.getArtefacto().getAmplificadorDeDanio())); 
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("Usaste el hechizo " + he.getNombreDelPoder());
        System.out.println("                                                  ");
        System.out.println("Lograste debilitar a tu oponente restandole: " + (he.getPoderDeDanio() + (int)victima.getArtefacto().getAmplificadorDeDanio())+ " puntos a su salud.");
        System.out.println("                                                                                                 ");
        System.out.println("---------------------------------------------------------------------------------------------------------"); 
    }



    public Hechizo elegirHechizoDisponible(Wizard w) {

        System.out.println("Sus hechizos disponibles son: ");
        int i=0;
        for (Hechizo h  : w.getHechizos()){   
            System.out.println("..................................................."); 
            System.out.println((i+1) +("-") + h.getNombreDelPoder());
            System.out.println(h.getDescripcionDelPoder());
            i++;    
        }

        System.out.println("¿Con cuál de los hechizos disponibles desea atacar?");
        int numeroElegido = Teclado.nextInt();
        Hechizo h = w.hechizos.get(numeroElegido - 1);
        return h;
    }



    @Override

    public boolean estaVivo(){

        if (this.getSalud() > 0) {
            return true; 
        }else return false;                 
    }

}