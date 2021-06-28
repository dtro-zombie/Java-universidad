package practica0;

import unpaz.ayp3.Consola;

public class act10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=0;
		boolean espa=false;
		numero=Consola.pedirEntero();
		
		//if(numero%2 == 0)

		//{
			//System.out.println(+numero+ " es par");
		//}
		//else 
		//{
			//System.out.println(+numero+ " es inpar");
		//}
		espa=Espar(numero);
		System.out.println(espa);

	}
static boolean Espar(int x)
{
	if(x%2 == 0)

	{
		return true;
	}
	else 
	{
		return false;
	}
}



}
