package practica0;

import unpaz.ayp3.Consola;

public class act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=0, num2=0;


		System.out.println("ingreses num1");

		num1=Consola.pedirEntero();


		System.out.println("ingreses num2");

		num2=Consola.pedirEntero();

		imprimirPromedio( num1, num2);
		
		
	

		
	}
	
	static void imprimirPromedio(int a, int b)

	{
		
		int prom=0;
		
		prom=(a+b)/2;
		
		System.out.println("la suma es " +prom);
		
	}


}