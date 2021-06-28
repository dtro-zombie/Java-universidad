package Listas;

public interface PilaInt {
	
	public void apilar(int n);	 	//que apila el entero n en la pila
	
	public void desapilar(); 		//que desapila el ´ultimo entero almacenado [Requiere:!estaVacia()]
	
	public boolean estaVacia(); 	//que indica si la pila se encuentra vacia o no
	
	public int tope(); 				//que devuelve el ´ultimo entero almacenado [Requiere: !estaVacia()]

	public void imprimir();
}
