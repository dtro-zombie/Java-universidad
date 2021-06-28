package act_1;

public class main {

	public static void main(String[] args) {
		Fraccion fraccion1 = new Fraccion(7, 2);
		Fraccion fraccion2 = new Fraccion(7, 2);

		fraccion1.imprimir();
		fraccion1.reducir();
		fraccion1.imprimir();
		
	Fraccion.producto(fraccion1, fraccion2).imprimir();
	Fraccion.suma(fraccion1, fraccion2).imprimir();
	}

}
