package Ejercitacion;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteExcepcion {
        Date hoy= new Date(2023,6,14);
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.before(hoy))
            this.fechaInternacion=fechaInternacion;
        else if (fechaInternacion.after(hoy))
            throw new PacienteExcepcion("La fecha de internacion es posterior a la fecha actual");
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteExcepcion {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else
            throw new PacienteExcepcion("La fecha de alta No puede ser anterior al día de internación");
    }

}
