package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuegoHP {

        public static Scanner Teclado = new Scanner(System.in);
        List<Personaje> personajes = new ArrayList<>();
        List<Hechizo> hechizos = new ArrayList<>();

        Lapiz lapiz = new Lapiz();
     
        public List<Personaje> getPersonajes() {
                return personajes;
        }

        public void setPersonajes(List<Personaje> personajes) {
                this.personajes = personajes;
        }

        public List<Hechizo> getHechizos() {
                return hechizos;
        }

        public void setHechizos(List<Hechizo> hechizos) {
                this.hechizos = hechizos;
        }

        public void inicializarJuego() {

        // ESCOBAS
        Escoba nimbus2000 = new Escoba("Nimbus 2000", 70,
                "Producida por la Compañía de Escobas de Carreras Nimbus como parte de su exitosa línea de escobas de carreras.",
                20, 60);

        Escoba nimbus2001 = new Escoba("Nimbus 2001", 90, "Es más rápida que su predecesora, la Nimbus 2000.", 30,
                100);

        Escoba barredora7 = new Escoba("Barredora7", 60, " Su nivel era similar a la de una Nimbus 2000.", 15, 40);

        //ARTEFACTOS

        CapaInvisibilidad capaInvisibilidad = new CapaInvisibilidad("CapaInvisibilidad", 0, 10, 0, 0, false);

        Horrocrux guardapeloDeSlytherin = new Horrocrux("Horrocrux", 40, 0, +40, 0, false);

        Horrocrux diarioDeTomRiddle = new Horrocrux("Horrocrux", 40, 0, +40, 0, false);

        Horrocrux diademaDeRowenaRavenclaw = new Horrocrux("Horrocrux", 40, 0, +40, 0, false);     

        Varita varitaDeHarry = new Varita("Varita de Harry Potter", 10, 10,5,5, 11, "Acebo", "Pluma de Cola de Fénix");
        
        Varita varitaDeRon = new Varita("Varita de Ron Weasley",10, 5,5,5, 12, "Fresno","Cabello de Unicornio");
        
        Varita varitaDeHermoine = new Varita("Varita de Hermoine",  10, 5,5,5, 10, "vid", "Corazon de dragon");
        
        Varita varitaDeHagrid = new Varita("Varita de Hagrid", 20, 30,5,5, 16, "roble", "desconocido");
        
        Varita varitaDeDraco = new Varita("Varita de Draco",  10, 5,5,5, 10, "espino", "desconocido");
        
        Varita varitaDeSnape = new Varita("Varita de Snape",  30, 40, 5,5,11, "pino", "desconocido");
        
        Varita varitaDeBellatrix = new Varita("Varita de Bellatrix",  40, 10,5,5, 10, "nogal", "desconocido");
        
        Varita varitaDeGinny = new Varita("Varita de Ginny",  5, 5, 5,5,11,"desconocido", "desconocido");
        
        Varita varitaDeSirius = new Varita("Varita de Sirius Black", 20, 20,5,5, 12, "desconocido", "desconocido");

        Pocion pocionMultijugos = new Pocion("Pocion multijugos", "Transforma tu imagen en la de otra persona por unas horas", 10, 0,0,0);

        Pocion pocionEnamoramiento = new Pocion("Pocion de Enamoramiento", "Quien lo bebe se enamora de ti", 10, 5,0,0);

        Pocion pocionVeneno = new Pocion("Veneno", "Mata a tu oponente al instante", 1000, 0,0,0);

        GrajeasDeSabores grajeasDeSabores = new GrajeasDeSabores("GrajeasDeSabores",
               "Tienen diferentes efectos segun el sabor que te toca", 5, 25,5,5);

        EspadaDeGryffindor espadaDeGryffindor = new EspadaDeGryffindor("Espada de Gryffindor", 100, 50,10,10);

        BolsoMagico bolsoMagico = new BolsoMagico("BolsoMagico", 10, 30,5,5);
        
        //HECHIZOS
        
        Hechizo caveInimicum = new CaveInimicum("Cavelnimicum", "Hechizo de protección: puede repeler las Maldiciones Imperdonables",
                30, 5);
        this.hechizos.add(caveInimicum);

        Hechizo caecaTemporalis = new CaecaTemporalis("Caeca Temporalis", "Vuelve invisible al usuario temporalmente", 5, 20);

        Hechizo expectoPatronum = new ExpectoPatronum("Expecto Patronum", "Sirve como escudo contra dementores", 30, 5);
        this.hechizos.add(expectoPatronum);
        
        Hechizo impedimenta = new Impedimenta("Impedimenta", "Anula el hechizo del oponente e impide que lo lance y en ocasiones puede paralizar temporalmente.", 30, 5);
        this.hechizos.add(impedimenta);

        Hechizo mimblewimble = new Mimblewimble("Mimblewimble",  "Es un hechizo defensivo que se manifiesta en forma de chorro de luz azulada. Provoca en el oponente una dificultad al hablar o expresarse evitando así que conjure hechizos.", 25, 5);
        this.hechizos.add(mimblewimble);

        Hechizo partisTemporus = new PartisTemporus("PartisTemporus", "Crea temporalmente una barrera mágica de protección.", 5, 25);
        this.hechizos.add(partisTemporus);

        Hechizo venite = new Venite("Venite", "Atrae su varita hacia quién lo conjura (Este hechizo se realiza sin varita, pues, es para atrer la misma hacia ti).",15, 5);
        this.hechizos.add(venite);

        Hechizo reducto = new Reducto("Reducto", "Hace que el objeto, al que se apunta, se rompa o destruya.", 30, 5);
        this.hechizos.add(reducto);

        Hechizo sectumSempra = new SectumSempra("SectumSempra", "Maldición que luego de impactar en el objetivo produce en su cuerpocortes profundos generando una hemorragia, como si hubier sido atravesado por una espada invisible",30, 5);
        this.hechizos.add(sectumSempra);

        Hechizo desmaius = new Desmaius("Desmaius", "Hechizo aturdidor. Si se lanza con éxito puede causar un aturdido grave.", 10,5);
        this.hechizos.add(desmaius);

        Hechizo expulso = new Expulso("Expulso", "Empuja bruscamente por los aires un objeto o una persona.", 10, 5);
        this.hechizos.add(expulso);

        Hechizo fiendFyre  = new FiendFyre("FiendFyre",
                "Crea un fuego que no se puede apagar con agua. Puede destruir un Horrocrux. Sólo se apaga con su contra-hechizo (fiendlocked).",
                30, 5);
        this.hechizos.add(fiendFyre);

        Hechizo glacius  = new Glacius("Glacius", "Hechizo para congelar.", 20, 5);
        this.hechizos.add(glacius);

        Hechizo inmobilus  = new Inmobilus("Inmobilus", "Deja inmóvil a una persona o animal.", 15, 5);
        this.hechizos.add(inmobilus);

        Hechizo obliateReducto = new ObliviateReducto("Obliviate Reducto", "Hechizo desmemorizante.", 25, 5);
        this.hechizos.add(obliateReducto);

        Hechizo petrificusTotalus  = new PetrificusTotalus("PetrificusTotalus", "Petrifica al oponente.", 25, 5);
        this.hechizos.add(petrificusTotalus);

        Hechizo tarantallegra  = new Tarantallegra("Tarantallegra",
                "Causa que las piernas del rival bailen como locas a gran velocidad. En la película es un hechizo que funciona igual que un expelliarmus.",
                10, 5);
        this.hechizos.add(tarantallegra);

        Hechizo vulneraSanentur  = new VulneraSanentur("VulneraSanentu",
                "Cura heridas y cortes profundos, y es un eficaz contrahechizo  de la maldición Sectumsempra.", 5, 30);
        this.hechizos.add(vulneraSanentur);

        Hechizo braquiamEmendo  = new BraquiamEmendo("BraquiamEmendo",
                "Repara los huesos rotos y, si no se hace bien, hace desaparecer los huesos.", 5, 25);
        this.hechizos.add(braquiamEmendo);

        Hechizo episkey  = new Episkey("Episkey", "Detiene el flujo de sangre o cura huesos rotos.", 5, 20);
        this.hechizos.add(episkey);

        Hechizo wingwardumLeviosa  = new WingwardumLeviosa("WingwardumLeviosa",
                "Este encantamiento permite levitar objetos o pequeños seres vivos", 10, 5);
        this.hechizos.add(wingwardumLeviosa);

        Hechizo ascendio = new Ascendio("Ascendio", "Hace ascender una persona o cosa.", 15, 5);
        this.hechizos.add(ascendio);

        Hechizo engorgio = new Engorgio("Engorgio", "Aumenta el tamaño de un objeto/animal.", 15, 5);
        this.hechizos.add(engorgio);

        Hechizo expelliarmus  = new Expelliarmus("Expelliarmus", "Desarma al oponente, su varita se aleja de su mano.", 20, 5);
        this.hechizos.add(expelliarmus);

        Hechizo glisseo  = new Glisseo("Glisseo", "Convierte escaleras en toboganes.", 5, 5);
        this.hechizos.add(glisseo);

        Hechizo lacarnumInflamarae  = new LacarnumInflamarae("LacarnumInflamarae", "Se desprenden llamas de la varita.", 5, 5);
        this.hechizos.add(lacarnumInflamarae);

        Hechizo muffliato  = new Muffliato("Muffliato", "La víctima escucha únicamente un zumbido en vez de la conversación.", 5, 5);
        this.hechizos.add(muffliato);

        Hechizo stupefacto= new Stupefacto("Stupefacto", "Hace que los objetos dejen de moverse.", 15, 5);
        this.hechizos.add(stupefacto);

        Hechizo imperius = new Imperius("Imperius","sirve para controlar la voluntad del mago al que se hechiza.", 100, 10);
        this.hechizos.add(imperius);

        //PERSONAJES

        Wizard harry = new MagoBlanco("Harry Potter", "El niño que vivió, luego de ser atacado por Lord Voldemort y  se convirtió así en su mayor rival, y nuestro héroe",
         150, 100, varitaDeHarry, nimbus2001);     
            harry.getHechizos().add(wingwardumLeviosa);
            harry.getHechizos().add(expulso);
            harry.getHechizos().add(reducto);
            harry.setArtefacto(capaInvisibilidad);
    
            this.personajes.add(harry);

        Wizard ron = new MagoBlanco("Ron Weasley", "Uno de los dos mejores amigos de Harry Potter, Gryffindor, y el hijo menor de Weasley",
            150, 100,varitaDeRon, nimbus2001);
            ron.getHechizos().add(petrificusTotalus);
            ron.getHechizos().add(tarantallegra);
            ron.getHechizos().add(ascendio);
            ron.setArtefacto(pocionEnamoramiento);
            this.personajes.add(ron);

        Wizard hermoine = new MagoBlanco("Hermoine Granger", "Es una de las mejores amigas de Harry Potter",
            150, 100,varitaDeHermoine, nimbus2000);
            hermoine.getHechizos().add(petrificusTotalus);
            hermoine.getHechizos().add(wingwardumLeviosa);
            hermoine.getHechizos().add(ascendio);
            hermoine.setArtefacto(bolsoMagico);
            this.personajes.add(hermoine);
             
        Wizard draco = new MagoOscuro("Draco Malfoy","Un mago de pura sangre, el orgulloso Slytherin y el gran rival de Harry Potter en Hogwarts.",
        150, 100,varitaDeDraco, nimbus2000);
           draco.getHechizos().add(expulso);
           draco.getHechizos().add(engorgio);
           draco.getHechizos().add(glisseo);
           draco.setArtefacto(diarioDeTomRiddle);
           this.personajes.add(draco);

        Wizard sirius = new MagoBlanco("Sirius Black", "El padrino Animagus de Harry que escapó de Azkaban. Viejo amiga de James y Lily Potter", 150, 100,varitaDeSirius, nimbus2001);
           sirius.getHechizos().add(impedimenta);
           sirius.getHechizos().add(inmobilus);
           sirius.getHechizos().add(fiendFyre);
           sirius.setArtefacto(pocionVeneno);
           this.personajes.add(sirius);
    
        Wizard bellatrix = new MagoOscuro("Bellatrix Lestrange", "Es una Mortífaga fanáticamente leal a Lord Voldemort.",
             150, 100,varitaDeBellatrix, nimbus2001);
           bellatrix.getHechizos().add(petrificusTotalus);
           bellatrix.getHechizos().add(muffliato);
           bellatrix.getHechizos().add(caecaTemporalis);
           bellatrix.setArtefacto(guardapeloDeSlytherin);
           this.personajes.add(bellatrix);
    
        Wizard ginny = new MagoBlanco("Ginny Weasley" , "Hermana de Ron", 150, 100,varitaDeGinny, nimbus2000);
            ginny.getHechizos().add(venite);
            ginny.getHechizos().add(lacarnumInflamarae);
            ginny.setArtefacto(grajeasDeSabores);
            this.personajes.add(ginny);
          
        Wizard snape = new MagoOscuro("Severus Snape",
                   "Le guarda rencor a Harry", 150, 100,varitaDeSnape, nimbus2001);
           snape.getHechizos().add(petrificusTotalus);
           snape.getHechizos().add(mimblewimble);
           snape.getHechizos().add(obliateReducto);
           snape.setArtefacto(diademaDeRowenaRavenclaw);
           this.personajes.add(snape);

        Wizard hagrid = new MagoBlanco("Rubeus Hagrid", "El guardabosques medio gigante de Hogwarts ", 150, 100,varitaDeHagrid, barredora7);
          hagrid.getHechizos().add(episkey);
          hagrid.getHechizos().add(partisTemporus);
          hagrid.setArtefacto(pocionMultijugos);
          this.personajes.add(hagrid);
        
        Elfo dobby = new Elfo("Dobby", "Elfo domestico amigo de Harry.", 245, 100, 25, 25);
        dobby.getHechizos().add(obliateReducto);
        dobby.getHechizos().add(partisTemporus);
        dobby.getHechizos().add(ascendio);
        dobby.setArtefacto(espadaDeGryffindor);
        this.personajes.add(dobby);

        }

    public Personaje elegirJugador(int nro){
        
        lapiz.imprimirBannerElegirJugador(nro);
        int i = 0;
        for (Personaje player : personajes) {
        System.out.println("........................................................");
        System.out.println((i+1)+ ("-")+ player.getNombre());
        System.out.println(player.getDescripcion());
        i++;
                
        }

        int opcion = Teclado.nextInt();
        Personaje p = new Personaje();

        switch (opcion) {

            case 1:
            p = personajes.get(0); 
                break;

            case 2:
            p = personajes.get(1); 
                break;

            case 3:
            p = personajes.get(2); 
                break;

            case 4:
            p = personajes.get(3); 
                break;

            case 5:
            p = personajes.get(4); 
                break;

            case 6:
            p = personajes.get(5); 
                break;

            case 7:
            p = personajes.get(6); 
                break;

            case 8:
            p = personajes.get(7); 
                break;

            case 9:
            p = personajes.get(8); 
                break;
        
           case 10:
           p = personajes.get(9); 
         break;

        }

        return p;

    }   

        public void aprenderHechizo(Personaje p) {
                int i = 0;

                for (Hechizo h : this.hechizos) {

                        System.out.println();
                        System.out.println("..............................................");
                        System.out.println((i + 1) + "-" + h.getNombreDelPoder());
                        System.out.println(h.getDescripcionDelPoder());
                        System.out.println("Poder de Daño: " + h.getPoderDeDanio());
                        System.out.println("Poder de Curacion: " + h.getPoderDeCuracion());
                        System.out.println("..............................................");
                        i++;
                }

                System.out.println("¿Cual querés aprender? Ingresá su numero");
                    int hechizoElegido = Teclado.nextInt();
                    Hechizo hechizoAprendido = this.hechizos.get(hechizoElegido - 1);

                    if (p instanceof Wizard){
                        Wizard w = (Wizard)p;
                        w.getHechizos().add(hechizoAprendido);
                        w.setEnergiaMagica(w.getEnergiaMagica() - 35);
                        System.out.println("Aprendiste el Hechizo: " + hechizoAprendido.getNombreDelPoder());
                        System.out.println();
                        System.out.println("¡¡ Ya puedes usarlo en tu estrategia de juego Wizard !!");
                        System.out.println();

                    }
                    if (p instanceof Elfo){
                            Elfo e = (Elfo)p;
                            e.getHechizos().add(hechizoAprendido);
                            e.setEnergiaMagica(e.getEnergiaMagica() - 35);
                            System.out.println("Aprendiste el Hechizo: " + hechizoAprendido.getNombreDelPoder());
                            System.out.println();
                            System.out.println("¡¡ Ya puedes usarlo en tu estrategia de juego Wizard !!");
                            System.out.println();
                    }
                   

        }

        public void felicitarGanador(Personaje p){
                System.out.println("Ganó: " + p.getNombre() + " ¡Felicitaciones!");
        }

}
