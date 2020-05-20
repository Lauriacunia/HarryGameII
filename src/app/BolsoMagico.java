package app;

public class BolsoMagico extends Artefacto {

    private int cantidadDeObjetos;

    public BolsoMagico(String nombre, int poderDeDaño, int poderDeCuración, double amplificadorDeDanio,
            double amplificadorDeCuracion) {
        super(nombre, poderDeDaño, poderDeCuración, amplificadorDeDanio, amplificadorDeCuracion);
    }

    public BolsoMagico(){}
    
    public int getCantidadDeObjetos() {
        return cantidadDeObjetos;
    }

    public void setCantidadDeObjetos(int cantidadDeObjetos) {
        this.cantidadDeObjetos = cantidadDeObjetos;
    }

    public void abrirBolso(Personaje p, BolsoMagico b){
        System.out.println("Siempre guardas todo lo que necesitas en tu Bolso Magico");
        System.out.println("Usaste la carpa para protegerte en medio del bosque");
        System.out.println("Por eso mejoraste tu Salud y tu Energia Magica");
        p.setSalud(p.getSalud()+ b.getPoderDeCuración());
        p.setEnergiaMagica(p.getEnergiaMagica()+ b.getPoderDeCuración());

    }

}