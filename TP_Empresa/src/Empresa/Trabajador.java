package Empresa;



public class Trabajador implements ITrabajador {

	private long dni;
	private String nombre;
	private String apellido;
	private Fecha FechaIngreso;
    private TipoCargo cargo;
	private Trabajador siguiente;
	private long salario;
	private long premio;
	private long antiguedad;
	private String TituloUniversitario;
	private String TituloPostgrado;
	
	
	 Trabajador(long dni1, String nombre1, String apellido1)
	{
		
		this.dni=dni1;
		this.nombre=nombre1;
		this.apellido=apellido1;
		this.siguiente=null;
		this.TituloPostgrado=null;
		this.TituloUniversitario=null;
		
		
	}



	public long getDni() {
		return dni;
	}



	public void setDni(long dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public Fecha getFechaIngreso() {
		return FechaIngreso;
	}



	public void setFechaIngreso(Fecha fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}



	public TipoCargo getCargo() {
		return cargo;
	}



	public void setCargo(TipoCargo cargo) {
		this.cargo = cargo;
	}



	public Trabajador getSiguiente() {
		return siguiente;
	}



	public void setSiguiente(ITrabajador trabajador) {
		this.siguiente = (Trabajador) trabajador;
	}



	@Override
	public void imprimirtra() {
		
		
		System.out.print(this.getNombre() + " ");
		
		
		
		
		System.out.println("");
		
	}



	@Override
	public boolean esEmpleado() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean esDirectivo() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public int getMesesAntiguedad() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void setTituloUniversitario(String titulo) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String getTituloUniversitario() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean tieneTituloUniversitario() {
		
		return false;
	}



	@Override
	public void setTituloPostgrado(String titulo) throws ExcepcionOperacionNoPermitida {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String getTituloPostgrado() {
		
		return this.TituloPostgrado;
	}



	@Override
	public boolean tieneTituloPostgrado() {
		
		if( this.TituloPostgrado != null )
		{
			return true;
		}
		else
		{
			return false;	
		}
		
	}



	public long getAntiguedad() {
		return antiguedad;
	}



	public void setAntiguedad(long antiguedad) {
		this.antiguedad = antiguedad;
	}



	public void setSiguiente(Trabajador siguiente) {
		this.siguiente = siguiente;
	}



	public void setSalario(long salario) {
		this.salario = salario;
	}



	public void setPremio(long premio) {
		this.premio = premio;
	}



	@Override
	public void agregarTrabajadorACargo(ITrabajador trabajador) throws ExcepcionOperacionNoPermitida {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setJefe(ITrabajador jefe) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setSalario(double salario) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public double getPremio() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public double getMontoACobrar() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int getCantidadEmpleadosACargoDirecto() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int getCantidadEmpleadosACargoTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	


	





	
		
	}


