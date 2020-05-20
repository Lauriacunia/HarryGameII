package app;

public class Centauro extends Criatura {

    private final int danioConGolpe = 5;

    public Centauro(String nombre, String descripcion, int energiaMagica, int salud, int poderDeDaño,
            int poderDeCuración) {
        super(nombre, descripcion, energiaMagica, salud, poderDeDaño, poderDeCuración);
    }

    public Centauro(){}
    
    public int getDanioConGolpe() {
        return danioConGolpe;
    }

    public void golpear(Personaje p){
        Centauro c = new Centauro("Magorian", "Es una criatura mágica, cuya cabeza, torso y brazos aparentemente humanos están unidos a un cuerpo de caballo.", 200, 150, 40, 20);
        p.setSalud(p.getSalud() - c.getDanioConGolpe());
        System.out.println("Eres atacado por el Centauro " + c.getNombre());
        System.out.println("Por eso pierdes puntos en tu Salud: " + c.getDanioConGolpe());
    }

}