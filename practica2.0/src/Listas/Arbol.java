package Listas;

public class Arbol {

	private NodoArbol raiz;

	public Arbol() {

		raiz = null;
	}

	public void insertar(int e) {
		NodoArbol nuevo = new NodoArbol(e);
		if (raiz == null) {
			raiz = nuevo;
		} else {
			NodoArbol aux = raiz;
			NodoArbol padre;

			while (true) {

				padre = aux;
				if (e < aux.getElemento()) {
					aux = aux.getHijo_izquierdo();
					if (aux == null) {
						padre.setHijo_izquierdo(nuevo);
						return;
					}

				} 
				else {
					aux = aux.getHijo_derecho();
					if( aux==null )
						
					{
						padre.setHijo_derecho(nuevo);
						return;
					}
				}

			}
		}
	}
	// metodo para sabe si esta vacio

	public boolean estaVacio() {
		return this.raiz == null;
	}

	public void recorrerInOrden(NodoArbol r) {
		if (r != null) {
			recorrerInOrden(raiz.getHijo_izquierdo());

			System.out.println(r.getElemento());

			recorrerInOrden(raiz.getHijo_derecho());

		}
	}

	public NodoArbol getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoArbol raiz) {
		this.raiz = raiz;
	}

}