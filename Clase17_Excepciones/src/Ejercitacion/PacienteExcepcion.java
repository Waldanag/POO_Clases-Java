package Ejercitacion;

import java.util.Date;

public class PacienteExcepcion extends Exception{

    public PacienteExcepcion() {
        super();
    }
    public PacienteExcepcion(String message) {
        super(message);
    }

    public String toString(){
        return "Tipo excepcion " + getClass().getName() + " error " + getMessage();
    }
}
