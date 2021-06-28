package funcional;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import Individuos.Areamedica;
import Individuos.Medico;
import Individuos.Paciente;

public class Turno {
	private int idturno, horainicio, hoarafin;
	private Fecha fecha;
	private Medico doctor;
	private boolean asistio;
	private String area;
	private Consultorios consultorio;

	public Turno() {

		this.idturno = idturno;
		this.horainicio = horainicio;
		this.hoarafin = hoarafin;
		this.fecha = fecha;
		this.doctor = null;
		this.asistio = false;
		this.area = null;
	}
	
	
	
	public Consultorios getConsultorio() {
		return consultorio;
	}


	public void setConsultorio(Consultorios consultorio) {
		this.consultorio = consultorio;
	}


	public void mostrar()
	{
		Fecha fecham= new Fecha();
		Consultorios consultorio = new Consultorios();
		System.out.println("id turno "+idturno);
		System.out.println("hora de inicio "+horainicio);
		System.out.println("hora de fin"+hoarafin);
		fecham.mostrar();
		System.out.println("area: "+area);
		consultorio.mostrar();
		
	}

	public void setAsistio(boolean asistio) {
		this.asistio = asistio;
	}



	public int getIdturno() {
		return idturno;
	}

	public int getHorainicio() {
		return horainicio;
	}

	public int getHoarafin() {
		return hoarafin;
	}

	public Medico getDoctor() {
		return doctor;
	}

	public boolean isAsistio() {
		return asistio;
	}

	private void ingresarconsultorio() {
		Scanner Ss = new Scanner(System.in);

		boolean salir=false;
		while(!salir){
		try {
		System.out.println("ingrese consultorio");
		System.out.println("1 para laboratorio");
		System.out.println("2 para tradicional");
		int afirmar = Ss.nextInt();

		
			

			if(afirmar==1)
			{
				System.out.println("ingrese id laboratorio");
				int idlaboratorio = Ss.nextInt();

				Consultorios con = new Laboratorio(idlaboratorio,"laboratorio");
				
				this.consultorio = con;
				System.out.println("laboratorio asignado con exito");
			
			}

			if(afirmar==2) {
				System.out.println("ingrese id tradicional");
				int idtradicional = Ss.nextInt();

				Consultorios con2 = new Tradicional(idtradicional,"tradicional");
				this.consultorio = con2;
				System.out.println("laboratorio asignado con exito");
				
			}

		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
		

	}

	private void ingresarfecha() {
		boolean salir=false;
		while(!salir){
		try {
		Fecha fecha = new Fecha();

		Scanner Ss = new Scanner(System.in);

		do {
			System.out.println("ingrese dia");
			int Ingreso = Ss.nextInt();
			fecha.setDia(Ingreso);

			System.out.println("ingrese mes");
			Ingreso = Ss.nextInt();
			fecha.setMes(Ingreso);

			System.out.println("ingrese anio");
			Ingreso = Ss.nextInt();
			fecha.setAnio(Ingreso);

		} while (fecha.controlarfecha()!=false);

		this.fecha = fecha;
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}

	}

	private void Ingresaridturno() {
		boolean salir=false;
		while(!salir){
		try {
		System.out.println("ingrese id del turno");
		Scanner Ss = new Scanner(System.in);
		int Ingreso = Ss.nextInt();
		this.idturno = Ingreso;
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
	}

	private void ingresarhoradeiniciofin() {
		boolean salir=false;
		while(!salir){
		try {

		System.out.println("hora de inicio");
		Scanner Ss = new Scanner(System.in);
		int Ingreso = Ss.nextInt();
		this.horainicio = Ingreso;

		System.out.println("hora de fin");
		Ingreso = Ss.nextInt();
		this.hoarafin = Ingreso;
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}

	}

	private void ingresarmedico(ArrayList<Areamedica> listaarea)

	{
		boolean salir=false;
		while(!salir){
		try {
		Scanner Ss = new Scanner(System.in);
		System.out.println("ingrese area medica");
		String Ingreso = Ss.nextLine();

		System.out.println("ingrese matricula del medico");
		int matricula = Ss.nextInt();

		for (Areamedica e : listaarea) {

			if (e.getArea() == Ingreso) {
				this.area = Ingreso;

				if (e.Buscarmedico(matricula, e.getMedico())) {
					this.doctor = e.Devolvermedico(matricula, e.getMedico());

				}

			}

		}
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}

	}

	public void Altaturno(ArrayList<Paciente> listapaciente, ArrayList<Areamedica> listaarea) {
		
		Paciente paciente1 = new Paciente();
		Turno turno = new Turno();

		System.out.println("igrese el id del paciente que quiere un turno");
		Scanner Sc = new Scanner(System.in);
		int idpaciente = Sc.nextInt();

		if (paciente1.Buscarpaciente(idpaciente, listapaciente)) {

			paciente1 = paciente1.Devolverpaciente(idpaciente, listapaciente);

			//listapaciente.remove(paciente1);

			// aca pasa toda la carga
			turno.Ingresaridturno();
			turno.ingresarfecha();
			turno.ingresarhoradeiniciofin();
			turno.ingresarmedico(listaarea);
			//turno.ingresarconsultorio();

			paciente1.Ingresarturnos(turno);

			listapaciente.add(paciente1);

			System.out.println("Turno generado");
		} else {
			System.out.println("Al paciente que le quiere generar un turno, �no existe!");
		}
		
	}

	public void Bajaturno(int idturno, int idpaciente, ArrayList<Paciente> listapacientes) {
		boolean salir=false;
		while(!salir){
		try {
		Turno turno = new Turno();
		Paciente paciente = new Paciente();

		paciente = paciente.Devolverpaciente(idpaciente, listapacientes);

		if (Buscarturno(idturno, idpaciente, listapacientes)) {

			turno = this.Obtenerturno(idturno, idpaciente, listapacientes);

			listapacientes.remove(paciente);

			paciente.getTurno().remove(turno);

			listapacientes.add(paciente);

		}

		else {
			System.out.println("El paciente que deseea remover no existe");
		}
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}

	}

	public void Modificarturno(int idturno, int idpaciente, ArrayList<Paciente> listapacientes,
			ArrayList<Areamedica> listaarea) {
		boolean salir=false;
		while(!salir){
		try {


		Paciente paciente = new Paciente();
		Turno turno = new Turno();

		if (Buscarturno(idturno, idpaciente, listapacientes)) {

			turno = this.Obtenerturno(idturno, idpaciente, listapacientes);
			paciente = paciente.Devolverpaciente(idpaciente, listapacientes);

			listapacientes.remove(paciente);
			paciente.getTurno().remove(turno);

			Scanner Sc = new Scanner(System.in);
			int opcion = 0;

			do {

				System.out.println("opcion 1: modificar id de turno");

				opcion = Sc.nextInt();
				switch (opcion) {

				case 1:
					turno.Ingresaridturno();
					break;
				case 2:
					turno.Ingresaridturno();
					break;
				case 3:
					turno.ingresarfecha();
					break;
				case 4:
					turno.ingresarhoradeiniciofin();
					break;
				case 5:
					turno.ingresarmedico(listaarea);
					break;
				case 6:
					turno.ingresarconsultorio();
					break;

				}

			} while (opcion != 0);

			paciente.Ingresarturnos(turno);
			listapacientes.add(paciente);

			System.out.println("turno modificado con exito");

		}

		else {
			System.out.println("no existe, primero registre al paciente o el turno");
		}
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("algo salio mal");
			}
			}
	}

	public Turno Obtenerturno(int idturno, int idpaciente, ArrayList<Paciente> listapacientes) {
		for (Paciente e : listapacientes) {
			if (e.getIdpaciente() == idpaciente) {
				for (Turno t : e.getTurno()) {
					if (t.idturno == idturno) {
						return t;
					}
				}
			}

		}
		return null;
	}

	public boolean Buscarturno(int idturno, int idpaciente, ArrayList<Paciente> listapacientes) {

		for (Paciente e : listapacientes) {
			if (e.getIdpaciente() == idpaciente) {
				for (Turno t : e.getTurno()) {
					if (t.idturno == idturno) {
						return true;
					}
				}
			}

		}

		return false;

	}

}