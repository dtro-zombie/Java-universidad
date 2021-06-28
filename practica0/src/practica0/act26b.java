package practica0;

import unpaz.ayp3.Consola;

public class act26b {

	public static void main(String[] args) 
	{
		int num=0;
		
		System.out.println("ingrese un numero");
		num=Consola.pedirEntero();
		
		System.out.println( fibrec(num ));
	}


	static int fibrec(int n)
	{
		int  siguiente = 1, actual = 0, temporal = 0;
		
		for ( int i = 1; i <= n; i++) 
		{
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		
		return actual;
	}
}