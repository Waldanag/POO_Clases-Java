import java.util.Objects;

public abstract class Cuenta {
	
	private String numeroCuenta;
	private double saldo;
	
	
	public void depositar(double monto) {
		saldo += monto;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double informarSaldo() {
		return saldo;
	}

	public abstract void extraer(double monto);

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Cuenta)) return false;
		Cuenta cuenta = (Cuenta) o;
		return numeroCuenta.equals(cuenta.numeroCuenta);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCuenta);
	}
}
