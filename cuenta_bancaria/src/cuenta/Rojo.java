package cuenta;

public class Rojo implements Estadocuenta{
	private Cuenta cuenta;

	@Override
	public void Depositar(double monto) {
		this.cuenta.setSaldo(this.cuenta.getSaldo()+monto);
		this.Actualizarestado(cuenta);
		
	}

	@Override
	public void Extraer(double monto) {
		System.out.println("no puedes extraer dinero. saldo negativo");
		
	}

	@Override
	public void Pagarintereses() {
		
		
	}

	@Override
	public void Setestado(Cuenta cuenta) {
		this.cuenta= cuenta;
	}

	@Override
	public void Actualizarestado(Cuenta cuenta) {
		
		if(this.cuenta.getSaldo()>1000)
		{
				cuenta.Setestado(new Oro());
				System.out.println("sos oro");
		}
		
		if(this.cuenta.getSaldo()>=0 && this.cuenta.getSaldo()<=1000)
		{
			cuenta.Setestado(new Plata());
			System.out.println("sos plata");
		}
		
		if(this.cuenta.getSaldo()<0)
		{
			cuenta.Setestado(new Rojo());
			System.out.println("estas en rojo");
		}
	}
}





