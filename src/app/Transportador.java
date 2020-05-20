package app;

public class Transportador extends Transporte {

    private String objeto;

    public Transportador(int velocidadMax, String descripcion, int gastoDeEnergiaMagica, String objeto) {
        super(velocidadMax, descripcion, gastoDeEnergiaMagica);
        this.objeto = objeto;
    }
    public Transportador(){}
    
    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    

}