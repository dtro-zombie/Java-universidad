package practica0;

import unpaz.ayp3.Consola;

public class act23 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

String palabra= null;
		
		System.out.println("ingrese una plabra");
		palabra=Consola.pedirTexto();
		
		System.out.println(esCapicua(palabra));
	}
	
	static boolean esCapicua(String s) 
	{
	  boolean salida=true;
	  int mitad=s.length()/2, j=s.length()-1;
	  for (int i=0;i<=mitad;i++)
	  {
		  if(s.charAt(i)==s.charAt(j))
		  {
			  j--;
			  
			  salida=true;
		  }
		  else 
		  {
			  return false;
		  }
	  }
	return salida;
	}
}
