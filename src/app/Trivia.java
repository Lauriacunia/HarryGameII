package app;
import java.util.Scanner;

public class Trivia {
    public static Scanner Teclado = new Scanner(System.in);

    int min = 1;
    int max = 15;

    public int responderPregunta() {
        System.out.println(                                                                  );
        System.out.println("..........................................................................................");
        System.out.println("               Es el momento de demostrar cuanto sabés acerca de Harry Potter");
        System.out.println("...........................................................................................");
        System.out.println("                     Si acertás sumas 10 puntos a tu Energía Mágica");
        System.out.println(                                                                  );

        int numeroTrivia = (int) (Math.random() * ((max - min) + 1)) + min;
        int respuesta = 0;
      //respuesta correcta return 1, erronea return 0
        switch (numeroTrivia) {
                  
            case 1:
                System.out.println("------------------------------------------------------");
                System.out.println(" ¿Cuál de los siguientes hechizos es obra de Snape?  ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("              1-Abracadabra  ");
                System.out.println("              2-Serpensortia  ");
                System.out.println("              3-Sectumsempra   ");
                System.out.println("              4- Tarantallegrra ");
                
                respuesta = Teclado.nextInt();

                if (respuesta==3) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 3-Sectumsempra x  ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;

            case 2:
                System.out.println("------------------------------------------------------");    
                System.out.println(" ¿Quienes sufrieron el ataque del basilisco en La cámara secreta? ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("          1- Hermione y Ginny Weasly");
                System.out.println("          2- Pansky Parkinson y Lavender Brown ");
                System.out.println("          3-  Hermione y Cho Chang  ");
                System.out.println("          4-Hermione y Penélope Cleanwater ");
                respuesta = Teclado.nextInt();

                

                if (respuesta==4) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 4-Hermione y Penélope Cleanwater x    ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;

            case 3:
                System.out.println("------------------------------------------------------");
                System.out.println(" ¿Quién le entregó a Harry la capa de invisibilidad? ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta:");

                System.out.println("              1- Dumbledore ");
                System.out.println("              2- Sirius ");
                System.out.println("              3- Rubeus Hagrid  ");
                System.out.println("              4-Luppin");

                respuesta = Teclado.nextInt();

                if (respuesta==1) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 1- Dumbledore x ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;
            case 4:
                System.out.println("------------------------------------------------------");
                System.out.println(" ¿Qué libro utilizaba la señora Weasley para 'desgnomizar' su jardín? ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("  1-La guía de Gilderoy Lockhart para las plagas en el hogar   ");
                System.out.println("  2- La guía de Gilderoy Lockhart para los gnomos de jardín ");
                System.out.println("  3- La guía Weasley para espantar intrusos  ");
                System.out.println("  4- La guía de Gilderoy Lockhart para las plagas de jardín ");

                respuesta = Teclado.nextInt();

                if (respuesta==1) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 1-La guía de Gilderoy Lockhart para las plagas en el hogar x   ");
                    System.out.println(                                                      );
                    respuesta = 0;

                }
                break;

            case 5:
                System.out.println("------------------------------------------------------------------------");
                System.out.println(" ¿Qué significa el lema de Hogwarts, Draco dormiens nunquam titillandus? ");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("           1- Nunca sueñes con dragones ");
                System.out.println("           2- Nunca hagas cosquillas a un dragón dormido ");
                System.out.println("           3- Nunca duermas si hay un dragón cerca ");
                System.out.println("           4- Si sueñas con dragones escupirás fuego ");

                respuesta = Teclado.nextInt();

                if (respuesta==2) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 2- Nunca hagas cosquillas a un dragón dormido x  ");
                    System.out.println(                                                      );
                    respuesta = 0;

                }
                break;

            case 6:
               System.out.println("------------------------------------------------------");    
             System.out.println("  ¿Qué forma adquiere el 'Expecto Patronum' de Harry Potter?  ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("               1- Un ciervo  ");
                System.out.println("               2-Un gato negro  ");
                System.out.println("               3- Una serpiente ");
                System.out.println("               4- Un unicornio ");

                respuesta = Teclado.nextInt();

                if (respuesta==1) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 1- Un ciervo x ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;
            case 7:
                System.out.println("------------------------------------------------------"); 
                System.out.println(" ¿Qué rasgo físico de los siguientes NO corresponde a Harry Potter?");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("          1- Ninguno de los citados  ");
                System.out.println("          2-Una cicatriz con forma de rayo en su frente  ");
                System.out.println("          3- Pelo oscuro siempre despeinado ");
                System.out.println("          4- Ojos verdes brillantes  ");
                
                respuesta = Teclado.nextInt();

                if (respuesta==1) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 1- Ninguno de los citados x   ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;
            case 8:
                System.out.println("------------------------------------------------------");    
                System.out.println("  Un squib es una persona…  ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("      1- no mágica nacida al menos de un progenitor mago  ");
                System.out.println("      2- Que trabaja en Hogwarts ");
                System.out.println("      3- Que odia a los muggles  ");
                System.out.println("      4- Que juega al squibich ");
                
                respuesta = Teclado.nextInt();

                if (respuesta==1) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es:1- no mágica nacida al menos de un progenitor mago x  ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;
            case 9:
                System.out.println("------------------------------------------------------");
                System.out.println(" ¿Qué sucede si se conjura el hechizo 'Wingardium Leviosa’?  ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("          1- Se levanta un huracán ");
                System.out.println("          2- Se levantan objetos en el aire  ");
                System.out.println("          3- Se paraliza a la persona o cosa ");
                System.out.println("          4- Crecen raíces-cepo de cualquier suelo ");

                respuesta = Teclado.nextInt();

                if (respuesta==2) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 2-Se levantan objetos en el aire x  ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;
            case 10:
                System.out.println("------------------------------------------------------");    
                System.out.println(" ¿Quién lleva unas gafas más grandes que las de Harry Potter?  ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("          1- Rita Skeeter ");
                System.out.println("          2- Nadie más tiene gafas  ");
                System.out.println("          3- Sybil Trelawney  ");
                System.out.println("          4- Myrtle la llorona  ");

                respuesta = Teclado.nextInt();

                if (respuesta==3) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 3- Sybil Trelawney  x   ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;
            case 11:
                System.out.println("------------------------------------------------------");    
                System.out.println("  ¿Quién es Merope Gaunt?  ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("         1- La profesora suplente de Herbología  ");
                System.out.println("         2- La madre de Lord Voldemort   ");
                System.out.println("         3- La madre de Hermione ");
                System.out.println("         4- La enfermera de Hogwarts ");

                respuesta = Teclado.nextInt();

                if (respuesta==2) {
                    
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 2- La madre de Lord Voldemort x     ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;
            case 12:
                System.out.println("------------------------------------------------------");
                System.out.println(" ¿Qué pasa si un mago lanza el conjuro Lumos?  ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("        1- La punta de su varita se ilumina ");
                System.out.println("        2- Apaga todas las luces  ");
                System.out.println("        3- Enciende todas las bombillas en un radio de 4 metros ");
                System.out.println("        4- Detecta la presencia de un hombre lobo  ");

                respuesta = Teclado.nextInt();

                if (respuesta==1) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 1-La punta de su varita se ilumina x  ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;
            case 13:
                System.out.println("------------------------------------------------------");    
                System.out.println(" ¿Cómo se llama el gato de Hermione?  ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("         1- Kneazle  ");
                System.out.println("         2- Crookshanks ");
                System.out.println("         3 -Cocoloco  ");
                System.out.println("         4- Crookshaks  ");

                respuesta = Teclado.nextInt();

                if (respuesta==2) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 2- Crookshanks x  ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;
            case 14:
                System.out.println("------------------------------------------------------");
                System.out.println(" ¿Qué asignatura odia Harry Potter en Hogwarts? ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("           1- Adivinación  ");
                System.out.println("           2- Herbología ");
                System.out.println("           3- Defensa contra las Artes Oscuras ");
                System.out.println("           4- Cuidado de Criaturas Mágicas ");

                respuesta = Teclado.nextInt();

                if (respuesta==1) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 1- Adivinación x ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;
            case 15:
                System.out.println("------------------------------------------------------");
                System.out.println("  El ‘quidditch’ es…  ");
                System.out.println("------------------------------------------------------");
                System.out.println(" Elija la opcion correcta: ");

                System.out.println("     1- El deporte favorito de Harry Potter  ");
                System.out.println("     2- La lengua en clave de los de Gryffindor  ");
                System.out.println("     3- El arte de hacer las mejores varitas mágicas ");
                System.out.println("     4- Un postre típico de Hogwarts ");

                respuesta = Teclado.nextInt();

                if (respuesta==1) {
                    System.out.println("¡Acertaste! Sumaste 10 puntos a tu Energia Magica");
                    System.out.println(                                                      );
                    respuesta= 1;
                    
                } else {
                    System.out.println("Lo siento, respuesta incorrecta");
                    System.out.println("La respuesta correcta es: 1-El deporte favorito de Harry Potter x ");
                    System.out.println(                                                      );
                   
                    respuesta = 0;

                }
                break;
           
        }
        return respuesta;
        
            
    }

} 


