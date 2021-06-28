package cuenta;

public interface Estadocuenta 
{
	void Depositar(double monto);
	 void Extraer(double monto);
	void Pagarintereses();
	void Actualizarestado(Cuenta cuenta);
	void Setestado(Cuenta cuenta);
	
	
	
	
}
