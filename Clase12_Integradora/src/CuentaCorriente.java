
public class CuentaCorriente extends Cuenta{
	
	private double descubiertoPermitido;
	
	

	public double getDescubiertoPermitido() {
		return descubiertoPermitido;
	}



	public void setDescubiertoPermitido(double descubiertoPermitido) {
		this.descubiertoPermitido = descubiertoPermitido;
	}


	public void depositar(double monto, String moneda)
	{
		if (moneda.equals("Pesos"))
			setSaldo(informarSaldo()+monto);
		if (moneda.equals("Dolar"))
			setSaldo(informarSaldo()+(monto*800));
	}

	@Override
	public void extraer(double monto) {
		if(informarSaldo() + descubiertoPermitido >= monto)
			setSaldo(informarSaldo() - monto);
	}

}
