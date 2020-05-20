package app;

import java.util.ArrayList;
import java.util.List;

public class Persona extends Personaje {
    
    private String personalidad;
    
    public Persona(String nombre, String descripcion, int energiaMagica, int salud) {
        super(nombre, descripcion, energiaMagica, salud);
    }
    public Persona(){}

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

  

   
 

   }