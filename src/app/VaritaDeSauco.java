package app;

public class VaritaDeSauco extends Varita implements IReliquiaMuerte{

    public VaritaDeSauco(String nombre, int poderDeDaño, int poderDeCuración, double amplificadorDeDanio,
            double amplificadorDeCuracion, int largo, String material, String nucleo) {
        super(nombre, poderDeDaño, poderDeCuración, amplificadorDeDanio, amplificadorDeCuracion, largo, material,
                nucleo);
    }

    
    public VaritaDeSauco(){}

    @Override
    public boolean esReliquiaMuerte() {  
        return true;
    }
   

    
    
}