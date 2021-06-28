package practica0;

import unpaz.ayp3.Consola;

public class act20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra= null, buscar=null;
		char c;
		System.out.println("ingrese una plabra");
		palabra=Consola.pedirTexto();
		System.out.println("ingrse una letra");
		buscar=Consola.pedirTexto();
		c=buscar.charAt(0);
		System.out.println(cantidadApariciones(palabra, c));
		
	}
	
	static int cantidadApariciones(String s, char c) 
	{
		int cant=0;
		
		for (int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==c)
			{
				cant++;
			}
				
		}
		
		
		return cant;
	}

}
