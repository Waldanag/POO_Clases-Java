package Ejercitacion;

import Clase19.Empleado;
import Clase19.EmpleadoContratado;
import Clase19.EmpleadoFactory;
import Clase19.EmpleadoRelacionDependencia;

public class ProductoFactory {
    private static ProductoFactory productoFactory;
    public final String CAJA_10X10 = "CAJA DE 10X10";
    public final String PE_FUT = "PELOTAFULTBOL";
    public final String PE_TENIS = "PELOTATENIS";


    private ProductoFactory() {
    }

    public static ProductoFactory obtenerInstancia()
    {
        if (productoFactory == null)
            productoFactory = new ProductoFactory();
        return productoFactory;
    }
    public Producto crearProducto(String codigo, double peso)
    {
        switch (codigo)
        {
            case "CAJA DE 10X10":
                return new Caja(peso, 10,10,10);
            case "PELOTAFULTBOL":
                return new Pelota(peso, 11);
            case "PELOTATENIS":
                return new Pelota(peso, 0.32);
        }
        return null;
    }


}
