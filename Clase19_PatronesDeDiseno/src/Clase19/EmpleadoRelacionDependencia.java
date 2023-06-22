package Clase19;

public class EmpleadoRelacionDependencia extends Empleado{
    private double sueldoMensual;

    public EmpleadoRelacionDependencia(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    public double calcularSueldo(int dias) {
        return 0;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
