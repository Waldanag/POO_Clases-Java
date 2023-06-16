package Ejercitacion;

import java.util.ArrayList;

public class Recorrido {
    private String partida;
    private String destino;
    private ArrayList<Estacion> estaciones;

    public Recorrido(String partida, String destino, ArrayList<Estacion> estaciones) {
        this.partida = partida;
        this.destino = destino;
        estaciones = new ArrayList<>();
    }
}
