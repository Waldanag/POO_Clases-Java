package Clase19;

public class EmpleadoContratado extends Empleado{

    private double importeHora;
    private double retencionImpuesto;
    public EmpleadoContratado(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    public double calcularSueldo(int dias) {
        return 0;
    }


}
