package com.company;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Impresora {
    private String modelo;
    private String tipoConexion;
    private LocalDate fechaFabricacion;
    private int hojasDisponibles;
    private double porcentajeTinta;


    public Impresora(String modelo, String tipoConexion, LocalDate fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        hojasDisponibles=0;
        porcentajeTinta=100;
    }

    public boolean tienePapel()
    {
        return hojasDisponibles>0;
    }
    public boolean necesitaTinta()
    {
        return porcentajeTinta<10;
    }

    public void ponerHojas(int cantidad)
    {
        hojasDisponibles+=cantidad;
    }
    public abstract String imprimir(String texto);

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    public void setPorcentajeTinta(double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Impresora impresora = (Impresora) o;
        return Objects.equals(modelo, impresora.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo);
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "modelo='" + modelo + '\'' +
                ", hojasDisponibles=" + hojasDisponibles +
                ", porcentajeTinta=" + porcentajeTinta +
                '}';
    }
}
