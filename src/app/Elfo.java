package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Elfo extends Criatura implements IHaceMagia {
    public static Scanner Teclado = new Scanner(System.in);

    private String amo;
    private Artefacto artefacto;
    private List<Artefacto> artefactos = new ArrayList<>();
    private List<Hechizo> hechizos = new ArrayList<>();

    public Elfo(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño, int poderDeCuración) {
        super(nombre, descripcion, energiaMagica, salud, poderDeDaño, poderDeCuración);
    }

    public Elfo(){
        
    }

    public String getAmo() {
        return amo;
    }

    public void setAmo(String amo) {
        this.amo = amo;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
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


    @Override
    public Poder getPoderInicial() {
        return this.getPoderInicial();
    }

    @Override
    public void setPoder(Poder poder) {
        this.setPoder(poder);

    }

    @Override
    public Artefacto getArtefacto() {
        return this.getArtefacto();
    }

    @Override
    public void aprender(Hechizo h) {
        this.getHechizos().add(h);
    }

    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {
        personaje.setSalud(personaje.getSalud() - (hechizo.getPoderDeDanio())); 
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Usaste el hechizo " + hechizo.getNombreDelPoder());
        System.out.println("                                       ");
        System.out.println("Lograste debilitar a tu oponente restandole: " + (hechizo.getPoderDeDanio()) + " puntos a su salud.");
        System.out.println("                                       ");
        System.out.println("-----------------------------------------------------------------------------"); 
    }

    @Override
    public void atacar(Personaje personaje, String hechizo) {
        Hechizo he = new Hechizo(); 
        for(Hechizo h: hechizos){
            if(h.getNombreDelPoder().equals(hechizo)){
               he = h;
            }
           
        }   
        personaje.setSalud(personaje.getSalud() - he.getPoderDeDanio()); 
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Usaste el hechizo " + (he.getPoderDeDanio()));
        System.out.println("                                "); 
        System.out.println("Lograste debilitar a tu oponente restandole: " + (he.getPoderDeDanio()) + " puntos a su salud.");
        System.out.println("                                "); 
        System.out.println("--------------------------------------------------------------------------------------------");

    }

    public Hechizo elegirHechizoDisponible(Elfo e) {

        System.out.println("Sus hechizos disponibles son: ");
        int i=0;
        for (Hechizo h  : e.getHechizos()){    
            System.out.println((i+1) + h.getNombreDelPoder());
            i++;    
        }

        System.out.println("¿Con cuál de los hechizos disponibles desea atacar?");
        int numeroElegido = Teclado.nextInt();
        Hechizo h = e.hechizos.get(numeroElegido - 1);
        return h;
    }

}