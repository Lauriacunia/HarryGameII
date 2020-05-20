package app;

public class AutobusNoctambulo extends Transporte{

    public void subirPasajero(Personaje p){
        p.setCasilleroActual(p.getCasilleroActual()+ 10);
    }
}