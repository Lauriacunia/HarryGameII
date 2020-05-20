package app;

public class TrenExpresoHowards extends Transporte implements IEsMagico{

    private final double terminal = 9.75;
    private final String estacion =" King's Cross ";

    public TrenExpresoHowards(int velocidadMax, String descripcion, int gastoDeEnergiaMagica) {
		super(velocidadMax, descripcion, gastoDeEnergiaMagica);
	}

    public TrenExpresoHowards(){}
    
	public double getTerminal() {
		return terminal;
	}

	public String getEstacion() {
		return estacion;
	}


    @Override
    public boolean esInvisibleAMuggles() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean esInvisible() {
        // TODO Auto-generated method stub
        return false;
    }

    public void subir(Personaje p){
        p.setCasilleroActual(p.getCasilleroActual()+ 2);
    }
}