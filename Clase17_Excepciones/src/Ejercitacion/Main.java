package Ejercitacion;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws PacienteExcepcion {



        try {

            Paciente paciente1 = new Paciente("Juan","Perez","12345",new Date(2023,6,16));
        }
        catch (PacienteExcepcion e)
        {
            System.err.println(e.getMessage());
        }

        try {
           Paciente paciente2 = new Paciente("Pepito", "DH", "67890", new Date(2023,5,10));
           paciente2.darAlta(new Date(2023,5,3));

        }
        catch (PacienteExcepcion e)
        {
            System.err.println(e.getMessage());
        }


    }
}
