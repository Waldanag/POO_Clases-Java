package ParcialWal;

import java.time.LocalDate;

public abstract class Titulo {
    private int cantidadDeMaterias;
    private LocalDate fechaInicioEstudios;
    private LocalDate fechaTerminoEstudios;
    private boolean selladoMinisterio;
    private boolean selladoInstituto;
    private Persona persona;

    public Titulo(int cantidadDeMaterias, LocalDate fechaInicioEstudios, LocalDate fechaTerminoEstudios, boolean selladoMinisterio, boolean selladoInstituto, Persona persona) {
        this.cantidadDeMaterias = cantidadDeMaterias;
        this.fechaInicioEstudios = fechaInicioEstudios;
        this.fechaTerminoEstudios = fechaTerminoEstudios;
        this.selladoMinisterio = selladoMinisterio;
        this.selladoInstituto = selladoInstituto;
        this.persona = persona;
    }

    public abstract boolean puedeEjercer();

    public boolean isSelladoMinisterio() {
        return selladoMinisterio;
    }

    public void setSelladoMinisterio(boolean selladoMinisterio) {
        this.selladoMinisterio = selladoMinisterio;
    }

    public boolean isSelladoInstituto() {
        return selladoInstituto;
    }

    public void setSelladoInstituto(boolean selladoInstituto) {
        this.selladoInstituto = selladoInstituto;
    }
}
