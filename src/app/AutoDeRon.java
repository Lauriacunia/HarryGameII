package app;

public class AutoDeRon extends Transporte{

    private final String modelo = "105E Ford Anglia ";

    public AutoDeRon(int velocidadMax, String descripcion, int gastoDeEnergiaMagica) {
        super(velocidadMax, descripcion, gastoDeEnergiaMagica);
    }

    public AutoDeRon(){}

    public String getModelo() {
        return modelo;
    }


    public void volar(Personaje p){
        p.setCasilleroActual(p.getCasilleroActual()+ 10);
        p.setEnergiaMagica(p.getEnergiaMagica() + 10);
        
    }


}