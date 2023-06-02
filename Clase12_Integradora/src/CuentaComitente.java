public class CuentaComitente extends Cuenta{

    private String CNV;
    public static final double COMISION = 0.01;

    public CuentaComitente(String CNV) {
        this.CNV = CNV;

    }

    @Override
    public void depositar(double monto) {
        setSaldo( informarSaldo() + (monto * (1 - COMISION)) );
    }

    public void extraer(double monto, String contrasenaIngresada) {
        if (contrasenaIngresada.equals(CNV)){
            if (informarSaldo() >= monto){
                setSaldo(informarSaldo() - monto);
            }
        }else {
            double limiteRetiro = saldo * 0.5;
            if (informarSaldo() >= monto){
                setSaldo(informarSaldo() - monto);
            }
        }

    }
}
