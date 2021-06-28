package practica0;

import unpaz.ayp3.Consola;

public class act13 {

	public static void main(String[] args) 
	{
		int num=0;
		System.out.println("igrese un numero");
		num=Consola.pedirEntero();
		System.out.println(sumatoria(num));
	}
	
	static int sumatoria(int n) 
	{
		int sum=0;
		for (int i=0;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}

}
