package practica0;

import unpaz.ayp3.Consola;

public class act12 {

	public static void main(String[] args) {
		
		int n1=0, m1=0;
		
		boolean divisible = false;
		System.out.println("numero 1");
		n1=Consola.pedirEntero();
		System.out.println("numero 2");
		m1=Consola.pedirEntero();
		divisible=esDivisible(n1,m1);
		
		System.out.println(divisible);
	}

	
	static boolean esDivisible(int n, int m)
	{
		int division=0;
		
		division=n%m;
		
		if( division==0 ) 
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
}
