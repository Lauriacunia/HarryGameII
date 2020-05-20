package app;

public class ParseTongue extends Poder{

    private boolean esUtil;

	public ParseTongue(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuración) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuración);
    }

    public ParseTongue(){}
    
    public boolean isEsUtil() {
        return esUtil;
    }

    public void setEsUtil(boolean esUtil) {
        this.esUtil = esUtil;
    }

    

    


    

}