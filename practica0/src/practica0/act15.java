package practica0;

import unpaz.ayp3.Consola;

public class act15 {

	public static void main(String[] args)
	{
		int exp=0;
		double num=0;
		
		System.out.println("igrese un numero");
		num=Consola.pedirDecimal();
		System.out.println("igrese un esponente");
		exp=Consola.pedirEntero();
		System.out.println(potencia(num,exp));
		

	}
	
	static double potencia(double x, int a) 
	{
		double resultado=x;
		for (int i=1;i<a;i++)
		{
			resultado*=x;
		}
		
		
	
		return resultado;
	}

}
