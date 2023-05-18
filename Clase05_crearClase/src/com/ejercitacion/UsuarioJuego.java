package com.ejercitacion;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Integer puntaje;
    private Integer nivel;

    public UsuarioJuego(String nombre, String clave)
    {
        this.nombre = nombre;
        this.clave = clave;
        puntaje = 0;
        nivel = 0;
    }

    public void aumentarPuntaje()
    {
        puntaje ++;
    }

    public void subirNivel()
    {
        nivel ++;
    }

    public void bonus(Integer valor)
    {
        puntaje += valor;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String toString()
    {
        return " Nombre: " + nombre + "\n Clave: " + clave + "\n Puntaje: " + puntaje + "\n Nivel: " + nivel;
    }

    public String getNombre()
    {
        return nombre;
    }
    public String getClave()
    {
        return clave;
    }
    public Integer getPuntaje()
    {
        return puntaje;
    }
    public Integer getNivel()
    {
        return nivel;
    }



}
