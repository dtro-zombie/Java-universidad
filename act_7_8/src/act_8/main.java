package act_8;

import java.util.LinkedList;

import act_7.Docente;
import act_7.Estudiante;

public class main {

	public static void main(String[] args) {
		
		//vuelo 1
		Tripulante tripulante1 = new Tripulante("Pablo Lopez","piloto",165);
		Tripulante tripulante2 = new Tripulante("Pablo Perez","copiloto",12);
		Tripulante tripulante3 = new Tripulante("John Doez","aeromozo",165);
		Tripulante tripulante4 = new Tripulante("Lisa Wong","inspector",12);
		
		//vuelo 2
		Tripulante tripulante5 = new Tripulante("Juan Bilardo","aeromozo",2);
		Tripulante tripulante6 = new Tripulante("Leonel Messi","aeromozo",2);
		Tripulante tripulante7 = new Tripulante("Angel Gallardo","aeromozo",2);
		Tripulante tripulante8 = new Tripulante("Lisa Steps","aeromozo",2);
		
		//vuelo 3
		Tripulante tripulante9 = new Tripulante("Pablo Lopez","piloto",165);
		Tripulante tripulante10 = new Tripulante("Rafaela Messi","inspector",12);
		Tripulante tripulante11= new Tripulante("Luis Katz","inspector",165);
		Tripulante tripulante12 = new Tripulante("Beatrix Kiddo","inspector",12);
		
		
		//avion
		Avion avion1 = new Avion("jet", 500);
		Avion avion2 = new Avion("avioneta", 50);
		Avion avion3 = new Avion("jet", 500);
		
		//arrays

		Tripulante[] arraytripulante={tripulante1,tripulante2,tripulante3,tripulante4};
		Tripulante[] arraytripulante2={tripulante5,tripulante6,tripulante7,tripulante8};
		Tripulante[] arraytripulante3={tripulante9,tripulante10,tripulante11,tripulante12};
	
		
		Vuelo vuelo1=new Vuelo (avion1,arraytripulante);
		Vuelo vuelo2=new Vuelo (avion2,arraytripulante2);
		Vuelo vuelo3=new Vuelo (avion3,arraytripulante3);
		
		
		Vuelo[] arrayvuelo= {vuelo1,vuelo2,vuelo3};
		
		Aerolinea argentina = new Aerolinea(arrayvuelo);
		
		
		//respuestas
		
		//A---------------------------------------
		
			System.out.println("A");
			System.out.println(argentina.vuelosEn(tripulante1,"jet"));
			
			System.out.println("________________________________________");
		
			
			
		//B---------------------------------------
		System.out.println("B");
		
			System.out.println(argentina.antiguedadPromedio("avioneta"));
			System.out.println("________________________________________");
			
		//C---------------------------------------
			System.out.println("C");
			
LinkedList<Vuelo> vuelocargado = argentina.vuelosSobrecargados();
			
			System.out.println("vuelos sobrecargados ");
			for(Vuelo e: vuelocargado){
				
				
				System.out.println(e.toString());
			}
		//D---------------------------------------
			System.out.println("D");
			System.out.println(argentina.masInspeccionado());
			System.out.println("________________________________________");
			
		//E---------------------------------------
		
			System.out.println("E");
LinkedList<String> avionesPiloteadosPor = argentina.avionesPiloteadosPor("Pablo Lopez");
			
			System.out.println("avines pilotados ");
			for(String e: avionesPiloteadosPor){
				
				
				System.out.println(e.toString());
			}
			
			System.out.println("________________________________________");
		//F---------------------------------------
			System.out.println("F");
			
			
			System.out.println(argentina.empleadoDelMes().toString());
			
			System.out.println("________________________________________");
		
		
		
		
	}

}
