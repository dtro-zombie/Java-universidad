package menus;

import java.util.ArrayList;
import java.util.Scanner;

import Individuos.Areamedica;
import Individuos.Clinico;
import Individuos.Medico;
import Individuos.Paciente;
import funcional.Prestaciones;
import funcional.Turno;

public class Administrador {
	

	public static void main(String[] args) {
		boolean salir=false;
		while(!salir){
		try {
		ArrayList<Paciente> listapacientes = new ArrayList <Paciente>();
		Paciente paciente1 = new Paciente();
		ArrayList<Areamedica> listaArea = new ArrayList <Areamedica>();
		ArrayList<Prestaciones> listaPrestacion = new ArrayList <Prestaciones>();
		
		Areamedica area1 = new Areamedica();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1)Administrador");
			System.out.println("2)Medico");
			System.out.println("3)Clinico");
			
			int opcion;
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				menuAdministrador( listapacientes, paciente1, listaArea, area1);
				break;
			
			case 2:
				medicoEstudios(listaArea,listapacientes,listaPrestacion);
				break;
				
			case 3:
				menuClinico(listaPrestacion);
				break;
				
			case 4: 
				System.out.println("Fin de la transaccion!");
				salir=true;
				System.exit(0);
				
			default: 
				System.out.println("Opcion no v�lida");
				break;
			}
		}
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
	}
	
	static void menuAdministrador(ArrayList<Paciente> listapacientes, Paciente paciente1, ArrayList<Areamedica> listaArea , Areamedica area1) {
		boolean salir=false;
		while(!salir){
		try {	
		Scanner sc = new Scanner(System.in);
			int opcion;	
			do {
				System.out.println("1)Administrar Paciente");
				System.out.println("2)Administrar Medico");
				System.out.println("3)Administrar Turno");
				System.out.println("0)Salir");
				opcion = sc.nextInt();
				
				switch(opcion) {
				
				case 1:
					menuPaciente(listapacientes, paciente1);
					break;
				
				case 2:
					menuMedico(listaArea, area1);
					break;
					
				case 3:
					menuTurno(listapacientes, listaArea);
					break;
					
					
				default: 
					System.out.println("Opcion no v�lida");
					break;
				}
			}while(opcion !=0);
			
			salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
	}
	
	static void menuPaciente(ArrayList<Paciente> listapacientes, Paciente paciente1) {
		boolean salir=false;
		while(!salir){
		try {
		Scanner sc = new Scanner(System.in);
		int op;
		
		do {
			
			System.out.println("1)Registrar Paciente");
			System.out.println("2)Modificar Paciente");
			System.out.println("3)Mostrar Paciente");
			System.out.println("0)volver atras");
			
			op = sc.nextInt();
			
			switch(op) {
			
			case 1: 
				paciente1.registrarpaciente(listapacientes);
				break;
				
			case 2:
				int idIngresado=0;
				System.out.println("Ingrese ID del Paciente: ");
				idIngresado = sc.nextInt();
				paciente1.Modificarpaciente(idIngresado, listapacientes);
				break;
				
			case 3:
				paciente1.mostrarpacientes(listapacientes);
				break;
				
			case 0:
				System.out.println("Menu");
				
			}
		} while(op != 0);
		
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
	}
	
	static void menuMedico(ArrayList<Areamedica> listaArea , Areamedica area1) {
		boolean salir=false;
		while(!salir){
		try {


		Scanner sc = new Scanner(System.in);
		
		long matri;
		int op;
		
		do {
			System.out.println("1)Ingresar Medico");
			System.out.println("2)Modificar Medico");
			System.out.println("3)Baja Medico");
			System.out.println("4)Mostrar medicos");
			System.out.println("0)Volver atras");
			op = sc.nextInt();
			
			switch(op) {
			
			case 1:	
				area1.cargarmedico(listaArea);
				break;
			
			case 2:
				area1.modificarmedico(listaArea);
				break;
				
			case 3:
				area1.eliminarmedico(listaArea);
				break;
				
			case 4:
				area1.mostramedicos(listaArea);
				break;
			}
			
			
		}while(op != 0);
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
	}
	
	static void menuTurno(ArrayList<Paciente> listapacientes, ArrayList<Areamedica> listaArea) {
		boolean salir=false;
		while(!salir){
		try {
		Scanner sc = new Scanner(System.in);
		Turno turno1 = new Turno();
		int idTurno, idPaciente;
		int opcion;
		
		do {
		
		System.out.println("1)Ingresar Turno");
			System.out.println("2)Cancelar Turno");
			System.out.println("3)Modificar Turno");
			System.out.println("0)Volver atras");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				turno1.Altaturno(listapacientes, listaArea);
				break;
			
			case 2:
				System.out.println("Ingrese id del Turno");
				idTurno = sc.nextInt();
				System.out.println("Ingrese id del Paciente");
				idPaciente = sc.nextInt();
				turno1.Bajaturno(idTurno, idPaciente, listapacientes);
				break;
				
			case 3:
				System.out.println("Ingrese id del Turno");
				idTurno = sc.nextInt();
				System.out.println("Ingrese id del Paciente");
				idPaciente = sc.nextInt();
				turno1.Modificarturno(idTurno, idPaciente, listapacientes, listaArea);
				break;
				
			case 4: 
				System.out.println("Menu");
				break;
				
			default: 
				System.out.println("Opcion no v�lida");
		
			break;
			}
			}while(opcion!=0);
			
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
		
	}
	
	static void medicoEstudios(ArrayList<Areamedica> listaArea, ArrayList<Paciente> listapacientes, ArrayList<Prestaciones> listaPrestacion) {
		boolean salir=false;
		while(!salir){
		try {
		Scanner sc = new Scanner(System.in);
		Medico medico1 = new Medico();
		int opcion;
		do {
			System.out.println("1)Registrar asistencia");
			System.out.println("2)Cargar estudio");
			System.out.println("3)Cargar receta");
			System.out.println("0)Volver atras");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				medico1.asistencia(listaArea, listapacientes, listaPrestacion);
				break;
			
			case 2:
				medico1.Cargarestudios(listapacientes);
				break;
				
			case 3:
				medico1.Cargarrecetas(listapacientes);
				break;
				
			case 4:
				System.out.println("Menu");
	
				
				
				
				
				
				
				
				
				
				
				
				
				break;
			
			}
		}while(opcion != 0);
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
	}
	
	static void menuClinico(ArrayList<Prestaciones> listaPrestacion) {
		boolean salir=false;
		while(!salir){
		try {
		Clinico clinico1 = new Clinico();
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("1)Generar reporte");
			System.out.println("2)Visualizar estudios");
			System.out.println("0)volver atras");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				clinico1.Generarreporte(listaPrestacion);
				break;
			
			case 2:
				clinico1.mostrarestudios(listaPrestacion);
				break;
				
			case 3:
				System.out.println("Menu");
				break;
			
			}
		}while(opcion != 0);
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
	}
		
}