package Clase22_masPatronesState;

public class ParaEnvio implements Estado{
    private Reparacion reparacion;

    public ParaEnvio(Reparacion reparacion) {
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
