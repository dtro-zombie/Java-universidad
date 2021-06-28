package strategy_patron;

public class Vendedorbronce implements Strategy {

	@Override
	public double Comison(double monto) {
		
		return  monto*0.005;
	}
	
	

}
