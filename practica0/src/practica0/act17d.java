package practica0;

import unpaz.ayp3.Consola;

public class act17d {

	public static void main(String[] args)

	{
		
		int num=0;
		System.out.println("igrese un numero");
		num=Consola.pedirEntero();
		System.out.println(recurFactorial(num));	
		
		

	}
	
	static int recurFactorial(int n) 
	{
		
		if(n==1)
		{
			return 1;
		}
		
		else
		{
			return n*recurFactorial(n-1);
		}
		
	}

}