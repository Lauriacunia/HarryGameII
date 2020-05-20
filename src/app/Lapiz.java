package app;

public class Lapiz {
    String ANSI_BLACK = "\u001B[30m";
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_BLUE = "\u001B[34m";
    String ANSI_PURPLE = "\u001B[35m";
    String ANSI_CYAN = "\u001B[36m";
    String ANSI_WHITE = "\u001B[37m";


    public void darBienvenida() {
        
        System.out.println(ANSI_CYAN + "===================================");
        System.out.println(ANSI_PURPLE + "    _/MMMMMMMMMMMm,");
        System.out.println(ANSI_PURPLE + "   _YMMMMMMMMMMMM(");
        System.out.println(ANSI_PURPLE + "  `MMMMMM        /  ");
        System.out.println(ANSI_PURPLE + "   MMM|  __  / __/  (  HARRY GAME");
        System.out.println(ANSI_PURPLE + "   YMM/_/# \\__/# \\    BY LAU Y ROMI");
        System.out.println(ANSI_PURPLE + "   (.   \\__/  \\__/    -ADA ENTERTAINMENTS.");
        System.out.println(ANSI_PURPLE + "             _,  |    ");
        System.out.println(ANSI_PURPLE + "_____/\\     _   /      ");
        System.out.println(ANSI_PURPLE + "    \\  `._____,'");
        System.out.println(ANSI_PURPLE + "     `..___(__");
        System.out.println(ANSI_PURPLE + "              ``-.");
        System.out.println(ANSI_CYAN + "===================================");

        System.out.println("                                  ");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*");
        System.out.println("Bienvenido a Harry Game");
        System.out.println("Viví tu aventura magica en el maravilloso mundo de Harry Potter");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*");
        System.out.println("                                  ");

        

    }

    public void dibujarBannerReproduciendoVideo() {
        System.out.println(ANSI_PURPLE + "******************************************************");
        System.out.println(ANSI_PURPLE + "*                                                    *");
        System.out.println(ANSI_PURPLE + "*    <<<<     REPRODUCIENDO ANIMACION     >>>>       *");
        System.out.println(ANSI_PURPLE + "*                                                    *");
        System.out.println(ANSI_PURPLE + "******************************************************");
    }

    public void dibujarEspada(){
    System.out.println(ANSI_YELLOW+"               --");
    System.out.println(ANSI_YELLOW+"    _         | |");
    System.out.println(ANSI_YELLOW+"   | | _______| |---------------------------------------------\\");
    System.out.println(ANSI_YELLOW+"   |:-)_______|==[]============================================>>>");
    System.out.println(ANSI_YELLOW+"   |_|        | |---------------------------------------------//");
    System.out.println(ANSI_YELLOW+"              |_|");
    }

    public void dibujarPatronus(){


System.out.println(ANSI_CYAN+"........*☆.¸.☆*'");        
System.out.println(ANSI_CYAN+".......*☆.@@ ☆*'");
System.out.println(ANSI_CYAN+".*☆.....@@@@☆*'");
System.out.println(ANSI_CYAN+"........@@@@@@");
System.out.println(ANSI_CYAN+"......☆*@@@@`*☆.¸¸");
System.out.println(ANSI_CYAN+".......\\\\||///.");
System.out.println(ANSI_CYAN+"........\\\\||//.");
System.out.println(ANSI_CYAN+".........ƸӜƷ.");
System.out.println(ANSI_CYAN+"..........\\|\\/..♥");
System.out.println(ANSI_CYAN+"............V....");
    }

    public void dibujarBasilisco(){

System.out.println(ANSI_RED+"        .o@*         ");
System.out.println(ANSI_RED+"        ..      .........   .u*    ^Rc        "); 
System.out.println(ANSI_RED+"      oP  *Lo*#*******7d  .d*N.   $         ");
System.out.println(ANSI_RED+"     @  u@..           .u*  o*    #L  ?b       "); 
System.out.println(ANSI_RED+"    @   *              . .d*  .d@@e$   ?b.      ");
System.out.println(ANSI_RED+"   8                    @*@me@#         '*Nu    ");
System.out.println(ANSI_RED+"  @                                        '#b  ");
System.out.println(ANSI_RED+".P                                           $r ");
System.out.println(ANSI_RED+".@@                                  $        $  ");
System.out.println(ANSI_RED+".@@                                   8*R      dP   ");
System.out.println(ANSI_RED+".d#d                                  .dP dd   .d#    "); 
System.out.println(ANSI_RED+".d#d                                  .dP dd   .d#    ");     
System.out.println(ANSI_RED+"$             s***             .u@*@     çççççdP  ");      
System.out.println(ANSI_RED+";?L  ..                    ..o@@@        .$  uP  ");        
System.out.println(ANSI_RED+"#c$.*u.             .u@***$          uR .@@   ");        
System.out.println(ANSI_RED+"?L$. '----***Nc    x@**   @*          d  JP   ");          
System.out.println(ANSI_RED+"^#$.        #L  .$     8*         d* d*  ");            
System.out.println(ANSI_RED+"*          bb.'$.   @@         $$ 88 ");              
System.out.println(ANSI_RED+"         ***@$L $&         $  @    ");             
System.out.println(ANSI_RED+"         @L    $$         dd 8   ");              
System.out.println(ANSI_RED+"         $$u.u$$         dF dF   ");               
System.out.println(ANSI_RED+"         $ $$$   o      dP xR   ");                
System.out.println(ANSI_RED+"         $      dFNu...@@  $  ");                  
System.out.println(ANSI_RED+"         NN..   ?B ^^^^^   :R  ");                  
System.out.println(ANSI_RED+"           ***** RL       d>    ");                
System.out.println(ANSI_RED+"                  $$u.   .$  ");                   
System.out.println(ANSI_RED+"                    ^^*bo@V   V  ");
    }

    public void dibujarCorazon(){

        System.out.println(ANSI_RED+"…………..*.");
        System.out.println(ANSI_RED+"……..*………*");
        System.out.println(ANSI_RED+"…..*……………*");
        System.out.println(ANSI_RED+"…*………………..*");
        System.out.println(ANSI_RED+"..*………………….*");
        System.out.println(ANSI_RED+".*……………………*………*….*");
        System.out.println(ANSI_RED+"*…………………….*…*…………..*");
        System.out.println(ANSI_RED+".*…………………….*……………….*");
        System.out.println(ANSI_RED+"..*…………………….*…………….*");
        System.out.println(ANSI_RED+"…*…………………………………*");
        System.out.println(ANSI_RED+"…..*…………………………….*");
        System.out.println(ANSI_RED+"……..*………………………*");
        System.out.println(ANSI_RED+"………..*………………….*");
        System.out.println(ANSI_RED+"……………*……………*");
        System.out.println(ANSI_RED+"………………*……….*");
        System.out.println(ANSI_RED+"…………………*…..*");
        System.out.println(ANSI_RED+"………………….*..*");
        System.out.println(ANSI_RED+"……………………*");
        System.out.println(ANSI_RED+"……………………*");
        System.out.println(ANSI_RED+"…………………..*");
        System.out.println(ANSI_RED+"……………………*");
        System.out.println(ANSI_RED+"……………………..*");
        System.out.println(ANSI_RED+"………………………..*");
        System.out.println(ANSI_RED+"………………………..*");
        System.out.println(ANSI_RED+"…………………………..*");
        System.out.println(ANSI_RED+"……………………………*");
        System.out.println(ANSI_RED+"………………………….*");
        System.out.println(ANSI_RED+"……………………….*");
        System.out.println(ANSI_RED+"………………………*");
        System.out.println(ANSI_RED+"…………………….*");
        

    }

    public void imprimirBannerTurno(Personaje p) {

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(" TURNO: " + p.getNombre());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");

}

public void imprimirBannerElegirJugador(int n) {
    System.out.println("                               ");
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("          Jugador " + n);
    System.out.println("  ¿Qué Wizard querés ser hoy? ");
    System.out.println("       Ingresa su numero ");
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("                                ");

}
public void preguntarEstrategia() {

    System.out.println("                                           ");
    System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
    System.out.println("Ahora ¿Qué estrategia de juego querés usar? ");
    System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
    System.out.println("                                           ");
    System.out.println("        1 -  ATACAR");
    System.out.println("                                           ");
    System.out.println("        2 -  APRENDER HECHIZO");
    System.out.println("                                           ");
    System.out.println("        3-   JUGAR TRIVIA");
    System.out.println("                                           ");
}


     
    public void mostrarBannerAprenderHechizo() {

    System.out.println();
    System.out.println("Aprender un hechizo te cuesta 35 puntos de tu Energia Magica");
    System.out.println();
    System.out.println("<<<<<<<<<<<<<<<<<<<< HECHIZOS >>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println();

}

	public void imprimirBannerEstado() {
    System.out.println("                                           ");
    System.out.println("¿Desea conocer su estado actual? 1- MOSTRAR 2- CONTINUAR");


	}
}