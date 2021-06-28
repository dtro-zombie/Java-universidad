package strategy_patron;

public class Vendedorplata implements Strategy {
	public double Comison(double monto) {
		
		return  monto*0.01;
	}

}
