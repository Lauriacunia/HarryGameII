package app;

public class Horrocrux extends Artefacto implements IReliquiaMuerte{

    boolean estaDesaparecido;
    
    
    public Horrocrux(String nombre, int poderDeDaño, int poderDeCuración, double amplificadorDeDanio,
            double amplificadorDeCuracion, boolean estaDesaparecido) {
        super(nombre, poderDeDaño, poderDeCuración, amplificadorDeDanio, amplificadorDeCuracion);
        this.estaDesaparecido = estaDesaparecido;
    }

    public Horrocrux(){}
    
    public boolean isEstaDesaparecido() {
        return estaDesaparecido;
    }

    public void setEstaDesaparecido(boolean estaDesaparecido) {
        this.estaDesaparecido = estaDesaparecido;
    }
  
    @Override
    public boolean esReliquiaMuerte() {
        return false;
    }
        
    

 
}