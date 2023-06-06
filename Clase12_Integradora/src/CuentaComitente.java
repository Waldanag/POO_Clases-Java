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

    @Override
    public void extraer(double monto) {

    }

    @Override
    public void extraer(double monto, String contrasenaIngresada) {

        if (informarSaldo() >= monto) {
            if (contrasenaIngresada.equals(CNV)){
                setSaldo(informarSaldo() - monto);
            } else {
                double limiteRetiro = (informarSaldo() * 0.5);
                if (limiteRetiro >= monto){
                    setSaldo(informarSaldo() - monto);
                }
            }
        }
    }




}
