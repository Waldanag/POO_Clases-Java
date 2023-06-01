package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Impresora impresora1=new ImpresoraEpson("Epson", "USB", LocalDate.of(2020,12,5));
        Impresora impresora2= new ImpresoraCanon("Canon", "USB", LocalDate.of(2021,5,3));
        impresora1.ponerHojas(10);
        impresora2.ponerHojas(15);
        System.out.println(impresora1.imprimir("Hola"));
        System.out.println(impresora2.imprimir("Hola"));


        System.out.println(impresora1);
        System.out.println(impresora2);

        Impresora impresoras[] =new Impresora[2];
        impresoras[0]=impresora1;
        impresoras[1]=impresora2;
        for(int i=0;i<impresoras.length;i++) {
            System.out.println(impresoras[i].imprimir("Hola"));
        }

    }
}
