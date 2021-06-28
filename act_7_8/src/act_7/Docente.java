package act_7;

public class Docente {
	String nombre;
	int dni;
	public Docente(String nombre,int dni) {
		this.nombre=nombre;
		this.dni=dni;
	}
	public String toString() {
		return "Docente [nombre=" + nombre + ", dni=" + dni+ "]";
	}
}
