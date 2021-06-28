package strategy_patron;

public class main {

	public static void main(String[] args) {
		int monto = 6000;
		Strategy comisionstrategy = getStrategy(monto);
		contexto contexto = new contexto(comisionstrategy);
		System.out.println("Commision por " + monto + "= " + contexto.Implementarstrategy(monto));

		monto = 4000;

		comisionstrategy = getStrategy(monto);
		contexto = new contexto(comisionstrategy);
		System.out.println("Commision por " + monto + "= " + contexto.Implementarstrategy(monto));

		monto = 1000;
		comisionstrategy = getStrategy(monto);
		contexto = new contexto(comisionstrategy);
		System.out.println("Commision por" + monto + "= " + contexto.Implementarstrategy(monto));

	}

	private static Strategy getStrategy(double monto) {

		Strategy strategy;

		if (monto >= 5000) {
			strategy = new Vendedororo();

		}

		else if (monto < 5000 && monto >= 3000) {
			strategy = new Vendedorplata();
		}

		else {
			strategy = new Vendedorbronce();
		}
		return strategy;
	}

}
