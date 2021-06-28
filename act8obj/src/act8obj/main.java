package act8obj;

public class main {

	public static void main(String[] args) {
		
		
		Conjunto c1 = new Conjunto();
		Conjunto c2 = new Conjunto();
		
		c1.agregar(1);
		c1.agregar(2);
		c1.agregar(7);
		c2.agregar(1);
		c2.agregar(2);
		c2.agregar(5);
		System.out.println("union ");
		Conjunto.union(c1, c2).imprimir();
		System.out.println("interseccion ");
		Conjunto.interseccion(c1, c2).imprimir();
		System.out.println("resta");
		Conjunto.resta(c1, c2).imprimir();
		System.out.println("restar");
		c1.restar(c2);
		System.out.println("");
		c2.imprimir();
		
}

}
