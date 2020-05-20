/***********************************************************************************************
 * Harry Game
 * Laura Acuña y Romina Guerrero
 * 
 * Juego de consola RPG basado en saga de Harry Potter
 * 
 ***********************************************************************************************/

package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        List<Personaje> personajes = new ArrayList<>();

        JuegoHP harryGame = new JuegoHP();
        Lapiz lapiz = new Lapiz();
        
        lapiz.darBienvenida();     
        harryGame.inicializarJuego();
  
        Personaje jugador1 = new Personaje();
        jugador1 = harryGame.elegirJugador(1);
        personajes.add(jugador1);

        Personaje jugador2 = new Personaje(); 
        jugador2 = harryGame.elegirJugador(2);
        personajes.add(jugador2);

        boolean turnoJugador1 = true;
        Personaje atacante;
        Personaje victima;

        while (jugador1.estaVivo() && jugador2.estaVivo() && jugador1.getCasilleroActual() < 50
                && jugador2.getCasilleroActual() < 50) {
              
            if (turnoJugador1) {
                atacante = jugador1;
                victima = jugador2;
            } else {
                atacante = jugador2;
                victima = jugador1;
            }

            lapiz.imprimirBannerTurno(atacante);
            int dado = atacante.tirarDado(atacante); 
            atacante.irACasillero(atacante, dado);

            lapiz.imprimirBannerEstado();
            int opcion = Teclado.nextInt();

            switch (opcion) {
                case 1:
                    atacante.mostrarEstado(atacante);
                    break;
                default:
                    break;
            }

            lapiz.preguntarEstrategia();
            int estrategia = Teclado.nextInt();

            switch (estrategia) {
                case 1:
                        if(atacante instanceof Wizard){
                        Wizard w = (Wizard)atacante;
                        Hechizo h = w.elegirHechizoDisponible(w);
                        w.atacar(victima,h);
                        }
                        else if (atacante instanceof Elfo) {
                        Elfo e = (Elfo)atacante;
                        Hechizo h = e.elegirHechizoDisponible(e);
                        e.atacar(victima,h);
                        } 
                    break;          
                case 2:            
                    lapiz.mostrarBannerAprenderHechizo();
                    harryGame.aprenderHechizo(atacante);
                    break;
                case 3:  
                    Trivia trivia = new Trivia();
                    int r = trivia.responderPregunta();
                    if (r == 1) {
                        atacante.setEnergiaMagica(atacante.getEnergiaMagica() + 10);
                    }
                    break;      
            }
            turnoJugador1 = !turnoJugador1;
        }

        if (jugador1.estaVivo() && jugador2.estaVivo()) {
            if (jugador1.getCasilleroActual() >= 50) {
                harryGame.felicitarGanador(jugador1);
            } else {
                harryGame.felicitarGanador(jugador2);
            }

        } else {
            if (jugador1.estaVivo()) {
            harryGame.felicitarGanador(jugador1);
            } else {
            harryGame.felicitarGanador(jugador2);
            }
        }
    }
}