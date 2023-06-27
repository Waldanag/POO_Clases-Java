package Clase22_masPatronesState;

public class EnPresupuesto implements Estado{
private Reparacion reparacion;

    public EnPresupuesto(Reparacion reparacion) {
        this.reparacion = reparacion;

    }

    @Override
    public void pasarSiguienteEstado() {
        reparacion.setEstado(ReparacionFactory.obtenerInstancia().crearEstado(ReparacionFactory.PRESUPUESTO, reparacion));
    }

    @Override
    public void cambiarDireccion(String direccion) throws ExceptionReparacion {
        throw new ExceptionReparacion("No es posible cambiar la direccion en presupuesto");

    }

    @Override
    public void darValorPresupuesto(double costo) {
        reparacion.setCosto(costo);
        System.out.println("El presupuesto es de: " + costo);
    }

    @Override
    public void agregarRepuesto(double costo) throws ExceptionReparacion {
        throw new ExceptionReparacion("No es posible agregar repuestos en presupuesto");
    }
}
