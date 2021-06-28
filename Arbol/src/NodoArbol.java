
public class NodoArbol {
	
	private ElementoComparable elemento;
	private NodoArbol hijo_izquierdo;
	private NodoArbol hijo_derecho;
	
	
	NodoArbol(ElementoComparable elemento)
	{
		this.elemento=elemento;
		hijo_izquierdo=null;
		hijo_derecho=null;
	}
	
	
	public void visitar()
	{
		

		 this.getElemento().imprimir();
		
		
	}
	
	public ElementoComparable getElemento() {
		return elemento;
	}
	public void setElemento(ElementoComparable elemento) {
		this.elemento = elemento;
	}
	public NodoArbol getHijo_izquierdo() {
		return hijo_izquierdo;
	}
	public void setHijo_izquierdo(NodoArbol hijo_izquierdo) {
		this.hijo_izquierdo = hijo_izquierdo;
	}
	public NodoArbol getHijo_derecho() {
		return hijo_derecho;
	}
	public void setHijo_derecho(NodoArbol hijo_derecho) {
		this.hijo_derecho = hijo_derecho;
	}
	

	
}
