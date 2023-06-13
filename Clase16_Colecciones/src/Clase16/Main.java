package Clase16;

public class Main {

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Alexis", 7);
        Jugador jugador2 = new Jugador("Aliendro", 29);
        Jugador jugador3 = new Jugador("Lionel Messi", 10);
        Jugador jugador4 = new Jugador("Duki", 5);

        jugador1.setTitular(true);
        jugador2.setTitular(true);
        jugador3.setTitular(false);
        jugador4.setTitular(true);

        jugador3.setLesionado(true);

        Equipo equipo = new Equipo("DH_POO");
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);
        equipo.agregarJugador(jugador4);

        System.out.println(equipo.mostrarJugadoresTitulares());
        System.out.println("Cantidad de lesionados es " + equipo.contarJugadoresLesionados());


    }

}
