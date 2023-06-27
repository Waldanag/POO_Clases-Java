package Clase22_masPatronesState;

public interface Estado {

    public void pasarSiguienteEstado();
    public void cambiarDireccion(String direccion);
    public void darValorPresupuesto(double costo);
    public void agregarRepuesto(double costo);

}
