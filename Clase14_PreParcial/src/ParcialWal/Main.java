package ParcialWal;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Walter", "Aldana", 12345, 39);
        Persona persona2 = new Persona("Pepito", "Aldana", 67890, 27);
        Persona persona3 = new Persona("Mokka", "Aldana", 55555, 4);

        TituloLicenciatura titulo1 = new TituloLicenciatura(8, LocalDate.of(2017, 2, 21), LocalDate.of(2018,2,21), true, true, persona1, "Casas", LocalDate.of(2018,2,20), 4);
        TituloLicenciatura titulo2 = new TituloLicenciatura(8, LocalDate.of(2017, 2, 21), LocalDate.of(2018,2,21), false, true, persona2, "Puent", LocalDate.of(2018,2,20), 7);

        System.out.println(titulo1);
        System.out.println(titulo2);

        if (titulo1.compareTo(titulo2)>0){
            System.out.println("Titulo 1 es mayor");
        } else if (titulo1.compareTo(titulo2)<0) {
            System.out.println("Titulo 2 es mayor");
        } else {
            System.out.println("Titulos son iguales");
        }

        if (titulo1.puedeEjercer()){
            System.out.println(persona1.getNombre() + " " + persona1.getApellido() + " puede ejercer");
        } else {
            System.out.println(persona1.getNombre() + " " + persona1.getApellido() + " NO puede ejercer");
        }
        if (titulo2.puedeEjercer()){
            System.out.println(persona2.getNombre() + " " + persona2.getApellido() + " puede ejercer");
        } else {
            System.out.println(persona2.getNombre() + " " + persona2.getApellido() + " NO puede ejercer");
        }

        TituloTerciario titulo3 = new TituloTerciario(5, LocalDate.of(2021,2,21), LocalDate.of(2022,2,21), true, true, persona3, "NACIONAL");

        if (titulo3.esValidoNacional());
        System.out.println("Puede ejercer en todo el país");



    }
}