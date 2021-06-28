package practica0;

import unpaz.ayp3.Consola;

public class act8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1=0, nota2=0;
		System.out.println("ingreses num1");

		nota1=Consola.pedirEntero();


		System.out.println("ingreses num2");

		nota2=Consola.pedirEntero();
		ponerNota(nota1, nota2);
		

	}
	
	
	static void ponerNota(double x, double y) 
	{
		double fin=0;
		
		fin=(x+y)/2;
		
		if (fin>=7)
		{
			System.out.println("promocionado");
		}
		else if(fin<7 && fin>=4)
		{
			System.out.println("aprobado");
		}
		
		else {
			System.out.println("debe recuperar");
		}
		
	}

}
