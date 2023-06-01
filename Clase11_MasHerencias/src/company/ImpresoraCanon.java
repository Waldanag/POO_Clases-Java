package com.company;

import java.time.LocalDate;

public class ImpresoraCanon extends Impresora{

    public ImpresoraCanon(String modelo, String tipoConexion, LocalDate fechaFabricacion) {
        super(modelo, tipoConexion, fechaFabricacion);
    }

    @Override
    public String imprimir(String texto) {
        if (tienePapel() && !necesitaTinta())
        {
            setPorcentajeTinta(getPorcentajeTinta()-5);
            setHojasDisponibles(getHojasDisponibles()-1);
            return "Imprimiendo en impresora Canon " + texto;
        }
        return "No se pudo imprimir";
    }
    @Override
    public boolean necesitaTinta()
    {
        return getPorcentajeTinta()<15;
    }
}
