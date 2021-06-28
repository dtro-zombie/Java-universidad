package practica0;

import unpaz.ayp3.Consola;

public class act24 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

String palabra= null;
		
		System.out.println("ingrese una plabra");
		palabra=Consola.pedirTexto();
		
		System.out.println(esSinRepetidos(palabra));
	}
	
	static boolean esSinRepetidos(String s)
	{
	 
	  for (int i=0;i<=s.length()-1;i++)
		{
			
			
			
			for (int j=i+1;j<s.length();j++)
			{
				
				
				
				if(s.charAt(i)==s.charAt(j))
				{
					
					return false;
					
				}
				
			}
		}
		
		return true;
}
}