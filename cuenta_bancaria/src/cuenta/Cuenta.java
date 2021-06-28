package cuenta;

public class Cuenta {
	private Estadocuenta estado;
	private String Titular;
	private double saldo;
	
	
	public Cuenta()
	{
		Setestado(new Plata());
		this.Titular="nahuel arias";
		this.saldo=0;
		
		
	}

	
	
	
	
	void Setestado(Estadocuenta estado) {
	this.estado =estado;
	this.estado.Setestado(this);
	}

	public void Depositar(double monto)
	{
		this.estado.Depositar(monto);
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void Actualizarestado(Cuenta cuenta) {
		
		this.estado.Actualizarestado(cuenta);
		
	}





	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}





	public void Extraer(double monto)
	 {
		 this.estado.Extraer(monto);
	 }
	public void Pagarintereses()
	{
		this.estado.Pagarintereses();
	}
	

	

	
	
}
