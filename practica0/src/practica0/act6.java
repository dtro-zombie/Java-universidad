package practica0;

import unpaz.ayp3.Consola;

public class act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=0, num2=0;


		System.out.println("ingreses num1");

		num1=Consola.pedirEntero();


		System.out.println("ingreses num2");

		num2=Consola.pedirEntero();

		imprimirSuma( num1, num2);
		
		
	

		
	}
	
	static void imprimirSuma(int a, int b) 
	{
		
		int sum=0;
		
		sum=a+b;
		
		System.out.println("la suma es " +sum);
		
	}


}
