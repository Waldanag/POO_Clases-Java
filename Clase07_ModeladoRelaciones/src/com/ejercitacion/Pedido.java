package com.ejercitacion;

import java.time.LocalDate;

public class Pedido {

private int codigoPedido;
private LocalDate fechaPedido;
private Cliente cliente;


public void Pedido(int codigoPedido, LocalDate fechaPedido, Cliente cliente)
{
 this.codigoPedido = codigoPedido;
 this.fechaPedido = fechaPedido;

}


}
