package Clase22_masPatronesState;

public class EnReparacion implements Estado{
    private Reparacion reparacion;

    public EnReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;

    }

    @Override
    public void pasarSiguienteEstado() {
        reparacion.setEstado(ReparacionFactory.obtenerInstancia().crearEstado(ReparacionFactory.ENVIO, reparacion));
        System.out.println("Pasando para envío");
    }

    @Override
    public void cambiarDireccion(String direccion) throws ExceptionReparacion {
        throw new ExceptionReparacion("No es posible cambiar la direccion en presupuesto");

    }

    @Override
    public void darValorPresupuesto(double costo) throws ExceptionReparacion {
        throw new ExceptionReparacion("No es posible cambiar valor presupuesto ya en reparación");
    }

    @Override
    public void agregarRepuesto(double costo) {
        reparacion.setCosto(reparacion.getCosto() + costo);
        System.out.println("Se agrega costo de repuesto por: " + costo + " El costo total ahora es de: " + reparacion.getCosto());
    }
}
