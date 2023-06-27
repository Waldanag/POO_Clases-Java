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
    {}
    public void cambiarDireccion(String direccion)
    {}
    public void darValorPresupuesto(double costo)
    {}
    public void agregarRepuesto(double costo)
    {}

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
