package ParcialWal;

import java.time.LocalDate;

public class TituloLicenciatura extends Titulo implements Comparable<TituloLicenciatura>{
    private String temaTesis;
    private LocalDate fechaEntregaTesis;
    private int cantTrabajosInvestig;

    public TituloLicenciatura(int cantidadDeMaterias, LocalDate fechaInicioEstudios, LocalDate fechaTerminoEstudios, boolean selladoMinisterio, boolean selladoInstituto, Persona persona, String temaTesis, LocalDate fechaEntregaTesis, int cantTrabajosInvestig) {
        super(cantidadDeMaterias, fechaInicioEstudios, fechaTerminoEstudios, selladoMinisterio, selladoInstituto, persona);
        this.temaTesis = temaTesis;
        this.fechaEntregaTesis = fechaEntregaTesis;
        this.cantTrabajosInvestig = cantTrabajosInvestig;
    }

    @Override
    public boolean puedeEjercer() {
        return isSelladoInstituto() && isSelladoMinisterio();
    }

    public int getCantTrabajosInvestig() {
        return cantTrabajosInvestig;
    }

    public void setCantTrabajosInvestig(int cantTrabajosInvestig) {
        this.cantTrabajosInvestig = cantTrabajosInvestig;
    }

    @Override
    public int compareTo(TituloLicenciatura o) {
        if (this.cantTrabajosInvestig>o.cantTrabajosInvestig)
            return 1;
        if (this.cantTrabajosInvestig<o.cantTrabajosInvestig)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "TituloLicenciatura{" +
                "temaTesis='" + temaTesis + '\'' +
                ", fechaEntregaTesis=" + fechaEntregaTesis +
                ", cantTrabajosInvestig=" + cantTrabajosInvestig +
                '}';
    }
}
