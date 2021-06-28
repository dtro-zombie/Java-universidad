package practica0;

import unpaz.ayp3.Consola;

public class act21 {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			
			String palabra= null;
		
			System.out.println("ingrese una plabra");
			palabra=Consola.pedirTexto();
			
			System.out.println(cantidadVocales(palabra));
			
		}
		
		static int cantidadVocales(String s) 
		{
			int cant=0;
			
			for (int i=0;i<=s.length()-1;i++)
			{
				if(s.charAt(i)=='a')
				{
					cant++;
				}
				if(s.charAt(i)=='e')
				{
					cant++;
				}
				if(s.charAt(i)=='i')
				{
					cant++;
				}
				if(s.charAt(i)=='o')
				{
					cant++;
				}
				if(s.charAt(i)=='u')
				{
					cant++;
				}
					
			}
			
			
			return cant;
		}

	}