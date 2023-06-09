package Ejercitacion;

import java.util.Objects;

public abstract class Cuenta {

    //ATRIBUTOS
    private int numeroCuenta;
    private double saldoCuenta;
    private Cliente cliente;

    //CONSTRUCTOR
    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
        saldoCuenta = 0;
    }

    //METODOS
    public double depositarEfectivo(double cantDeposito){
        return saldoCuenta += cantDeposito;
    }
    public abstract double extraerEfectivo(double cantRetiro);

    public double consultarSaldo(){
        return saldoCuenta;
    }
    public double getSaldoCuenta() {
        return saldoCuenta;
    }
    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldoCuenta=" + saldoCuenta +
                ", cliente=" + cliente +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Cuenta cuenta = (Cuenta) o;
        return numeroCuenta == cuenta.numeroCuenta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCuenta);
    }
}
