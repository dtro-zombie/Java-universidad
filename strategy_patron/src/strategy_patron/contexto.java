package strategy_patron;

public class contexto 
{
	private Strategy comisionstrategy;
	
	public contexto (Strategy comisionstrategy)
	{
		this.comisionstrategy=comisionstrategy;
	}
	
	public double Implementarstrategy (double monto)
	{
		return comisionstrategy.Comison(monto);
	}
}
