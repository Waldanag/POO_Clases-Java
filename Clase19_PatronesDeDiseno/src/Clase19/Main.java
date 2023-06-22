package Clase19;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("DH");
        EmpleadoFactory empleadoFactory = EmpleadoFactory.obtenerInstancia();

        EmpleadoRelacionDependencia emp1 = (EmpleadoRelacionDependencia)empleadoFactory.crearEmpleado(empleadoFactory.EMP_RD, "Juan", "Perez",111);
        emp1.setSueldoMensual(100000);
        empresa.agregarEmpleado(emp1);

        empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.obtenerInstancia().EMP_PH, "Juana", "Castillo",222));


    }
}