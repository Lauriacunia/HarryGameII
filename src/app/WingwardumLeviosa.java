package app;

public class WingwardumLeviosa extends HechizoOcio{

    private boolean esSencillo;

    public WingwardumLeviosa(String nombreDelPoder, String descripcionDelPoder, int poderDeDanio, int poderDeCuracion) {
        super(nombreDelPoder, descripcionDelPoder, poderDeDanio, poderDeCuracion);
    }

    public WingwardumLeviosa(){}


    public boolean isEsSencillo() {
        return esSencillo;
    }

    public void setEsSencillo(boolean esSencillo) {
        this.esSencillo = esSencillo;
    }

    
    public void hechizar(Personaje p){

        System.out.println("                                  "+ p.getNombre());
        System.out.println("                                        o ");
        System.out.println("                                      o");
        System.out.println("                                    o");
        System.out.println("                                 o");
        System.out.println("                             o");
        System.out.println("                         o");
        System.out.println("                    o");
        System.out.println("                o");
        System.out.println("Wingardeeeemmm Liviosaaaaaaa ------");

    }
    

}