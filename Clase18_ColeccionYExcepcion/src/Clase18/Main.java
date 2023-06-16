package Clase18;

import javax.naming.NamingEnumeration;

public class Main {
    public static void main(String[] args) {

        Equipo equipo = new Equipo("Selección");
        Jugador jugador1 = new Jugador("Vinisius", 7);
        jugador1.setPosicion("DELANTERO");
        Jugador jugador2 = new Jugador("Alaba",4);
        jugador2.setPosicion("DEFENSOR");
        Jugador jugador3 = new Jugador("Zamora", 9);
        jugador3.setPosicion("MEDIOCAMPISTA");

        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        try {
            Jugador jugador = equipo.buscarJugador(10);
        }
        catch (EquipoExcepcion e) {
            System.err.println(e.getMessage());
        }

    }
}