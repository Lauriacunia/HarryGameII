package app;

public class Desmaius extends HechizoAtaque {

    private boolean aturde;

    public Desmaius(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }
    public Desmaius(){}
    
    public boolean getAturde() {
        return aturde;
    }

    public void setAturde(boolean aturde) {
        this.aturde = aturde;
    }

    public void hechizar(Personaje p){

        System.out.println("Recibes un Hechizo Desmaius y quedas aturdido en el piso");
        p.setNombre("<<<<<< " + p.getNombre() + ">>>>>>>"); 
        
        for (int i = 0; i < 15; i++) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println(p.getNombre());
           
        }
        
    }



    

}