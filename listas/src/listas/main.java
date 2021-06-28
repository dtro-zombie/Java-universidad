package listas;

public class main {

	public static void main(String[] args) {

		ListaInt lst = new ListaInt();
		lst.agregarAdelante(9);
		lst.agregarAdelante(7);
		lst.agregarAdelante(1);
		lst.agregarAdelante(1);
		lst.agregarAdelante(1);
		lst.agregarAdelante(0);
		
		lst.imprimir();
		
		lst.sumaPorPares().imprimir();
		
	}

}
