package practica0;

import unpaz.ayp3.Consola;

public class act22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra= null;
		
		System.out.println("ingrese una plabra");
		palabra=Consola.pedirTexto();
		
		System.out.println(esAbecedaria(palabra));

	}
		
	
	static boolean esAbecedaria(String s) 
	{

		for (int i=0;i<=s.length()-1;i++)
		{
			
			System.out.println(i);
			
			for (int j=i+1;j<s.length();j++)
			{
				
				
				
				if(s.charAt(i)>s.charAt(j))
				{
					
					return false;
					
				}
				
			}
		}
		
		return true;
		
	}
}
