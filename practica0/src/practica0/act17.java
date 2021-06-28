package practica0;

import unpaz.ayp3.Consola;

public class act17 {

	public static void main(String[] args)

	{
		
		int num=0;
		System.out.println("igrese un numero");
		num=Consola.pedirEntero();
		System.out.println(iterSumatoria(num));	
		
		

	}
	
	static int iterSumatoria(int n) 
	{
		
		if(n==1)
		{
			return 1;
		}
		
		else
		{
			return n+iterSumatoria(n-1);
		}
		
	}

}
