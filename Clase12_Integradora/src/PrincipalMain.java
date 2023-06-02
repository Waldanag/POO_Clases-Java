
public class PrincipalMain {

	public static void main(String[] args) {

		CajaAhorro ca = new CajaAhorro();
		ca.setSaldo(100);
		ca.cobrarIntereses();
		System.out.println(ca.informarSaldo());

		CuentaCorriente cc = new CuentaCorriente();
		cc.setSaldo(1000);
		cc.depositar(1000,"Dolar");
		cc.depositar(500);

		Cuenta  cc1=new CuentaCorriente();
		cc1.depositar(500);
		Cuenta cuentas[] = new Cuenta[4];

		cuentas[0]=ca;
		cuentas[1]=cc;
		cuentas[2]=new CajaAhorro();
		cuentas[2].depositar(1500);
		cuentas[3]=cc1;

		for (int i=0; i< cuentas.length; i++)
		{
			System.out.println(cuentas[i].informarSaldo());
		}

		for (int i=0; i< cuentas.length; i++)
		{
			cuentas[i].depositar(100);
		}
		for (int i=0; i< cuentas.length; i++)
		{
			if(cuentas[i] instanceof CajaAhorro)
				((CajaAhorro)cuentas[i]).cobrarIntereses();
		}
		for (int i=0; i< cuentas.length; i++)
		{
			System.out.println(cuentas[i].informarSaldo());
		}

		cc.setNumeroCuenta("1234n");
		cc1.setNumeroCuenta("5678n");

		if (cc.equals(cc1))
			System.out.println("Son iguales");

		Cuenta cc4 = new CuentaComitente("1234");
		cc4.setSaldo(0);
		cc4.depositar(100);
		System.out.println(cc4.informarSaldo());


		
	}

}
