package act_7;

import java.util.LinkedList;




public class UNPAZ {

	Comision[] comisiones;

	UNPAZ(Comision[] comisiones) {
		
		this.comisiones=comisiones;

	}

	boolean cursaCon(Estudiante alumno, Docente profesor) {
		// recorro las comsines
		for (int i = 0; i < this.comisiones.length; i++) {
			// llamo a la funcion cursacon de comisiones para poder buscarlo ahi.

			// espero de esa funcion una repuesta negativa o positiva
			if (comisiones[i].cursaCon(alumno, profesor)) {

				return true;
			}

			

		}

		return false;

	}

	boolean suficientesDocentes() {

		// recorro las comisiones
		for (int i = 0; i < this.comisiones.length; i++) {
			if (comisiones[i].suficientesDocentes()) {
				return true;
			}

		}

		return false;

	}

	LinkedList<Estudiante> losMejores() {

		LinkedList<Estudiante> misestudiantes = new LinkedList<>();
		

		for (int i = 0; i < comisiones.length; i++) {

			for(Estudiante e: comisiones[i].losMejores()){
				
				misestudiantes.add(e);

			}
		}
		return misestudiantes;

		

	}

	LinkedList<Estudiante> alumnosDe(Docente d) {
	
		//creo una lista para retornar
		LinkedList<Estudiante> cursacon = new LinkedList<>();
		
		//recorro las comisiones
		for(int i=0;i<comisiones.length;i++)
		{
			// un for each que me recorre el conjunto de objetos
			//dentro de comision o asi entendi
			// llamo a la funcion de alumnos en la clase comision
			for(Estudiante e: comisiones[i].alumnosDe(d) )
			{
				//agreo a mi lista que declare mas arriba
				cursacon.add(e);
			}
		}
	
		
		return cursacon;

	}

	LinkedList<String> unicaComision() {
		
	LinkedList<String> unica = new LinkedList<>();
		
		
		for(int i=0;i<comisiones.length;i++)
		{
		for(String e: comisiones[i].unicaComision() )
		{
			
			unica.add(e);
		}
		
		}
		return unica;

	}

	Estudiante elMasEstudioso() {
		Estudiante miEstudiante = null;
		
		
		
		for(int i=0; i< comisiones.length;i++)
		{
			miEstudiante=comisiones[i].elMasEstudioso();
		}
		return miEstudiante;

	}

}
