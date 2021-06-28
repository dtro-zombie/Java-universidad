package Listas;

public class NodoArbol {

	private int elemento;
	private NodoArbol hijo_izquierdo;
	private NodoArbol hijo_derecho;
	
	public NodoArbol(int elemento) {
		
		this.elemento=elemento; 
		hijo_derecho=null;
		hijo_izquierdo=null;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
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