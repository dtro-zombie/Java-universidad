package funcional;

public class Consultorios {

	protected String nombre;
	protected int idconsultorio;

	public Consultorios() 
	{
		this.idconsultorio = idconsultorio;
	}
	
	public void mostrar()
	{
		System.out.println(this.idconsultorio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdconsultorio() {
		return idconsultorio;
	}

	public void setIdconsultorio(int idconsultorio) {
		this.idconsultorio = idconsultorio;
	}
	
	
}
