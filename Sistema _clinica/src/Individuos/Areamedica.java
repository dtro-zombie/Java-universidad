package Individuos;

import java.util.ArrayList;
import java.util.Scanner;

public class Areamedica {

	private String area;
	private ArrayList<Medico> medico;
	private Medico jefeArea;

	public Areamedica() {
		this.area = null;
		this.medico = null;
		this.jefeArea = null;
	}

	
	public void setMedico(ArrayList<Medico> medico) {
		this.medico = medico;
	}


	public String getArea() {
		return area;
	}

	public ArrayList<Medico> getMedico() {
		return medico;
	}

	public void ingresarjefe(ArrayList<Areamedica> listarea) {
		String Ingreso =null;
		long matricula=0;
		Scanner Ss = new Scanner(System.in);
		boolean salir=false;
		while(!salir){
		try {
		System.out.println("A que area pertenece?");
		
		Ingreso = Ss.nextLine();
		salir=true;
		}

		catch(Exception e)
			{
				System.out.println("Algo salio mal");
			}
			}
		for (Areamedica e : listarea) {
			if (e.area.equals(Ingreso)) {
				if (e.jefeArea == null) {
					salir=false;
					while(!salir){
					try {
					System.out.println("Ingrese matricula del jefe");
					 matricula = Ss.nextLong();
					salir=true;
					}

					catch(Exception e1)
						{
							System.out.println("Algo salio mal");
						}
						}
					if (e.Buscarmedico(matricula, e.medico)) {
						e.jefeArea = e.Devolvermedico(matricula, e.medico);

					}

					else {
						System.out.println("Medico no registrado");
					}

				} else {
					System.out.println("Jefe existente");
				}
			} else {
				System.out.println("El area no existe o verfique su nombre");
			}

		}

	}

	public boolean Buscarmedico(long matricula, ArrayList<Medico> listamedico) {
		for (Medico e : listamedico) {
			if (e.getMatricula() == matricula) {
				return true;
			}

		}

		return false;
	}

	public Medico Devolvermedico(long matricula, ArrayList<Medico> listamedico) {
		for (Medico e : listamedico) {

			if (e.getMatricula() == matricula) {
				return e;
			}
		}
		return null;
	}

	public void cargarmedico(ArrayList<Areamedica> areamedica) {

		Areamedica area = new Areamedica();
		ArrayList<Medico> listamedico = new ArrayList <Medico>();
		Medico medico = new Medico();
		

		Scanner Sc = new Scanner(System.in);
		boolean salir=false;
		while(!salir){
		try {
		System.out.println("ingrese area medica");
		String ingreso = Sc.nextLine();
boolean afirmar=false;
		for (Areamedica e : areamedica) {
			if (e.getArea().equals(ingreso)) {
				
				System.out.println("ingrese matricula");
				int matricula = Sc.nextInt();

				medico.Altamedico(matricula, e.getMedico());
				
				if(e.Buscarmedico(matricula, e.getMedico()))
				{
					System.out.println("es imposible agregar medico al area, ya existe!");
					
					
				}
				else
				{
				areamedica.remove(e);
				
				areamedica.add(e);
				}
				afirmar=true;
			}

		}
		
		if(afirmar==false)
		{
		System.out.println("no existe el area desea creaarla?");
		System.out.println("numero 1 para confirmar");
		int opcion = Sc.nextInt();
		if (opcion == 1) {
			area.area = ingreso;

			System.out.println("ingrese matricula");
			int matricula = Sc.nextInt();

			medico.Altamedico(matricula,listamedico );

			listamedico.add(medico);
			area.medico = listamedico;

			areamedica.add(area);
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
	
	public void mostramedicos(ArrayList<Areamedica> areamedica)
	{
		System.out.println("------------------------------------------");
		for(Areamedica e: areamedica)
		{
		System.out.println("area medica "+e.area);
	//	System.out.println("jefe ");
	//	e.jefeArea.mostrar();
		System.out.println("medicos del area");
		for(Medico i: e.medico)
		{
			i.mostrar();
		
		}
		
		}
		System.out.println("------------------------------------------");
	}

	public void eliminarmedico(ArrayList<Areamedica> areamedica) {
		
		boolean salir=false;
		while(!salir){
		try {
		Scanner Sc = new Scanner(System.in);
		System.out.println("ingrese area medica");
		String area = Sc.nextLine();
		System.out.println("ingrese la matricula del doctor");
		long matricula = Sc.nextLong();
		Medico medico = new Medico();

		for (Areamedica e : areamedica) {
			if (e.getArea().equals(area)) {
				if (e.Buscarmedico(matricula, e.medico)) {
					e.medico = medico.Bajamedico(matricula, e.medico);
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

	public void modificarmedico(ArrayList<Areamedica> areamedica) {
		boolean salir=false;
		while(!salir){
		try {

		Scanner Sc = new Scanner(System.in);
		System.out.println("ingrese area medica");
		String area = Sc.nextLine();
		System.out.println("ingrese la matricula del doctor");
		long matricula = Sc.nextLong();
		Medico medico = new Medico();

		for (Areamedica e : areamedica) {
			if (e.getArea().equals(area)) {
				if (e.Buscarmedico(matricula, e.getMedico())) {
					e.medico = medico.Modificacionmedico(matricula, e.getMedico());
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
		

}
