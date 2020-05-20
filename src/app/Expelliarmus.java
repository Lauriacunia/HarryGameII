package app;

public class Expelliarmus extends HechizoDefensa {

    private boolean desarmaAlOponente;
    
    public Expelliarmus(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public Expelliarmus(){}
    
    public boolean isDesarmaAlOponente() {
        return desarmaAlOponente;
    }

    public void setDesarmaAlOponente(boolean desarmaAlOponente) {
        this.desarmaAlOponente = desarmaAlOponente;
    }

    public void hechizar(Personaje p){
        if (p instanceof Wizard){
           Wizard w = (Wizard) p;
           w.setVarita(null); 
        }
        
        System.out.println("Tu oponente utiliza el Hechizo Expelliarmus");
        System.out.println("Con esto logra desarmarte y...¡¡¡¡¡¡ pierdes tu varita!!!!");
        System.out.println("Que pena Wizard, ahora no tienes varita");
        System.out.println(                                                  );
        


    }

}