package Clase18;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador)
    {
        jugadores.add(jugador);
    }
    public Jugador buscarJugador(int numero) throws EquipoExcepcion {
        for (Jugador j:jugadores)
        {
            if (j.getNumeroCamiseta().equals(numero))
                return j;
        }
        throw new EquipoExcepcion("No se encontró el jugador");
    }
    public int cantidadJugadores(String posicion) throws EquipoExcepcion {
        int cantidad = 0;

        if (posicion.equals("ARQUERO") || posicion.equals("DEFENSOR") || posicion.equals("MEDIOCAMPISTA") || posicion.equals("DELANTERO")) {
            for (Jugador j : jugadores) {
                if (j.getPosicion().equals(posicion))
                    cantidad++;
            }
        } else  {
            throw new EquipoExcepcion("No es una posicion valida");
        }
        return cantidad;
    }
}
