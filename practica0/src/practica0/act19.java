package practica0;

import unpaz.ayp3.Consola;

public class act19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra= null;
		
		System.out.println("ingrese una plabra");
		palabra=Consola.pedirTexto();
		
		for (int i=0; i<=palabra.length()-1;i++)
		{
			System.out.println(palabra.charAt(i));
		}

	}

}
