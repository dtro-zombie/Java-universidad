package practica0;

import unpaz.ayp3.Consola;

public class act16 {

	public static void main(String[] args)
	{
		
		int num=0;
		System.out.println("igrese un numero");
		num=Consola.pedirEntero();
		System.out.println(factorial(num));	

	}
	
	static double factorial(int n)
	{
		
		for(int i=n-1;i>=1;i--)
		{
			n*=i;
		}
		
		return n;
		
		
	}

}
