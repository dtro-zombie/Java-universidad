
public class Arbol {
	private NodoArbol raiz;

	public Arbol() {

		raiz = null;
	}
	
public void insertar(ElementoComparable elemento){
		
		if(this.raiz == null){
			NodoArbol nuevo = new NodoArbol(elemento);
			this.raiz = nuevo;
		}else{
			this.insertar(this.raiz,elemento);
		}
		
	}
	
	private void insertar(NodoArbol nodo, ElementoComparable elemento){
		
		if(elemento.menorQue(nodo.getElemento())){
			
			if(nodo.getHijo_izquierdo() != null){
				this.insertar(nodo.getHijo_izquierdo(), elemento);
			}else{
				NodoArbol nuevo = new NodoArbol(elemento);
				nodo.setHijo_izquierdo(nuevo);
			}
		}else{
			if(nodo.getHijo_derecho() != null){
				this.insertar(nodo.getHijo_derecho(), elemento);
			}else{
				NodoArbol nuevo = new NodoArbol(elemento);
				nodo.setHijo_derecho(nuevo);
			}
		}
		
	}
		
	

	

	public NodoArbol getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoArbol raiz) {
		this.raiz = raiz;
	}

	public static void inorden(NodoArbol r) {
		if (r != null) {
			inorden(r.getHijo_izquierdo());
			r.visitar();
			inorden(r.getHijo_derecho());
		}
	}
	public static void preorden(NodoArbol r)
	{
	if (r != null)
		 {
	r.visitar();
	preorden(r.getHijo_izquierdo());
	preorden(r.getHijo_derecho());
		 }
	}
	public static void postorden(NodoArbol r)
	{
	if (r != null)
		 {
	postorden (r.getHijo_izquierdo());
	postorden (r.getHijo_derecho());
	r.visitar();
	
		 }
	}
}