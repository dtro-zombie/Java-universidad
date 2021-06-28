package act_8;

import java.util.LinkedList;
import java.util.stream.Collectors;

import act_7.Estudiante;

public class Vuelo {
	
	Avion avion;
	Tripulante[] tripulacion;
	
	Vuelo(Avion avion,Tripulante[] tripulacion){
		
		this.avion=avion;
		this.tripulacion=tripulacion;
		
		
		
	}
	public String toString()
	{
		return avion.tipo;
	}
	
	
	
	
	
	
	LinkedList<Vuelo> vuelosSobrecargados()
	{
		LinkedList<Vuelo> Vuelocargado =new LinkedList<>();
		int cont=0;
		int porcentaje=0;
		for(int i=0; i<tripulacion.length;i++)
		{
			
			if(tripulacion[i].cargo=="aeromozo")
			{
				cont++;
			}
		}
		
		
		porcentaje= (cont*100)/tripulacion.length;
		if(porcentaje>10)
		{
			Vuelocargado.add(this);
		}
		
		
		return Vuelocargado;
		
		

}
	LinkedList<String> avionesPiloteadosPor(String nombre)
	{
		LinkedList<String> avionesPiloteadosPor = new LinkedList<>();

		for (int i = 0; i < tripulacion.length; i++) {

			if (nombre==tripulacion[i].nombre && tripulacion[i].cargo=="piloto") 
			{
				
				if (!avionesPiloteadosPor.contains(avion.tipo)) {
					
					avionesPiloteadosPor.add(avion.tipo);
				}
				

			}

		}
				
		return avionesPiloteadosPor;
		
	}
}