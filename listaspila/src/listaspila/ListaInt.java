package listaspila;

import Listas.NodoInt;

public class ListaInt {

	private NodoInt primero;

	public NodoInt getPrimero() {
		return primero;
	}

	public void setPrimero(NodoInt primero) {
		this.primero = primero;
	}

	public ListaInt() {
		this.primero = null;
	}

	void agregarAdelante(int e) {

		NodoInt nuevonodo = new NodoInt();

		nuevonodo.setElemento(e);

		nuevonodo.setSiguiente(this.primero);

		this.primero = nuevonodo;

	}

	void agregarAtras(int e) {

		NodoInt ultimo = new NodoInt();
		ultimo.setElemento(e);
		ultimo.setSiguiente(null);
		if (this.primero == null) {
			this.primero = ultimo;
			return;
		}
		NodoInt n = this.primero;
		while (n.getSiguiente() != null) {
			n = (Listas.NodoInt) n.getSiguiente();
		}
		n.setSiguiente(ultimo);

	}

	void imprimir() {

		System.out.print("[");
		NodoInt n = this.primero;

		while (n != null) {
			System.out.print(n.getElemento() + " ");
			n = (Listas.NodoInt) n.getSiguiente();

		}

		System.out.print("]");
	}

	int largo() {

		int cont = 0;
		if (this.estaVacia() == true) {
			return 0;
		}

		else {
			NodoInt n = getPrimero();
			while (n != null) {
				cont++;
				n = (NodoInt) n.getSiguiente();
			}

			return cont;
		}
	}

	public boolean estaVacia() {
		if (this.primero == null) {
			return true;
		}
		return false;
	}

	public int suma() {

		int suma = 0;
		if (this.estaVacia() == true) {
			return suma;
		}

		else {
			NodoInt n = getPrimero();
			while (n != null) {
				suma += n.getElemento();
				n = (NodoInt) n.getSiguiente();
			}

			return suma;
		}

	}

	public double promedio() {
		if (this.estaVacia() == true) {
			return 0;
		} else {
			return this.suma() / (double) this.largo();
		}

	}

	public int iesimo(int i) {

		int cont = 0;

		NodoInt n = this.primero;

		while (cont < i && i < this.largo()) {

			n = (Listas.NodoInt) n.getSiguiente();
			cont++;

		}

		return n.getElemento();
	}

	public boolean buscar(int e) {
		NodoInt n = this.primero;

		while (n != null) {
			if (n.getElemento() == e) {
				return true;
			}
			n = (Listas.NodoInt) n.getSiguiente();
		}

		return false;

	}

	public int maximo() {

		NodoInt n = this.primero;
		int mayor = 0;

		while (n != null) {

			if (n.getElemento() > mayor) {

				mayor = n.getElemento();

			}

			n = (NodoInt) n.getSiguiente();
		}

		return mayor;
	}

	public boolean estaOrdenada() {

		NodoInt n = this.primero;
		NodoInt aux = (Listas.NodoInt) n.getSiguiente();
		while (n != null) {
			aux = (Listas.NodoInt) n.getSiguiente();
			while (aux != null) {

				if (n.getElemento() > aux.getElemento()) {

					return false;

				} else {
					aux = (NodoInt) aux.getSiguiente();
				}

			}

			n = (NodoInt) n.getSiguiente();
		}
		return true;

	}

	void ordenar() {
		NodoInt n = this.primero;
		NodoInt aux = (NodoInt) n.getSiguiente();
		int cambio = 0;
		while (n != null) {
			aux = (NodoInt) n.getSiguiente();
			while (aux != null) {
				if (n.getElemento() > aux.getElemento()) {
					cambio = aux.getElemento();
					aux.setElemento(n.getElemento());
					n.setElemento(cambio);
				} else {
					aux = (NodoInt) aux.getSiguiente();
				}
			}
			n = (NodoInt) n.getSiguiente();
		}
	}
	// Actividad 2

	public void rotarDerecha() {
		ListaInt lst = new ListaInt();
		NodoInt n = this.primero;
		while (n != null) {
			lst.agregarAdelante(n.getElemento());
			n = (NodoInt) n.getSiguiente();
		}
		this.primero = lst.primero;
		lst = null;

	}

	public void agregarEnPosicion(int pos, int elem) {

	}

	public void insertarOrdenado(int e) {
		do {
			this.agregarAtras(e);
			this.ordenar();
		} while (this.estaOrdenada() != true);
	}

	/*
	 * public static void intercambiarColas(ListaInt l1, int pos1, ListaInt l2, int
	 * pos2) {
	 * 
	 * ListaInt lst = new ListaInt(); ListaInt lst2 = new ListaInt(); int cont=0;
	 * while(l1 != null) { if(cont <= pos1 && cont<= l2.largo()) {
	 * lst.agregarAtras(l1.primero.getElemento()); l1=(ListaInt)
	 * l1.primero.getSiguiente();
	 * 
	 * } if (cont> pos2 && cont<= l1.largo( )){
	 * lst2.agregarAtras(l2.primero.getElemento()); l1=(ListaInt)
	 * l1.primero.getSiguiente(); } } cont=0; while(l2 != null) { if(cont <= pos2 &&
	 * cont<= l2.largo()) { lst2.agregarAtras(l2.primero.getElemento());
	 * l2=(ListaInt) l2.primero.getSiguiente();
	 * 
	 * } if (cont> pos2 && cont<= l2.largo()){
	 * lst.agregarAtras(l1.primero.getElemento()); l2=(ListaInt)
	 * l2.primero.getSiguiente(); } }
	 * 
	 * l1=lst; l2=lst2;
	 * 
	 * 
	 * }
	 */

	// actividad 3

	public ListaInt buscarTodos(int e) {
		ListaInt lst = new ListaInt();
		NodoInt n = this.primero;
		int cont = 0;
		while (n != null) {
			cont++;
			if (n.getElemento() == e) {
				lst.agregarAdelante(cont);

			}
			n = (NodoInt) n.getSiguiente();
		}
		lst.ordenar();
		return lst;
	}

	public void anexar(ListaInt otraLista) {
		NodoInt n = this.primero;
		while (n.getSiguiente() != null) {

			n = (NodoInt) n.getSiguiente();
		}

		n.setSiguiente(otraLista.primero);
		this.ordenar();

	}

	public static ListaInt concatenar(ListaInt l1, ListaInt l2) {
		ListaInt lst = new ListaInt();
		NodoInt n = l1.primero;

		lst = l1;

		while (n.getSiguiente() != null) {

			n = (NodoInt) n.getSiguiente();
		}

		n.setSiguiente(l2.primero);

		return lst;

	}
	public ListaInt reversa() {
		
		ListaInt lst = new ListaInt();
		NodoInt n = this.primero;
		while(n!= null)
		{
			lst.agregarAdelante(n.getElemento());
			n = (NodoInt) n.getSiguiente();
		}
		return lst;
	}
	
	public static ListaInt combinarListasOrdenadas(ListaInt l1, ListaInt l2) 
	{
	
		if(l1.estaOrdenada() && l2.estaOrdenada())
		{
			
			l1.anexar(l2);
			return l1;
		}
		else
		{
			System.out.println("datos desordenados");
		return null;
		}
	}
}
