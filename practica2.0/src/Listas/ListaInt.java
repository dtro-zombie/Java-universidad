package Listas;



public class ListaInt {

	private NodoInt primero;

	public NodoInt getPrimero() {
		return primero;
	}

	public void setPrimero(NodoInt primero) 
	{
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
			n = (NodoInt) n.getSiguiente();
		}
		n.setSiguiente(ultimo);

	}

	void imprimir() {

		System.out.print("[");
		NodoInt n = this.primero;

		while (n != null) {
			System.out.print(n.getElemento() + " ");
			n = (NodoInt) n.getSiguiente();

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

			n = (NodoInt) n.getSiguiente();
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
			n = (NodoInt) n.getSiguiente();
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
		NodoInt aux = (NodoInt) n.getSiguiente();
		while (n != null) {
			aux = (NodoInt) n.getSiguiente();
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

	public void agregarEnPosicion(int pos, int elem) 
	{
		int cont=0;
		if(pos==0)
		{
			this.agregarAdelante(elem);
			
		}
		
		else if (pos==this.largo())
		{
			this.agregarAtras(elem);
		}
		else
		{
			NodoInt n= this.primero;
			NodoInt aux= new NodoInt();
			while(n != null) {
				
				cont++;
				
				if(cont==pos)
				{
					aux.setSiguiente((NodoInt) n.getSiguiente());
					aux.setElemento(elem);
					n.setSiguiente(aux);
					return;
				}
				
				n=(NodoInt) n.getSiguiente();
			}
			
		}
		
		
	}

	public void insertarOrdenado(int e) {
		do {
			this.agregarAtras(e);
			this.ordenar();
		} while (this.estaOrdenada() != true);
	}

	
	  public static void intercambiarColas(ListaInt l1, int pos1, ListaInt l2, int
	  pos2)
	  {
	  
		  NodoInt n = l1.primero;
		  NodoInt n2 = l2.primero;
		  NodoInt aux = new NodoInt();
		  NodoInt aux2 = new NodoInt();
		  int cont=0;
		  aux=l1.primero;
		  while(n != null)
		  {
			  if( cont>= pos1 )
			  {
				  
				  aux.setSiguiente((NodoInt) n.getSiguiente());
				  
			  }
			  
			  n.setSiguiente((NodoInt) n.getSiguiente());
			  
		  }
		  
		  //bueno aca ya se me terminaron las ideas
		  
		  
		  
	   
	  }
	 

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

	public int eliminar()
	{
		int aux=primero.getElemento();
		primero=(NodoInt) primero.getSiguiente();
		return aux;
	}
	
	

	public int UltimoValor() {
		
		return primero.getElemento();
		
	}
	
}
