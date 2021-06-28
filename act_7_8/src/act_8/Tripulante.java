package act_8;

public class Tripulante {
	
	String nombre;
	String cargo; // ej: “Piloto”', “Copiloto”, “Aeromozo”, etc.
	int antiguedad;
	
	
	Tripulante(String nombre,String cargo, int antiguedad)
	{
		this.antiguedad=antiguedad;
		this.cargo=cargo;
		this.nombre=nombre;
		
		
	}
	
	public String toString()
	{
		return nombre;
	}
	

}
