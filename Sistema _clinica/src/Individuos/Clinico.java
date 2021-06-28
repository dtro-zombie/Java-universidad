package Individuos;

import java.util.ArrayList;

import funcional.Prestaciones;
import funcional.Turno;

public class Clinico extends Medico {

	public void Generarreporte(ArrayList<Prestaciones> listaprestacion) {
		Medico medico = new Medico();
		Turno turno = new Turno();

		for (Prestaciones e : listaprestacion) {

			medico = e.getMedico();
			turno = e.getTurno();
			System.out.println("________________");
			System.out.println("Medico");
			medico.mostrar();
			System.out.println("________________");
			System.out.println("Turno ya atendido");
			turno.mostrar();
			System.out.println("________________");

		}

	}
	
	public void mostrarestudios(ArrayList<Prestaciones> listaprestacion) 
	{
		
		Medico medico = new Medico();
		Turno turno = new Turno();

		
	
		
		for (Prestaciones e : listaprestacion) {
			
			if(e.getTurno().getConsultorio().getNombre()=="laboratorio")
			{
			medico = e.getMedico();
			turno = e.getTurno();
			System.out.println("________________");
			System.out.println("Medico");
			medico.mostrar();
			System.out.println("________________");
			System.out.println("Turno Laboratorio");
			turno.mostrar();
			System.out.println("________________");
			}
		}

		
	}

}
