package Listas;

public class PilaIntConListaEnlazada implements PilaInt {

	private ListaInt lista;

	PilaIntConListaEnlazada() {

		this.lista = new ListaInt();
	}

	@Override
	public void apilar(int n) {

		this.lista.agregarAdelante(n);

	}

	@Override
	public void desapilar() {

		this.lista.eliminar();

	}

	@Override
	public boolean estaVacia() {

		if (this.lista.largo() == 0) {

			return true;
		} else {

			return false;
		}
	}

	@Override
	public int tope() {

		if (this.estaVacia()) {

			throw new RuntimeException("Pila vacia");

		}

		return this.lista.UltimoValor();
	}

	@Override
	public void imprimir() {

	}
}
