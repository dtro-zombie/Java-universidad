package act_7;

import java.util.LinkedList;



public class main {

	public static void main(String[] args) {

		
		
		
		//Comision 1
		Estudiante miEstudiante1 = new Estudiante("Pablo Lopez",1);
		Estudiante miEstudiante2 = new Estudiante("Pablo Perez", 2);
		Estudiante miEstudiante3 = new Estudiante("John Doe", 3);
		Estudiante miEstudiante4 = new Estudiante("Lisa Wong", 4);
		
		//comision 2
		Estudiante miEstudiante5 = new Estudiante("Juan Bilardo", 5);
		Estudiante miEstudiante6 = new Estudiante("Leonel Messi", 6);
		Estudiante miEstudiante7 = new Estudiante("Angel Gallardo", 7);
		Estudiante miEstudiante8 = new Estudiante("Lisa Steps", 8);
		
		//comision 3
		Estudiante miEstudiante9 = new Estudiante("Pedro Navaja", 9);
		Estudiante miEstudiante10 = new Estudiante("Rafaela Messi", 10);
		Estudiante miEstudiante11 = new Estudiante("Luis Katz", 11);
		Estudiante miEstudiante12 = new Estudiante("Beatrix Kiddo", 12);
		
		//Docentes
		Docente miDocente1 = new Docente("Matias Martin", 30245112);
		Docente miDocente2 = new Docente("Matias Zapata", 30245133);
		Docente miDocente3 = new Docente("Ernesto Guevara", 30245442);
		Docente miDocente4 = new Docente("San Martin", 30555112);
		Docente miDocente5 = new Docente("Natalia Polola", 60245112);
		Docente miDocente6 = new Docente("Julieta Diaz", 50245112);
		Docente miDocente7 = new Docente("Luciana Salazar", 45245112);
		
		//arrays
		
		Docente[] arrayDocentes1 = {miDocente1, miDocente2};
		Docente[] arrayDocentes2 = {miDocente3, miDocente4};
		Docente[] arrayDocentes3 = {miDocente5, miDocente6, miDocente7};
		//Docente[] arrayDocentes3 ={};// para probar el punto B
		
		Estudiante[] arrayEstudiantes1 = {miEstudiante1, miEstudiante2, miEstudiante3, miEstudiante4,miEstudiante8};
		Estudiante[] arrayEstudiantes2 = {miEstudiante5, miEstudiante6, miEstudiante7, miEstudiante8};
		Estudiante[] arrayEstudiantes3 = {miEstudiante9, miEstudiante10, miEstudiante11, miEstudiante12, miEstudiante8};
		
		int[] calificaciones1 = {4, 7, 7,10, 10};
		int[] calificaciones2 = {3, 7,7, 9};
		int[] calificaciones3 = {4,4,9,10, 10};
		
		//Comisiones
		Comision comision13 = new Comision("Poo", 1, arrayDocentes1, arrayEstudiantes1, calificaciones1);
		Comision comision1 = new Comision("Poo", 1, arrayDocentes1, arrayEstudiantes1, calificaciones1);
		Comision comision2 = new Comision("Matemática discreta", 2, arrayDocentes2, arrayEstudiantes2, calificaciones2);
		Comision comision3 = new Comision("Paradigmas de la computación", 3, arrayDocentes3, arrayEstudiantes3, calificaciones3);
		Comision comision4 = new Comision("Poo", 50, arrayDocentes2, arrayEstudiantes3, calificaciones3);//Para probar punto E
		//System.out.println("comision3 cant de docentes: "+comision3.docentes.length);
		
		Comision [] arrayComisiones = {comision1, comision2, comision3, comision4};
		
		UNPAZ miUniversidad = new UNPAZ(arrayComisiones);
		
		/*Respuestas**************************************************/
		
		System.out.println("Punto A:*************************************");
		//a) cursa con
		System.out.println("Si "+miEstudiante1.toString()+" cursa con: "+miDocente1.toString()+":"+miUniversidad.cursaCon(miEstudiante1, miDocente1));
		System.out.println("Si "+miEstudiante5.toString()+" cursa con: "+miDocente1.toString()+":"+miUniversidad.cursaCon(miEstudiante5, miDocente1));
		
		System.out.println("Punto B:*************************************");
		/*b) Escribir un método boolean suficientesDocentes() que indica si todas las comisiones 
		 * tienen al menos un docente por cada 20 inscriptos*/
		System.out.println("Si todas las comisiones tienen suficientes docentes: " +miUniversidad.suficientesDocentes());

		System.out.println("Punto C:*************************************");
		/*c) Escribir un método LinkedList<Estudiante> losMejores() que devuelve una lista con
		los estudiantes que obtuvieron la mejor nota en cada comisión. Si en algún curso hay
		más de un estudiante con la mejor nota, se deben incluir en la lista a todos ellos*/
		
		LinkedList<Estudiante> losMejores = miUniversidad.losMejores();
		
		System.out.println("Los mejores estudiantes: ");
		for(Estudiante e: losMejores){
			
			
			System.out.println(e);
		}
		
		System.out.println("Punto D:*************************************");
		/*d) Escribir un método LinkedList<Estudiante> alumnosDe(Docente d) que devuelve una
		lista con todos los alumnos del docente dado, es decir, con todos los estudiantes que
		cursen una comisión que dicte el docente. La lista devuelta no debe tener estudiantes
		repetidos*/
		
		LinkedList<Estudiante> losAlumnosDe = miUniversidad.alumnosDe(miDocente1);
		
		System.out.println("Alumno de  "+miDocente1.toString());
		for(Estudiante e: losAlumnosDe){
			
			
			System.out.println(e.toString());
			
		}
		
		
		System.out.println("Punto E:*************************************");
		/*e) Escribir un método LinkedList<String> unicaComision() que devuelve una lista con los
		nombres de todas las materias que tienen una única comisión. La lista devuelta no debe
		tener materias repetidas*/
		LinkedList<String> listaUnicaComision = miUniversidad.unicaComision();
		System.out.println("Materias que tienen una única comisión:");

		for(String s: listaUnicaComision){
			
			System.out.println("Materia: " +s);
		}
		
		System.out.println("Punto F:*************************************");
		/*f) Escribir un método Estudiante elMasEstudioso() que devuelve el estudiante que haya
		aprobado la mayor cantidad de cursos (consideramos que para aprobar un curso se
		requiere una calificación de al menos 4). En caso de haber más de un estudiante con la
		mayor cantidad de cursos aprobados se puede devolver cualquiera de ellos.*/
		
		Estudiante elMasEstudioso = miUniversidad.elMasEstudioso();
		System.out.println("El estudiante que aprobó más materias: "+elMasEstudioso.toString());
		
		System.out.println("@");
		
	}
}