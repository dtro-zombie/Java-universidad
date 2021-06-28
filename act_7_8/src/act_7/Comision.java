package act_7;

import java.util.LinkedList;

public class Comision {
	private String materia;
	private int numero;
	private Docente[] docentes;
	private Estudiante[] inscriptos;
	private int[] calificaciones;

	Comision(String materia, int numero, Docente[] docentes, Estudiante[] inscriptos, int[] calificaciones) {
		this.materia = materia;
		this.numero = numero;
		this.docentes = docentes;
		this.inscriptos = inscriptos;
		this.calificaciones = calificaciones;

	}

	public boolean cursaCon(Estudiante alumno, Docente profesor) {
		// inicio for para recorrer profesores

		for (int j = 0; j < docentes.length; j++) {

			// inicio for para recorrer inscriptos
			for (int i = 0; i < inscriptos.length; i++) {
				// busco que sean iguales para confirmar que esnten juntos

				if (profesor.equals(docentes[j]) && alumno.equals(inscriptos[i])) {
					return true;
				}

			}

		}

		return false;
	}

	boolean suficientesDocentes() {

		// multiplico la cantidad de docentes por la cantidad que se puede hacer cargo
		// cada uno
		// pregunto si en numero es menor o igual que la cantidad de alumnos
		// asi se si hay suficientes doscentes
		// si es mayor la cantidad de alumno esto no se cumple
		if (docentes.length * 20 >= inscriptos.length) {
			return true;
		}

		return false;
	}

	LinkedList<Estudiante> losMejores() {

		LinkedList<Estudiante> miestudiante = new LinkedList<>();

		int mejornota = 0;

		for (int i = 0; i < calificaciones.length; i++) {

			if (calificaciones[i] >= mejornota) {
				mejornota = calificaciones[i];
			}

		}

		for (int i = 0; i < calificaciones.length; i++) {
			if (calificaciones[i] >= mejornota) {
				miestudiante.add(inscriptos[i]);
			}
		}

		return miestudiante;

	}

	LinkedList<Estudiante> alumnosDe(Docente d) {

		LinkedList<Estudiante> cursacon = new LinkedList<>();

		for (int i = 0; i < inscriptos.length; i++) {

			if (cursaCon(inscriptos[i], d)) {
				if (!cursacon.contains(inscriptos[i])) {
					cursacon.add(inscriptos[i]);
				}

			}

		}

		return cursacon;
	}

	Estudiante elMasEstudioso() {

		Estudiante miEstudiante = null;

		int cant_de_cursos = 0;

		for (int j = 0; j < calificaciones.length; j++) {

			if (calificaciones[j] >= 4) {

				cant_de_cursos++;

				miEstudiante = inscriptos[j];

			}

		}

		return miEstudiante;

	}

	LinkedList<String> unicaComision() {
		LinkedList<String> unica = new LinkedList<>();

		if (!unica.contains(materia)) {
			unica.add(materia);
		}

		return unica;
	}
}
