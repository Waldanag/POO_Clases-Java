package Clase19;

import java.util.ArrayList;

public class Empresa {
    private String razonSocial;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado){

    }

    public double calcularSueldoTotal()
    {   double total = 0;
        for (Empleado e:empleados)
            total+= e.calcularSueldo(30);
        return total;
    }

    }


