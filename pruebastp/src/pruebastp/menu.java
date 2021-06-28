package pruebastp;

import java.util.Calendar;
import java.util.GregorianCalendar;

import unpaz.ayp3.Consola;

public class menu {

	public static Trabajador agregar(int opcion) throws ExcepcionOperacionNoPermitida {
		boolean salir4=false;
		while(!salir4){
		try {
		boolean salir = false;
		Fecha fecha = null;
		long dni;
		int dia = 0, mes = 0, anio = 0;
		String nombre = null, apellido = null, TU = null, TP = null;
		TipoCargo cargo = null;
		double salario = 0;
		System.out.println("ingrese el dni");
		dni = Consola.pedirEntero();
		System.out.println("ingrese nombre");
		nombre = Consola.pedirTexto();
		System.out.println("ingrese apellido");
		apellido = Consola.pedirTexto();
		// hacer if con directivo o empleado
		System.out.println("ingrese fecha de ingreso");
		boolean salir3=false;
		
		Calendar fechas = new GregorianCalendar();
		
		do {
		
		System.out.println("dia");
		dia = Consola.pedirEntero();
		System.out.println("mes");
		mes = Consola.pedirEntero();
		System.out.println("año");
		anio = Consola.pedirEntero();
		
		if(dia<=31 && mes<=12 && anio<= fechas.get(Calendar.YEAR))
		{
			
			salir3=true;
			
		}
		
		}while(salir3!=true);
		
		if (opcion == 1) {

			System.out.println("1--- JEFES");
			System.out.println("2--- SUPERVISOR");
			System.out.println("3--- OPERARIO ");
			opcion = controlar(1, 3);

			switch (opcion) {

			case 1:

				cargo = TipoCargo.JEFES;

				break;

			case 2:
				cargo = TipoCargo.SUPERVISOR;
				break;

			case 3:
				cargo = TipoCargo.OPERARIO;
				break;
			}

		} else if (opcion == 2) {

			System.out.println("1--- DIRECTOR_GENERAL");
			System.out.println("2--- DIRECTOR_DEPARTAMENTO");
			opcion = controlar(1, 2);

			switch (opcion) {

			case 1:

				cargo = TipoCargo.DIRECTOR_GENERAL;

				break;

			case 2:
				cargo = TipoCargo.DIRECTOR_DEPARTAMENTO;
				break;
			}

		}

		while (!salir) {

			try {

				System.out.println("ingrese su salario");

				salario = Consola.pedirDecimal();
				salir = true;

			}

			catch (Exception e) {
				System.out.println("algo salio mal");
			}

		}

		Trabajador tra = new Trabajador(dni, nombre, apellido, cargo, salario, new Fecha(dia, mes, anio));

		System.out.println("ingrese titulo universitario");
		System.out.println("dejar vacio si no posee");
		TU = Consola.pedirTexto();
		
		tra.setTituloUniversitario(TU);
		
		if (tra.tieneTituloUniversitario() == true) {
			System.out.println("ingrese titulo posgrado");
			System.out.println("dejar vacio si no posee");

			TP = Consola.pedirTexto();

		}
		
		tra.setTituloPostgrado(TP);
		salir4=true;
		return tra;
		}
		
		catch(Exception e) {
			System.out.println("algo salio mal");
		}
	}
		
		return null;
		
	
	}

	public static int controlar(int empieza, int termina) {
		boolean salir = false;
		int opcion = 0;
		while (!salir) {
			try {
				do {

					System.out.println("ingrese un dato valido");
					opcion = Consola.pedirEntero();

				} while (opcion > termina || opcion < empieza);
				salir = true;

			} catch (Exception e) {
				System.out.println("error");
			}

		}
		return opcion;
	}

	public static void main(String[] args) throws ExcepcionOperacionNoPermitida {

		Empresa emp = new Empresa();
		Trabajador tra = new Trabajador(25, "nahuel", "arias", TipoCargo.DIRECTOR_DEPARTAMENTO, 15000,
				new Fecha(12, 1, 1998));

		emp.agregarDirectivo(tra);

		int opcion = 0;
		
		boolean salir = false;
		do {
			System.out.println("Menu Principal");
			System.out.println("1---Ingresar Trabajador");
			System.out.println(" ");
			System.out.println("2---Modificar Trabajador");
			System.out.println(" ");
			System.out.println("3---Quitar Trabajador");
			System.out.println("");
			System.out.println("4---Obtener Trabajador ");
			System.out.println("");
			System.out.println("5---Liquidar sueldos");
			System.out.println("");
			System.out.println("6---Monto a pagar");
			System.out.println("");
			System.out.println("7--opciones Trabajador");
			System.out.println("");
			System.out.println("0--- SALIR");

			opcion = controlar(0, 7);

			switch (opcion) {
			case 0:
				System.out.println("______________________________________");
				System.out.println("saliendo");
				salir = true;
				System.out.println("______________________________________");

				break;
			case 1:

				do {
					System.out.println("Menu Principal//Ingresar Trabajador");
					System.out.println();
					System.out.println("1---Nuevo Empleado");
					System.out.println("");
					System.out.println("2---Nuevo director");
					System.out.println("");
					System.out.println("0---Para volver atras");

					opcion = controlar(0, 2);

					switch (opcion) {

					case 1:

						emp.agregarEmpleado(agregar(opcion));

						break;
					case 2:

						emp.agregarDirectivo(agregar(opcion));

						break;
					case 0:
						System.out.println("saliendo...");

						break;
					}

				} while (opcion != 0);

				break;

			case 2:
				System.out.println("opcion 2");
				// Modificar trabajador
				do {
					System.out.println("Menu Principal//Modificar trabajador");
					System.out.println();
					System.out.println("1---modificar Empleado");
					System.out.println("");
					System.out.println("2---modificar director");
					System.out.println("");
					System.out.println("0---Para volver atras");

					opcion = controlar(0, 2);

					switch (opcion) {

					case 1:

						emp.ModificarEmpleado(agregar(opcion));

						break;
					case 2:

						emp.ModificarEmpleado(agregar(opcion));

						break;
					case 0:
						System.out.println("saliendo...");

						break;
					}

				} while (opcion != 0);
				
				opcion=1;

				break;

			case 3:
				System.out.println("opcion 3");
				// quitar trabajador

				do {
					System.out.println("1---quitar empleado");
					System.out.println("2---quitar directivo");
					System.out.println("0---salir");
					opcion = controlar(0, 2);

					// switch case para que elimine

					switch (opcion) {

					case 1:
						salir = false;

						do {
							try {
								System.out.println("cero para volver al menu anterior");
								System.out.println("");

								System.out.println("ingrese el dni del trabajador a borrar");
								int dni = Consola.pedirEntero();

								if (dni == 0) {
									salir = true;
								}

								if (emp.obtenerTrabajador(dni) == null) {
									System.out.println("el directivo no existe, pofavor vuelva a intentarlo");

								}

								if (emp.obtenerTrabajador(dni).esEmpleado() == true) {

									salir = true;
									System.out.println("empleado quitado, con exito");
									emp.quitarEmpleado(dni);

								}

								if (emp.obtenerTrabajador(dni).esEmpleado() == false) {

									System.out.println("este no es un emplado");
									salir = true;
								}

							} catch (Exception e) {
								System.out.println("algo salio mal");
							}

						} while (!salir);

						break;

					case 2:
						salir = false;

						do {
							try {
								System.out.println("cero para volver al menu anterior");
								System.out.println("");

								System.out.println("ingrese el dni del trabajador a borrar");
								int dni = Consola.pedirEntero();

								if (dni == 0) {
									salir = true;
								}

								if (emp.obtenerTrabajador(dni) == null) {
									System.out.println("el directivo no existe, pofavor vuelva a intentarlo");

								}

								if (emp.obtenerTrabajador(dni).esDirectivo() == true) {

									emp.quitarEmpleado(dni);
									System.out.println("directivo quitado, con exito");
									salir = true;

								}

								if (emp.obtenerTrabajador(dni).esDirectivo() == false) {

									System.out.println("este no es un emplado");
									salir = true;
								}

							} catch (Exception e) {
								System.out.println("algo salio mal");
							}

						} while (!salir);
						break;

					case 0:
						System.out.println("saliendo");
						salir = false;
						break;

					}
				} while (opcion != 0);

				break;

			case 4:
				System.out.println("opcion 4");

				// Obtener trabajador
				System.out.println();
				System.out.println("ingrese dni para buscar trabajador");
				long dni = Consola.pedirEntero();
				System.out.println();

				if (emp.obtenerTrabajador(dni) == null) {
					System.out.println("el trabajador con el dni " + dni + " no existe");
				}

				else {
					emp.obtenerTrabajador(dni).imprimirtra();
				}

				break;

			case 5:
				// liquidar sueldos
				System.out.println("______________________________________");
				emp.liquidarSueldos();
				System.out.println("______________________________________");
				System.out.println();
				break;

			case 6:
				System.out.println("______________________________________");
				System.out.println("Monto a pagar: " + emp.obtenerMontoTotalAPagar());
				System.out.println("______________________________________");
				break;

			case 7:

				
				do {
				System.out.println("1--obtener Trabajador Salario Minimo");
				System.out.println("");
				System.out.println("2---obtener Trabajador Salario Maximo");
				System.out.println("");
				System.out.println("3---obtener Promedio Salarios");
				System.out.println("");
				System.out.println("4---obtener Trabajador Mas Antiguo");
				System.out.println("");
				System.out.println("5--obtener Trabajador MasReciente");
				System.out.println("");
				System.out.println("0--salir");

				
					opcion = controlar(0, 5);

					switch (opcion) {

					case 1:
						System.out.println("______________________________________");
						System.out.println("salario minimo");
						emp.obtenerTrabajadorSalarioMinimo().imprimirtra();
						System.out.println("______________________________________");
						break;
					case 2:
						System.out.println("______________________________________");
						System.out.println("salario maximo");
						emp.obtenerTrabajadorSalarioMaximo().imprimirtra();
						System.out.println("______________________________________");
						break;
					case 3:
						System.out.println("______________________________________");
						System.out.println("promedio de salarios: " + emp.obtenerPromedioSalarios());
						System.out.println("______________________________________");
						break;
					case 4:
						System.out.println("______________________________________");
						System.out.println("Trabajador mas antiguo");
						emp.obtenerTrabajadorMasAntiguo().imprimirtra();
						System.out.println("______________________________________");
						break;
					case 5:
						System.out.println("______________________________________");
						System.out.println("Trabajador mas reciente");
						emp.obtenerTrabajadorMasReciente().imprimirtra();
						System.out.println("______________________________________");
						break;
					case 0:
						System.out.println("salir1");
						break;
				
					
				
				
					
					
					
					}
				} while (opcion != 0);
				
			
			}
		} while (!salir);

	}
}
