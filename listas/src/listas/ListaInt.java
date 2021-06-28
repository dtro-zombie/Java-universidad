package listas;

public class ListaInt {

	NodoInt primero;

	public ListaInt() {

	}

	void agregarAdelante(int e) {

		NodoInt nuevonodo = new NodoInt();

		nuevonodo.elemento = e;

		nuevonodo.siguiente = this.primero;

		this.primero = nuevonodo;

	}

	void imprimir() {

		System.out.print("[");
		NodoInt n = this.primero;

		while (n != null) {
			System.out.print(n.elemento + " ");
			n = n.siguiente;

		}

		System.out.print("]");
	}

	void agregarAtras(int e) {

		NodoInt ultimo = new NodoInt();
		ultimo.elemento = e;
		ultimo.siguiente = null;
		if (this.primero == null) {
			this.primero = ultimo;
			return;
		}
		NodoInt n = this.primero;
		while (n.siguiente != null) {
			n = n.siguiente;
		}
		n.siguiente = ultimo;

	}

	int largo() {

		int cont = 0;

		NodoInt n = this.primero;
		while (n.siguiente != null) {
			cont++;
			n = n.siguiente;
		}

		return cont;
	}

	boolean pertenece(int e) {

		NodoInt n = this.primero;

		while (n.siguiente != null) {
			if (n.elemento == e) {
				return true;
			}
			n = n.siguiente;
		}
		if (n.elemento == e) {
			return true;
		}

		return false;
	}

	int iesimo(int pos) {
		int cont = 0;

		NodoInt n = this.primero;

		while (cont < pos) {

			n = n.siguiente;
			cont++;

		}

		return n.elemento;
	}

	void quitar(int e) {

		if (this.primero != null && this.primero.elemento == e) {

			this.primero = this.primero.siguiente;
			return;
		}

		NodoInt actual = this.primero, prev = null;
		while (actual != null && actual.elemento != e) {
			actual = (prev = actual).siguiente;
		}

		if (actual != null) {
			prev.siguiente = actual.siguiente;
		}

	}

	void quitarTodos(int e) {
		do {
			if (pertenece(e)) {

				quitar(e);
			}
		} while (pertenece(e) != false);
	}

	void recortarDesde(int k) {
		int cont = 0;

		NodoInt n = this.primero;

		while (cont < k) {

			n = n.siguiente;

			cont++;

		}

		n.siguiente = null;

	}

	void recortarHasta(int k) {
		int cont = 0;

		NodoInt n = this.primero;

		while (cont < k) {
			quitar(n.elemento);
			n = n.siguiente;

			cont++;

		}

	}

	void quitarPrimero() {
		this.primero = this.primero.siguiente;

	}

	int primero() {
		return this.primero.elemento;
	}

	void quitarDuplicado() {
		
		NodoInt n = this.primero;
		NodoInt aux = n.siguiente; 
		while(n!=null)
		{ 
			
			aux = n.siguiente; 
		
			
		     while(aux!=null)
			{
				
				if(n.elemento==aux.elemento)
				{
					quitar(n.elemento);
					aux=aux.siguiente;
					
				}
				else {
					aux=aux.siguiente;	
					}
				
			}
		     if(pertenece(n.elemento)==false)
		     {
		    	 agregarAtras(n.elemento);
		     }
		     
		n=n.siguiente;
		}
		
		

	}

	void quitarImparesEncerrados() 
	{
		
	 
		

	}
	ListaInt sumaPorPares() 
	{
		ListaInt lst2=new ListaInt();
		NodoInt primero = this.primero;
		NodoInt segundo = primero.siguiente;
		
		while (segundo != null  )
		{
			lst2.agregarAtras(primero.elemento+segundo.elemento);
			lst2.agregarAtras(0);
			
			
			primero=primero.siguiente;
			
			segundo=segundo.siguiente;
			
			
		}
		
		
		
		return lst2;
		
		
		
	}

	ListaInt sublista(int desde, int hasta) 
	{
		ListaInt lst2 = new ListaInt();
		int cont = 0;

		NodoInt n = this.primero;

		while (cont < desde) 
		{
			System.out.println(cont);
			n = n.siguiente;

			cont++;

		}
		System.out.println("");
		while (cont <= hasta) 
		{
			System.out.println(cont);
			lst2.agregarAtras(n.elemento);
			n = n.siguiente;

			cont++;

		}
		
		return lst2;
		
	}

	
}
