package app;

public class PartisTemporus extends HechizoDefensa {

    private String esUnEscudo;

    public PartisTemporus(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public PartisTemporus(){}
    
    public String getEsUnEscudo() {
        return esUnEscudo;
    }

    public void setEsUnEscudo(String esUnEscudo) {
        this.esUnEscudo = esUnEscudo;
    }

}