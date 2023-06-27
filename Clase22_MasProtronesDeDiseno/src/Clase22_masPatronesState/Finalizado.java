package Clase22_masPatronesState;

public class Finalizado implements Estado{
    private Reparacion reparacion;

    public Finalizado(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void pasarSiguienteEstado() {

    }

    @Override
    public void cambiarDireccion(String direccion) {

    }

    @Override
    public void darValorPresupuesto(double costo) {

    }

    @Override
    public void agregarRepuesto(double costo) {

    }
}
