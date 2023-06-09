package ParcialWal;

import java.time.LocalDate;

public class TituloTerciario extends Titulo{
    private String tipoValidacion;

    public TituloTerciario(int cantidadDeMaterias, LocalDate fechaInicioEstudios, LocalDate fechaTerminoEstudios, boolean selladoMinisterio, boolean selladoInstituto, Persona persona, String tipoValidacion) {
        super(cantidadDeMaterias, fechaInicioEstudios, fechaTerminoEstudios, selladoMinisterio, selladoInstituto, persona);
        this.tipoValidacion = tipoValidacion;
    }

    @Override
    public boolean puedeEjercer() {
        return isSelladoInstituto() && isSelladoMinisterio();
    }

    public boolean esValidoNacional(){
        return tipoValidacion.equals("NACIONAL");
    }

    public String getTipoValidacion() {
        return tipoValidacion;
    }

    public void setTipoValidacion(String tipoValidacion) {
        this.tipoValidacion = tipoValidacion;
    }


}
