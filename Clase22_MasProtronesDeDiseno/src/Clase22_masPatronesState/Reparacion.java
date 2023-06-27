package Clase22_masPatronesState;

public class Reparacion {
    private String articulo;
    private double costo;
    private String direccionEnvio;
    private Estado estado;

    public Reparacion(String articulo) {
        this.articulo = articulo;
        setEstado(ReparacionFactory.obtenerInstancia().crearEstado(ReparacionFactory.PRESUPUESTO, this));
    }

    public void pasarSiguienteEstado()
    {
        estado.pasarSiguienteEstado();
    }
    public void cambiarDireccion(String direccion) throws ExceptionReparacion {
        estado.cambiarDireccion(direccion);
    }
    public void darValorPresupuesto(double costo) throws ExceptionReparacion {
        estado.darValorPresupuesto(costo);
    }
    public void agregarRepuesto(double costo) throws ExceptionReparacion {
        estado.agregarRepuesto(costo);
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }
}
