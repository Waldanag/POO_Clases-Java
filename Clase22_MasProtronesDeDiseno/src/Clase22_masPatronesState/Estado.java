package Clase22_masPatronesState;

public interface Estado {

    public void pasarSiguienteEstado();
    public void cambiarDireccion(String direccion) throws ExceptionReparacion;
    public void darValorPresupuesto(double costo) throws ExceptionReparacion;
    public void agregarRepuesto(double costo) throws ExceptionReparacion;

}
