package Individuos;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import funcional.Turno;

public class Paciente {

	private int idpaciente;
	private String nombre, apellido, domicilio, cobertura;
	private long dni;
	private ArrayList <Turno> turno;
	private ArrayList <String> rectas; 
	private ArrayList <String> estudios;
	public Paciente() {

		this.idpaciente = 0;
		this.nombre = null;
		this.apellido = null;
		this.domicilio = null;
		this.cobertura = null;
		this.dni = 0;
		this.turno=null;
		this.rectas=null;
		this.estudios=null;
	}
	
	
	public ArrayList<String> getRectas() {
		return rectas;
	}


	public void setRectas(String receta) {
		this.rectas.add(receta);
	}


	public ArrayList<String> getEstudios() {
		return estudios;
	}


	public void setEstudios(String receta) {
		this.estudios.add(receta);
	}


	public void Ingresarturnos( Turno turno )
	{
		
		this.turno.add(turno);
		 
		
	}

	private void ingreseidpaciente() {
		boolean salir=false;
		while(!salir){
		try {
			
		
		System.out.println("ingrese id del paciente");
		Scanner Ss = new Scanner(System.in);
		int dn1 = Ss.nextInt();
		this.idpaciente = dn1;
		salir=true;
		}
		
		catch(Exception e)
		{
			System.out.println("algo salio mal");
		}
		}
	}

	private void igresenombre() {

		boolean salir=false;
			while(!salir){
			try {
		System.out.println("ingrese nombre");
		Scanner Ss = new Scanner(System.in);
		String palabra = Ss.nextLine();
		this.nombre = palabra;
		salir=true;
			}

			catch(Exception e)
				{
					System.out.println("algo salio mal");
				}
				}
	}

	private void ingreseapellido() {

boolean salir=false;
		while(!salir){
		try {
		System.out.println("ingrese Apellido");
		Scanner Ss = new Scanner(System.in);
		String palabra = Ss.nextLine();
		this.apellido = palabra;
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
	}

	private void ingresdni() {
		boolean salir=false;
		while(!salir){
		try {
		System.out.println("ingrese dni");
		Scanner Ss = new Scanner(System.in);
		Long dn1 = Ss.nextLong();
		this.dni = dn1;
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}

	}

	private void ingresedomicilio() {
		boolean salir=false;
		while(!salir){
		try {
		System.out.println("ingrese domicilio");
		Scanner Ss = new Scanner(System.in);
		String palabra = Ss.nextLine();
		this.domicilio = palabra;
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
	}

	private void igresecobertura() {
		boolean salir=false;
		while(!salir){
		try {
		System.out.println("ingrese cobertura");
		Scanner Ss = new Scanner(System.in);
		String palabra = Ss.nextLine();
		this.cobertura = palabra;
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
	}

	public void registrarpaciente(ArrayList<Paciente> listapacientes) {
		Paciente paciente = new Paciente();

		paciente.ingreseidpaciente();
		// controlar y mejorar

		if (paciente.Buscarpaciente(paciente.idpaciente, listapacientes)) {

			System.out.println("El paciente ya existe");

		} else {

			paciente.igresenombre();
			paciente.ingreseapellido();
			paciente.ingresdni();
			paciente.igresecobertura();
			paciente.ingresedomicilio();

			listapacientes.add(paciente);
			System.out.println("paciente cargado con exito");

		}

	}

	public void mostrarpacientes(ArrayList<Paciente> listapacientes) {
		for (Paciente e : listapacientes) {
			System.out.println("_________________________________________________________");
			System.out.println("id: " + e.idpaciente);
			System.out.println("nombre: " + e.nombre);
			System.out.println("apellido: " + e.apellido);
			System.out.println("dni: " + e.dni);
			System.out.println("cobertura: " + e.cobertura);
			System.out.println("domicilio: " + e.domicilio);
			System.out.println("_________________________________________________________");
		}

	}

	

	public boolean Buscarpaciente(int id, ArrayList<Paciente> listapacientes) {
		for (Paciente e : listapacientes) {
			if (e.idpaciente == id) {
				return true;
			}

		}

		return false;
	}

	public Paciente Devolverpaciente(int id, ArrayList<Paciente> listapacientes) {
		for (Paciente e : listapacientes) {
			if (e.idpaciente == id) {
				return e;
			}
		}
		return null;

	}

	public void Bajapaciente(int id, ArrayList<Paciente> listapacientes) {
		Paciente paciente = new Paciente();

		if (Buscarpaciente(id, listapacientes)) {

			paciente = this.Devolverpaciente(id, listapacientes);

			listapacientes.remove(paciente);

		}

		else {
			System.out.println("El paciente que deseea remover no existe");
		}

	}

	public void Modificarpaciente(int id, ArrayList<Paciente> listapacientes) {

		Paciente paciente = new Paciente();

		if (Buscarpaciente(id, listapacientes)) {

			paciente = this.Devolverpaciente(id, listapacientes);

			listapacientes.remove(paciente);

			Scanner Sc = new Scanner(System.in);
			int opcion = 0;

			do {

				System.out.println("opcion 1: modificar cobertura");
				System.out.println("opcion 2: modificar nombre");
				System.out.println("opcion 3: modificar dni");
				System.out.println("opcion 4: modificar apellido");
				System.out.println("opcion 5: modificar domicilio");
				System.out.println("opcion 6: modificar idpaciente");
				System.out.println("0: para salir");
				opcion = Sc.nextInt();
				switch (opcion) {

				case 1:
					paciente.igresecobertura();
					break;
				case 2:
					paciente.igresenombre();
					break;
				case 3:
					paciente.ingresdni();
					break;
				case 4:
					paciente.ingreseapellido();
					break;
				case 5:
					paciente.ingresedomicilio();
					break;
				case 6:
					paciente.ingreseidpaciente();
					break;
				}
			} while (opcion != 0);

			listapacientes.add(paciente);

			System.out.println("paciente modificado con exito");

		}

		else {
			System.out.println("no existe, primero registre al paciente");
		}

	}
	public int getIdpaciente() {
		return idpaciente;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public long getDni() {
		return dni;
	}

	public ArrayList<Turno> getTurno() {
		return turno;
	}
	
	public void verturnos(int idpaciente, ArrayList<Paciente> listapacientes)
	{ 
		
		Paciente paciente1 = new Paciente();
		
		if(paciente1.Buscarpaciente(idpaciente, listapacientes))
		{
			paciente1= paciente1.Devolverpaciente(idpaciente, listapacientes);
			
			System.out.println("id: "+ paciente1.getIdpaciente());
			System.out.println("nombre: "+ paciente1.getNombre());
			System.out.println("apellido: "+paciente1.getApellido());
			
			for (Turno e : paciente1.getTurno()) 
				
				
			{
				System.out.println("_________________________________________________________");	  
				System.out.println("id turno: "+ e.getIdturno());
				//System.out.println("fecha: "+e.getFecha());	
				System.out.println("hora inicio: " +e.getHorainicio());
				System.out.println("hora fin"+e.getHoarafin());
				System.out.println("doctor que le atiende"+e.getDoctor());	
				System.out.println("_________________________________________________________");
				
				}
			
			
		}
		
		else
		{
			System.out.println("el paciente no existe");
		}
		
	}
	
}
