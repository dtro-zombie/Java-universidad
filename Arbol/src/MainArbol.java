
public class MainArbol {

	public static void main(String[] args)
	
	{
		Arbol ar = new Arbol();
		
		ar.insertar(new MiEntero(10));
		ar.insertar(new MiEntero(5));
		
		
		ar.inorden(ar.getRaiz());
		
	}

}
