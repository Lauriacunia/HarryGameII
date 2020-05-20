package app;

public class CaecaTemporalis extends HechizoDefensa {


    public CaecaTemporalis(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public CaecaTemporalis(){

    }
    
    public void hechizar(Personaje p){
        System.out.println("Gracias al hechizo Caeca Temporalis puedes volverte invisible");
        System.out.println("Eres un gran Wizard!! Tu Energia Magica mejora 10 puntos");

        p.setNombre(" ( ◕ ٥ ◕ )  nadie te ve                      ");
        p.setEnergiaMagica(p.getEnergiaMagica() + 10);    
    }

    
}