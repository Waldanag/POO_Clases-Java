package Clase11;

import java.time.LocalDate;

public class ImpresoraCannon extends Impresora{

    public ImpresoraCannon(String modelo, String tipoConexion, LocalDate fechaFabricacion) {
        super(modelo, tipoConexion, fechaFabricacion);
    }

    @Override
    public String imprimir(String texto) {
        if (tienePapel() && !necesitaTinta()){
            setPorcentajeTinta(getPorcentajeTinta() - 5);
            setHojasDisponibles(getHojasDisponibles() - 1);
            return "Impresora Cannon imprimiendo " + texto;
        }
        return "No se pudo imprimir";
    }
    @Override
    public boolean necesitaTinta()
    {
        return getPorcentajeTinta() < 15;
    }

}
