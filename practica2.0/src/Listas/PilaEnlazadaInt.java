package Listas;

public class PilaEnlazadaInt implements PilaInt {

	private NodoInt primero;

	{
		NodoInt primero;

	}

	@Override
	public void apilar(int n) {

		NodoInt nuevonodo = new NodoInt();

		nuevonodo.setElemento(n);

		nuevonodo.setSiguiente(this.primero);

		this.primero = nuevonodo;
	}

	@Override
	public void desapilar() {
		if (this.estaVacia() == true) {
			return;
		} else {
			this.primero = (NodoInt) this.primero.getSiguiente();
		}
	}

	@Override
	public boolean estaVacia() {
		if (this.primero == null) {
			return true;
		}
		return false;
	}

	@Override
	public int tope() {
		

		if (this.estaVacia() == true) {
			return 0;
		}

		return this.primero.getElemento();

	}

	@Override
	public void imprimir() {
		System.out.print("[");
		NodoInt n = this.primero;

		while (n != null) {
			System.out.print(n.getElemento() + " ");
			n = (Listas.NodoInt) n.getSiguiente();
		}
		System.out.print("]");
	}

}
