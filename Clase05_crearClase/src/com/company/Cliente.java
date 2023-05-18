package com.company;

public class Cliente {
    private static String banco = "Nacion";
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    public static void cambiarBanco(String banco)
    {
        Cliente.banco = banco;
    }

    public Cliente()
    {
        deuda = 0.0;
    }

    public Cliente(Integer numero, String nombre)
    {
        this.numeroCliente = numero;
        this.nombre = nombre;
        this.deuda = 0.0;
    }

    public void ingrementarDeuda(Double valor)
    {
        deuda += valor;
    }

    public void pagarDeuda()
    {
        deuda = 0.0;
    }

    public Double getDeuda()
    {
        return deuda;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    };

    public String toString()
    {
        return " Banco: " + banco + "\n Nombre: " + nombre + "\n Numero Cliente: " + numeroCliente + "\n Deuda: " + deuda;
    }


}
