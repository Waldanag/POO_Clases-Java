package Ejercitacion;

public class CajaAhorro extends Cuenta{

    public static final double INTERES_CAJA_AHORRO = 1.2;

    public CajaAhorro(Cliente cliente) {
        super(cliente);
    }

    @Override
    public double extraerEfectivo(double cantRetiro) {
        return 0;
    }
}
