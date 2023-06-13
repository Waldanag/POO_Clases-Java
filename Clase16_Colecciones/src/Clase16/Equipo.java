package Clase16;

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

    public String mostrarJugadoresTitulares()
    {   String datos = "";
        jugadores.sort(null);
        for (Jugador j:jugadores)
        {
            if(j.isTitular())
            datos += j.toString()+"\n";
        }
        return datos;
    }

    public int contarJugadoresLesionados()
    {   int cantidad = 0;
        for (int i=0; i<jugadores.size() ;i++)
            if (jugadores.get(i).isLesionado())
            {
                cantidad++;
            }
        return cantidad;
    }
}
