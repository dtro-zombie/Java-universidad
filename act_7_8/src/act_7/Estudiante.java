package act_7;

public class Estudiante {
	
	private String nombre;
	private int legajo;

	Estudiante(String nombre,int legajo) {
		
		this.nombre=nombre;
		this.legajo=legajo;
		
		
	}
	
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", legajo=" + legajo + "]";
	}
	
	

}
