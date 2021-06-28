package practica0;

import unpaz.ayp3.Consola;

public class act9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anio=0, mes=0, dia=0;
		
		System.out.println("ingrese dia");
		dia=Consola.pedirEntero();
		System.out.println("ingrese mes");
		mes=Consola.pedirEntero();
		System.out.println("ingrese año");
		anio=Consola.pedirEntero();
		
		imprimirFecha(dia,mes,anio);

	}
	
	static void imprimirFecha(int dia, int mes, int anio)
	{
		if (mes==1) 
		{
			System.out.println(+dia+ " de enero de " +anio);
		}
		if (mes==2) 
		{
			System.out.println(+dia+ "febrero" +anio);
		}
		if (mes==3) 
		{
			System.out.println(+dia+ "marzo" +anio);
		}
		if (mes==4) 
		{
			System.out.println(+dia+ "abril" +anio);
		}
		if (mes==5) 
		{
			System.out.println(+dia+ "mayo" +anio);
		}
		if (mes==6) 
		{
			System.out.println(+dia+ "junio" +anio);
		}
		if (mes==7) 
		{
			System.out.println(+dia+ "julio" +anio);
		}
		if (mes==8) 
		{
			System.out.println(+dia+ "agosto" +anio);
		}
		if (mes==9) 
		{
			System.out.println(+dia+ "septiembre" +anio);
		}
		if (mes==10) 
		{
			System.out.println(+dia+ "octubre" +anio);
		}
		if (mes==11) 
		{
			System.out.println(+dia+ "noviembre" +anio);
		}
		if (mes==12) 
		{
			System.out.println(+dia+ "diciembre" +anio);
		}
		
		
	}

}
