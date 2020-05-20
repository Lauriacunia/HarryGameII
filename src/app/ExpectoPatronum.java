package app;

public class ExpectoPatronum extends HechizoDefensa {


    private int duracionDelEfecto;

    public ExpectoPatronum(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }
    public ExpectoPatronum(){}
    
    public int getDuracionDelEfecto() {
        return duracionDelEfecto;
    }

    public void setDuracionDelEfecto(int duracionDelEfecto) {
        this.duracionDelEfecto = duracionDelEfecto;
    }

    public void proteger(Personaje p){
        p.setEnergiaMagica(p.getEnergiaMagica() + 50 );
        p.setSalud(p.getSalud() + 50);
        System.out.println("Con el Especto Patronum te proteges del ataque de los Dementores");
        System.out.println("Mejoras tu Energia Magica y tu Salud en 50 puntos"); 
    }
    

}