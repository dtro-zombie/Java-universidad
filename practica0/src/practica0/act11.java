package practica0;

import unpaz.ayp3.Consola;

public class act11 {
	public static void main(String[] args) {
		
		System.out.println("Escriba un numero: ");
		int x=Consola.pedirEntero();
		
		int cifras=cantCifras(x);
      System.out.println("La cantidad de cifras es: "+ cifras);

	}
 
	static int cantCifras(int n) {
	
		int cont=0;
	do{
		
		n/=10;
		
		cont++;
		
		
		
	}while(n!=0);
			
		
			
		
		
		return cont;
	}


}
