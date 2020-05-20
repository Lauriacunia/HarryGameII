package app;

public class Varita extends Artefacto{

    int largo;
    String material;
    String nucleo;

    public Varita(String nombre, int poderDeDaño, int poderDeCuración, double amplificadorDeDanio,
            double amplificadorDeCuracion, int largo, String material, String nucleo) {
        super(nombre, poderDeDaño, poderDeCuración, amplificadorDeDanio, amplificadorDeCuracion);
        this.largo = largo;
        this.material = material;
        this.nucleo = nucleo;
    }
    public Varita(){}
    
    
    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNucleo() {
        return nucleo;
    }

    public void setNucleo(String nucleo) {
        this.nucleo = nucleo;
    }



  
    

}