package Clase08_Herencias;

import java.util.Objects;

public class Socio {

    private  String nombre;
    private String numeroSocio;
    private double cuotaMensual;
    private String actividad;

    public Socio(String nombre, String numeroSocio, double cuotaMensual, String actividad) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public double calcularCostoMensual(){
        return cuotaMensual;
    }
    public void asignarActividad(String actividad){
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", numeroSocio='" + numeroSocio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(numeroSocio, socio.numeroSocio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroSocio);
    }
}
