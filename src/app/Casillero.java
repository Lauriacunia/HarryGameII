package app;

public class Casillero {

    
    
    int opcion;
    public int jugarCasillero(Personaje p , int c) {
    
        
    Personaje personajeQueJuega = p;
    Lapiz lapicito = new Lapiz();
    lapicito.dibujarBannerReproduciendoVideo();
        switch (c) {    

            case 1:

                System.out.println("Escena de : Harry Potter y Las Reliquias de la muerte, Parte 2");
                System.out.println("Harry Potter recorre los pasillos de howard con su capa de Invisibilidad");
                System.out.println("Tu tomas prestada la capa para jugar este juego");
                System.out.println("                                               ");
                CapaInvisibilidad capa = new CapaInvisibilidad();
                capa.hacerInvisible(personajeQueJuega);
                
                break;
            case 2:

                System.out.println("Escena de: Harry Potter y el Prisionero de Azkaban");
                System.out.println("Harry lucha contra cientos de dementores protegiendo"); 
                System.out.println("a su padrino Sirius Black que se encuentra al borde de la muerte");
                System.out.println("cuando todo parece estar perdido ve a lo lejos al Patronus de su madre... ");

                Patronus patronus = new Patronus();
                patronus.proteger(personajeQueJuega);
                
             
                break;
            case 3:

            WingwardumLeviosa win = new WingwardumLeviosa();
                System.out.println("Escena de : Harry Potter y la Piedra Filosofal");
                System.out.println("Hermoine siempre tan sabelotoda aprende rapido el Hechizo Wingardium Leviosa");
                System.out.println("En cambio Neville praticando te hechiza sin querer y !comenzás a levitar!");
                System.out.println("                              ");

                win.hechizar(personajeQueJuega);
                

                break;
            case 4:

            TrenExpresoHowards trenEH = new TrenExpresoHowards();
            trenEH.subir(personajeQueJuega);

                System.out.println("Escena de: Harry Potter y la Piedra Filosofal");
                System.out.println("¡¡Hoy es tu primer dia en Howard Wizard!!");
                
                System.out.println("Tomás el tren Expreso Howards, por eso avanzas 2 casilleros.  ");
              
            
                
                break;
            case 5:

                Engorgio engorgio = new Engorgio();
                System.out.println("Escena de: Harry Potter y el Prisionero de Azkaban");
                System.out.println("La varita de Ron se rompió y cuando intenta aprender un hechizo en clase");
                System.out.println("se le escapa un hechizo engorgio y sin querer te hechiza");
                
                engorgio.hechizar(personajeQueJuega);
               

                break;
            case 6:


                System.out.println("Escena de: Harry Potter y la Cámara Secreta");
                System.out.println("La batalla entre Harry y el Basilisco: ");
                System.out.println("Caiste en la cámara de los secretos, ");
                System.out.println("donde habita el basilisco. "); 

                Serpiente basilisco = new Serpiente();
                basilisco.atacar(personajeQueJuega);
                

                break;
            case 7:
     
                System.out.println("Escena de: Harry Potter y las Reliquias de la Muerte");
                System.out.println("La orden del Fenix intenta trasladar a Harry Potter a salvo de los Dementores");
                System.out.println("Para eso toman la pocion Multijugos. ¡¡¡Ahora hay 7 Harrys!!");
                System.out.println("Vos tambien tendrás 7 copias tuyas a partir de ahora!");
                personajeQueJuega.setNombre(personajeQueJuega.getNombre() + " " + personajeQueJuega.getNombre() + " " + personajeQueJuega.getNombre() + " "+ personajeQueJuega.getNombre()  + " "+ personajeQueJuega.getNombre()+ " " + personajeQueJuega.getNombre()+ " " + personajeQueJuega.getNombre());
                
                System.out.println(personajeQueJuega.getNombre());
                break;
            case 8:
    
                System.out.println("Escena de: Harry Potter y la Piedra Filosofal");
                System.out.println("Harry atrapa la 'snitch': ");
                System.out.println("Alguien piensa en vos y te envía una escoba nueva de regalo");
                System.out.println("Es una ¡¡Nimbus2001!!");
                System.out.println("Felicitaciones!");

                Escoba nimbus2001 = new Escoba("Nimbus 2001", 90, "Es más rápida que su predecesora, la Nimbus 2000.", 30,
                100);

                System.out.println(nimbus2001.getNombre());
                System.out.println(nimbus2001.getDescripcion());
                System.out.println("Velocidad Maxima: " + nimbus2001.getVelocidadMax());
                System.out.println("Precio: " + nimbus2001.getPrecio());
                
                if (personajeQueJuega instanceof Wizard){
                     Wizard w = (Wizard)personajeQueJuega;
                    w.setEscoba(nimbus2001);
                }
              
                
                break;
            case 9:

                System.out.println("La Muerte de Voldemort"+
                "Harry Potter y las Reliquias de la muerte, Parte 2");
 
                break;

            case 10:
                System.out.println("Escena de: Harry Potter y la Orden del Fénix");
                
                System.out.println("Dobby intenta rescatar a Harry y sus amigos del Ministerio de la Magia, y dice:");
                System.out.println("                Dobby es un Elfo libre, ");
                System.out.println("              Dobby es amigo de Harry potter ");
                System.out.println("              y Dobby vino a rescatar Harry potter ");
                System.out.println("Mientras se teletrasportan Blellatrix le lanza un cuchillo a Dobby y lo mata");
                System.out.println("                                                                        ");
                System.out.println("Murió un amigo. Estás profundamente triste");
                System.out.println("Tu salud disminuye 50 puntos");

                personajeQueJuega.setSalud(personajeQueJuega.getSalud() -50);   
                
             
                
                break;
            case 11:
    
                AutobusNoctambulo autobus = new AutobusNoctambulo();
                autobus.subirPasajero(personajeQueJuega);

                System.out.println("                                                            ");
                System.out.println("Escena de: Harry Potter y el Prisionero de Azkaban ");
                System.out.println("Harry se cansa de los malos tratos de su familia y se va de su casa en la mitad de la noche");
                System.out.println("                                                            ");
                System.out.println("Viajan tan rápido por la ciudad que avanzás 10 casilleros. ¡Genial!");
                System.out.println("                                                            ");
                break;
            
            case 12:

               
                System.out.println("Harry Potter y la Piedra Filosofal");
                break;

            case 13:
                System.out.println("El Duelo entre Harry y Draco"+
                "Harry Potter y la Cámara Secreta");

                

                break;
            case 14:

                System.out.println("Escena de: Harry Potter y las Reliquias de la Muerte, Parte 2");
                System.out.println("La muerte de Severus Snape: ");
                System.out.println("debes enfrentarte a tu oponente para ");
                System.out.println("así obtener la varita de sauco y vengar");
                System.out.println("a Snape. ");
                
                break;
            case 15:
 
                System.out.println("El espejo de Odesed"+
                "Harry Potter y la Piedra filosofal.");
                break;
            
            case 16:

                System.out.println("Escena de: Harry Potter y las Reliquias de la Muerte, Parte 2");
                System.out.println("Molly Weasley mata a Bellatrix Lestrange: ");
                
                ;
                break;
            case 17:
                System.out.println("La muerte de Dobby"+
                "Harry Potter y las Reliquias de la Muerte, Parte 1");
                break;
            case 18:

                System.out.println("Escena de: Harry Potter y la Cámara Secreta");
                
                
                break;
            case 19:

                AutoDeRon autoDeRon = new AutoDeRon();
                autoDeRon.volar(personajeQueJuega);

                System.out.println("                                                            ");
                System.out.println("Escena de: Harry Potter y la camara secreta");
                System.out.println("Harry y Ron llegan Tarde a tomar el Tren de Howards");
                System.out.println("Entónces Ron no tiene mejor idea que ir en el auto de su familia");
                System.out.println("Ambos viven una divertia travesia en el Ford Anglia volador");
                System.out.println("                                                            ");
                System.out.println("Te divertiste tanto que sumas 10 puntos a tu Energia Magica");
                System.out.println("y avanzas 10 casilleros");
                System.out.println("                                                            ");
                

                break;
            case 20:

                System.out.println("Escena de: Harry Potter y el Cáliz de Fuego");
                System.out.println("Harry vs Colacuerno Húngaro:  ");
                
                break;
            case 21:
 
                System.out.println("La Muerte de Hedwig"+
                "Harry Potter y las Reliquias de la Muerte, Parte 1");
                break;
            
            case 22:


                System.out.println("Escena de: Harry Potter y el Cáliz de Fuego");
                System.out.println("La muerte de Cedric Diggory: ");
                
                
                break;
            case 23:

            Dementor dementor = new Dementor();
            dementor.darBeso(personajeQueJuega);
                System.out.println("                                         ");
                System.out.println("Escena de: Harry Potter y el Prisionero de Azkaban");
                System.out.println("Los dementores estan buscando a Sirius Black que acaba de escapar de Azkaban");
                System.out.println("Uno de ellos se acerca a ti mientras viajas en el tren hacia Howards");
                System.out.println("Sientes terrory te paralizas");
                System.out.println("El dementor intenta alimentarse tus peores miedos ");
                System.out.println("                                         ");
                System.out.println("Debido a ese encuentro pierdes 50 puntos de tu  Salud y te debilitas");
                

                break;
            case 24:
                
                System.out.println("Escena de: Harry Potter y el Prisionero de Azkaban");
               
                
                break;
            case 25:
    
                Imperius imperius = new Imperius();
                System.out.println("Escena de: Harry Potter y la Orden del Fénix");
                System.out.println("Dumbledore está en una batalla de Wizards contra Valdemort");
                System.out.println("Vos querés ayudar a Dumbledore y con tu varita haces el hechizo Imperius contra Voldemort");
                System.out.println("                                                            ");
                imperius.hechizar(personajeQueJuega);
                break;
            
            case 26:
            
                System.out.println("La Pelea de Snape y McGonagall: ");
                System.out.println("Escena de: Harry Potter y las Reliquias de la muerte, Parte 2");
                break;
            
            case 27:

                System.out.println("Escena de: Harry Potter y las Reliquias de la muerte, Parte 2"); 
                System.out.println("Todo Howards se está defendiendo del ataque de los Mortifagos y Voldemort");
                System.out.println("Neville Longbottom pelea contra Nagini hasta que finalmente logra matarla con la Espada de Gryffindor");
                System.out.println("                                                            ");
                EspadaDeGryffindor espada = new EspadaDeGryffindor();
                espada.usarEspada(personajeQueJuega);

                break;
           
            case 28:

                System.out.println("Escena de: Harry Potter y las Reliquias de la muerte, parte 1");
                System.out.println("Infiltración en el Ministerio de Magia: ");
                System.out.println("caen en el ministerio de Magia y deben huir de Dolores Umbrige. ");
                break;
            
            case 29:

                System.out.println("El encantamiento Piertotum Locomotor");
                break;

            case 30:


                System.out.println("Escena de: Harry Potter y la Orden del Fénix");
                System.out.println("La huída de Dumbledore");
                
                
                break;
            case 31:

                System.out.println("La Muerte de Dumbledore"+
                "Harry Potter y el Misterio del Príncipe");

                

                break;
            case 32:

                System.out.println("Escena de: Harry Potter y el Cáliz de Fuego");
                System.out.println("El renacimiento de Voldemort: ");   
                
                
                break;
            case 33:
 
                System.out.println("El encantamiento Riddikulus contra el Boggart"+
                "Harry Potter y el Prisionero de Akaban");
                break;
            case 34:


                System.out.println("Escena de: Harry Potter y las Reliquias de la Muerte, Parte 2");
                
                
                break;
            case 35:
            lapicito.dibujarBannerReproduciendoVideo();
                System.out.println("El troll de montaña se cuela en Hogwarts"+
                "Harry Potter y la Piedra Filosofal");

               

                break;
            case 36:

                System.out.println("Escena de: Harry Potter y las Reliquias de la Muerte, Parte 1");
                
                
                break;
            case 37:
  
                System.out.println("La Fábula de los Tres Hermanos"+
                "Harry Potter y las Reliquias de la Muerte, Parte 1");
                break;
            case 38:
   

                System.out.println("Escena de: Harry Potter y la Piedra Filosofal");
                System.out.println("La partida de ajedrez de Ron:");
                System.out.println("la batalla ahora será sobre una tabla de ajedrez, ");
                System.out.println("quien gane obtendrá la piedra filosofal. ");
                
                break;
            case 39:

                System.out.println("Escena de: Harry Potter y las Reliquias de la Muerte, Parte 2");
                System.out.println("Finalmente triunfa el amor: Ron y Hermione se dan su primer beso");
                System.out.println("El amor hace bien. Por eso sumás 20 puntos a tu salud"); 

                personajeQueJuega.setSalud(personajeQueJuega.getSalud() + 20 );
                lapicito.dibujarCorazon();

               
                break;
            case 40:

                System.out.println("Escena de: Harry Potter y el Prisionero de Azkaban");
                System.out.println("Hermione golpea a Draco: ");  
                System.out.println("ambos se vuelven muggles y ");
                System.out.println("deben luchar sin nigún hechizo,");
                System.out.println("todos se anulan. Y solo pueden ");
                System.out.println("usar hechizos aprendidos sin una ");
                System.out.println("varita. ");
                
                break;
            case 41:

                System.out.println("Escena de: Harry Potter y las Reliquias de la Muerte, Parte 2");
                System.out.println("La orden del Fenix está defiendiendo a Harry Potter");
                System.out.println("En el enfrentamiento con los Mortífagos muere Fred Weasley");
                Expelliarmus e = new Expelliarmus();
                e.hechizar(personajeQueJuega);
                break;
            case 42:
            
                System.out.println("Escena de: Harry Potter y la Piedra Filosofal");
                System.out.println("Hermione conoce por primera vez a Harry y Ron: ");
                   
                break;
            
                case 43:
    
                System.out.println("Escena de: Harry Potter y el Prisionero de Azkaban ");
                System.out.println("Harry y Hermione viajan con el Giratiempo, logran salvar al Hipogrifo,");
                System.out.println("y a Harry del ataque de los Dementores ");
                Giratiempo g = new Giratiempo();
                g.viajarEnElTiempo(personajeQueJuega);
                
                break;
            case 44:

                System.out.println("La lección de baile de Minerva McGonagal: ");
                System.out.println("el nuevo escenario es ahora el baile. ");
                System.out.println("Escena de Harry Potter y el Cáliz de Fuego");
                
               
                break;
            case 45:
                System.out.println("Escena de: Harry Potter y las Reliquias de la Muerte, Parte 1.");
                System.out.println(" Hermoine se da cuenta que siente algo por Ron");
                System.out.println("Pero Ron es codiciado por otras chicas de Howards");
                System.out.println("¿Alguna vez tuviste un amor no correspondido?");
                System.out.println("                                                  ");

                Enamoramiento en = new Enamoramiento();
                en.enamorar(personajeQueJuega);


                
                break;
            case 46:
                
                System.out.println("Escena de: Harry Potter y el Cáliz de Fuego");
                System.out.println("El Baile de Navidad: la pelea continua. ");
                
                break;
            case 47:
   
                    System.out.println("Remus Lupin se convierte en hombre-lobo"+
                "Harry Potter y el Prisionero de Azkaban");
                break;
            
            case 48:

                System.out.println("Escena de Harry Potter y el Misterio del Príncipe");
                System.out.println("Ron deslumbra jugando al Quidditch: ");     

                

                break;
            case 49:

                System.out.println("Escena de: Harry Potter y el Prisionero de Azkaban");
                System.out.println("Bartemius Crouch, hijo del Ministro de Magia esta infiltrado en Howard");
                System.out.println("Desde ahi intenta envenenar a Dumbledore con un licor");
                System.out.println("Vos tambien tomaste del mismo licor envenenado");
                System.out.println("                                                          ");

                Veneno v = new Veneno();
                v.envenenar(personajeQueJuega);
                break;

            case 50:  
                System.out.println("Harry Potter y la Cámara Secreta");
                System.out.println("Hermione se convierte en gato con la poción multijugos: ");
                
                break;

        }
        return opcion;

    }

    

}