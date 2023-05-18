package com.ejercitacion;

public class Main {

    public static void main(String [] args) {

        UsuarioJuego usuario1 = new UsuarioJuego("Waldanag", "1234");
        System.out.println(usuario1);
        usuario1.aumentarPuntaje();
        usuario1.subirNivel();
        System.out.println("------");
        System.out.println(usuario1);
        usuario1.bonus(4000);
        System.out.println("------");
        System.out.println(usuario1);

        UsuarioJuego usuario2 = new UsuarioJuego("Mokka", "1111");
        usuario2.bonus(65);
        System.out.println("......");
        System.out.println( " Nombre: " + usuario2.getNombre());
        System.out.println( " Puntaje: " + usuario2.getPuntaje());

    }

}
