package practica0;

import unpaz.ayp3.Consola;

public class act25 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

String palabra= null;
		
		System.out.println("ingrese una plabra");
		palabra=Consola.pedirTexto();
		
		System.out.println(esSinRepetidos(palabra));
	}
	
	static String esSinRepetidos(String s) 
	{
		String palabra="";
		char c=0;
		 for (int i=0;i<=s.length()-1;i++)
			{
			 c=s.charAt(i);
			 if(c!=' ')
			 {
				 palabra+=c;
				 s=s.replace(s.charAt(i),' ');
			 }
			}
		 return palabra;
}
}
		
		
	

