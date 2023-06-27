package Clase22_masPatronesState;

import javax.swing.plaf.PanelUI;

public class ReparacionFactory {

    //SINGLETON
    private static ReparacionFactory instancia;
    public static final String REPARACION = "EnReparacion";
    public static final String ENVIO = "ParaEnvio";
    public static final String FINALIZADO = "Finalizado";
    public static final String PRESUPUESTO = "EnPresupuesto";
    private ReparacionFactory() {
    }

    public static ReparacionFactory obtenerInstancia()
    {
        if (instancia == null)
            instancia = new ReparacionFactory();
        return instancia;
    }

    //CREAR OBJETOS

    public Estado crearEstado(String codigo, Reparacion reparacion)
    {
        switch (codigo)
        {
            case "EnPresupuesto":
                return new EnPresupuesto(reparacion);
            case "EnReparacion":
                return new EnReparacion(reparacion);
            case "ParaEnvio":
                return new ParaEnvio(reparacion);
            case "Finalizado":
                return new Finalizado(reparacion);
        }
        return null;

    }


}
