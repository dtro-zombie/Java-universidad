package practica0;

import unpaz.ayp3.Consola;

public class act17c {

	public static void main(String[] args) {
		
		int num=0;
		double base=0;
		System.out.println("igrese un base");
		base=Consola.pedirDecimal();
		System.out.println("ingrese exponente");
		num=Consola.pedirEntero();
		System.out.println(iterPotencia(base,num));	

	}
	
	static double iterPotencia(double base ,int n)
	{
		
		if(n==0)
		{
			return 1;
		}
		
		else
		{
			return base*iterPotencia(base,n-1);
		}
	}

}