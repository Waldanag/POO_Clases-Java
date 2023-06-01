package com.company;

import java.time.LocalDate;

public class ImpresoraEpson extends  Impresora{

    public ImpresoraEpson(String modelo, String tipoConexion, LocalDate fechaFabricacion) {
        super(modelo, tipoConexion, fechaFabricacion);
    }

    @Override
    public String imprimir(String texto) {
        if(tienePapel()&&!necesitaTinta()) {
            setHojasDisponibles(getHojasDisponibles() - 1);
            setPorcentajeTinta(getPorcentajeTinta() - 5);
            return "Impresora Epson imprimiento " + texto;
        }
        return "No se pudo imprimir";
    }
}
