package Clase19;

public class EmpleadoFactory {
    private static EmpleadoFactory empleadoFactory;
    public final String EMP_RD = "Empleado relacion de dependencia";
    public final String EMP_PH = "Empleado contratado";
    private EmpleadoFactory() {
    }
    public static EmpleadoFactory obtenerInstancia()
    {
        if (empleadoFactory == null)
            empleadoFactory = new EmpleadoFactory();
        return empleadoFactory;
    }
    public Empleado crearEmpleado(String codigo, String nombre, String apellido, int legajo)
    {
        switch (codigo)
        {
            case "Empleado relacion de dependencia":
                return new EmpleadoRelacionDependencia(nombre, apellido, legajo);
            case "Empleado contratado":
                return new EmpleadoContratado(nombre, apellido, legajo);
        }
        return null;
    }


}
