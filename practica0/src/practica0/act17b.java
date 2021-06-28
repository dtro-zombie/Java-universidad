package practica0;

import unpaz.ayp3.Consola;

public class act17b {

	public static void main(String[] args) 
	{
		
		int num=0;
		System.out.println("igrese un numero");
		num=Consola.pedirEntero();
		System.out.println(recurSumatoriaPares(num));	
		
		

	}
	
	static int recurSumatoriaPares(int n) 
	{
		
		if(n==0)
		{
			return 0;
		}
		
		else
		{
			if(n%2==0)
			{
			return n+recurSumatoriaPares(n-1);
			}
			else 
			{
				return recurSumatoriaPares(n-1);
			}
		}
		
	}

}

