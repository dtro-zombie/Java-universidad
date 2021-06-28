package act_8;

import java.util.LinkedList;

public class Aerolinea {

	Vuelo[] vuelos;

	Aerolinea(Vuelo[] vuelo) {
		this.vuelos = vuelo;
	}
	/*
	 * a) Escribir un método int vuelosEn(Tripulante t, String tipoAvion) que recibe
	 * un tripulante t y un tipo de avión e indica cuantos vuelos realizó t en
	 * aviones del tipo dado.
	 */

	int vuelosEn(Tripulante t, String tipoAvion) {
		int cont = 0;

		for (int i = 0; i < vuelos.length; i++) {

			for (int j = 0; j < vuelos[i].tripulacion.length; j++) {

				if (t.nombre == vuelos[i].tripulacion[j].nombre && vuelos[i].avion.tipo == tipoAvion) {
					cont++;
				}

			}

		}
		return cont;
	}
	/*
	 * b) Escribir un método int antiguedadPromedio(String tipoAvion) que recibe un
	 * tipo de avión y calcula el promedio de las antigüedades de los tripulantes en
	 * vuelos en aviones del tipo dado.
	 */

	int antiguedadPromedio(String tipoAvion) {

		int j = 0, suma = 0, cont = 0;

		for (int i = 0; i < vuelos.length; i++) {

			if (vuelos[i].avion.tipo.equals(tipoAvion)) {

				for (j = 0; j < vuelos[i].tripulacion.length; j++) {
					cont++;
					suma += vuelos[i].tripulacion[j].antiguedad;

				}
			}

		}

		return suma / cont;
	}

	/*
	 * c) Escribir un método LinkedList<Vuelo> vuelosSobrecargados() que devuelve
	 * una lista con los vuelos en los que la cantidad de tripulantes con cargo de
	 * “Aeromozo” supere el 10% de la capacidad del avión.
	 */

	LinkedList<Vuelo> vuelosSobrecargados() {

		LinkedList<Vuelo> Vuelocargado = new LinkedList<>();

		for (int i = 0; i < vuelos.length; i++) {

			for (Vuelo e : vuelos[i].vuelosSobrecargados()) {

				Vuelocargado.add(e);

			}

		}

		return Vuelocargado;

	}

	/*
	 * d) Escribir un método String masInspeccionado() que devuelve el tipo de avión
	 * en el que se hayan transportado más tripulantes con cargo de “Inspector”. En
	 * caso de haber más de un tripulante con la misma cantidad de vuelos, puede
	 * devolver cualquiera de ellos.
	 */
	String masInspeccionado() {

		String tipoavion = null;
		int cont = 0, mayor = 0;
		for (int i = 0; i < vuelos.length; i++) {
			for (int j = 0; j < vuelos[i].tripulacion.length; j++) {

				if (vuelos[i].tripulacion[j].cargo == "inspector") {
					cont++;
				}

			}

			if (cont > mayor) {
				tipoavion = vuelos[i].avion.tipo;
			}

		}

		return tipoavion;

	}

	/*
	 * e) Escribir un método LinkedList<String> avionesPiloteadosPor(String nombre)
	 * que recibe el nombre de un tripulante y devuelve una lista con los tipos de
	 * avión piloteados alguna vez por el tripulante dado. Se considera que un
	 * tripulante piloteó un avión sólo si su cargo en dicho vuelo fue el de
	 * “Piloto”. La lista resultado no deberá tener tipos de avión repetidos.
	 */

	LinkedList<String> avionesPiloteadosPor(String nombre) {
		LinkedList<String> avionesPiloteadosPor = new LinkedList<>();

		for (int i = 0; i < vuelos.length; i++) {

			for (String e : vuelos[i].avionesPiloteadosPor(nombre)) {

				avionesPiloteadosPor.add(e);

			}

		}

		return avionesPiloteadosPor;

	}

	/*
	 * f) Escribir un método Tripulante empleadoDelMes() que devuelve el tripulante
	 * que mayor cantidad de vuelos haya realizado. En caso de haber más de un
	 * tripulante con la misma cantidad de vuelos, puede devolver cualquiera de
	 * ellos.
	 */
	Tripulante empleadoDelMes() {
		Tripulante tripulacion = null;
		int cont = 0, mayor = 0;
		for (int i = 0; i < vuelos.length; i++) {

			for (int j = 0; j < vuelos[i].tripulacion.length; j++) {
				cont=contar(vuelos[i].tripulacion[j].nombre);

				if (cont > mayor) {
					tripulacion = vuelos[i].tripulacion[j];
				}
			}

		}

		return tripulacion;

	}

	int contar(String nombre) {
		int cont = 0;

		for (int i = 0; i < vuelos.length; i++) {

			for (int j = 0; j < vuelos[i].tripulacion.length; j++) {
				
				
				if(nombre==vuelos[i].tripulacion[j].nombre)
				{
					cont++;
				}
			}

		}
		return cont;
	}
}
