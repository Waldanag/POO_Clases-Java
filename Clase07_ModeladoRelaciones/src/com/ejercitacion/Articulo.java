package com.ejercitacion;

import java.time.LocalDate;

public class Articulo {

    private String nombreArticulo;
    private LocalDate fechaPedido;


    public void Articulo(String nombreArticulo, LocalDate fechaPedido)
    {
        this.nombreArticulo = nombreArticulo;
        this.fechaPedido = fechaPedido;
    }

}
