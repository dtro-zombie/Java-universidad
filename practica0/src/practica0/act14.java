package practica0;

import unpaz.ayp3.Consola;

public class act14 {

	public static void main(String[] args) {
		int num=0;
		System.out.println("igrese un numero");
		num=Consola.pedirEntero();
		System.out.println(sumatoriaPares(num));

	}
	
	static int sumatoriaPares(int n) 
	{
		int sum=0;
		
		for(int i=2;i<=n;i+=2)
		{
			
			sum+=i;
			
		}
		
		return sum;
	}

}
