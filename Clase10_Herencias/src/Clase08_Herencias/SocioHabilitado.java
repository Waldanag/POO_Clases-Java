package Clase08_Herencias;

public class SocioHabilitado extends Socio{
    private boolean habilitado;
    private double costoPileta;

    public SocioHabilitado(String nombre, String numeroSocio, double cuotaMensual, String actividad, double costoPileta) {
        super(nombre, numeroSocio, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
    }

    public void habilitarSocio(){
        habilitado = true;
    }

    @Override
    public double calcularCostoMensual()
    {
        return super.calcularCostoMensual()+costoPileta;
    }

    @Override
    public String toString() {
        return "SocioHabilitado{" + super.toString() +
                "habilitado=" + habilitado +
                '}';
    }
}
