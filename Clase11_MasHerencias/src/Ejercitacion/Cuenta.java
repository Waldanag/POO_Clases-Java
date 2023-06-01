package Ejercitacion;

public class Cuenta {

    private double saldoCuenta;
    private double cantDeposito;
    private double cantRetiro;
    private Cliente cliente;

    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
        saldoCuenta = 0;
    }

    public double depositarEfectivo(){
        return saldoCuenta += cantDeposito;
    }
    public double extraerEfectivo(){
        return saldoCuenta -= cantRetiro;
    }


}
