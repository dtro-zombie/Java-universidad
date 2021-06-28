package practica0;

import unpaz.ayp3.Consola;

public class act27 {

	public static void main(String[] args) {
int num=0;
		
		System.out.println("ingrese un numero");
		num=Consola.pedirEntero();
		
		collatz(num );

	}
	
	static void collatz(int n)
	{
		
		do 
		{
		  
			if(n%2==0)
			{
				System.out.println("es par  "  +n);
				n/=2;
			}
			
			else 
			{
				System.out.println("es impar  " +n);
				n= 3*n+1;
			}
			
			
		}while(n != 1);
		
		System.out.println("vale 1  " +n);
		
	}

}
