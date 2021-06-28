package pruebastp;

public interface ITrabajador {
	
	public void imprimirtra();
	
	public boolean esEmpleado();

	public boolean esDirectivo();

	public TipoCargo getCargo();

	public int getMesesAntiguedad();

	public void setTituloUniversitario(String titulo);

	public String getTituloUniversitario();

	public boolean tieneTituloUniversitario();

	public void setTituloPostgrado(String titulo) throws ExcepcionOperacionNoPermitida;

	public String getTituloPostgrado();

	public boolean tieneTituloPostgrado();

	public String getNombre();

	public String getApellido();

	public long getDni();

	public void agregarTrabajadorACargo(ITrabajador trabajador) throws ExcepcionOperacionNoPermitida;

	public void setJefe(ITrabajador jefe);

	public void setSalario(double salario);

	public double getSalario();

	public double getPremio();

	/* salario m�s premio */
	public double getMontoACobrar();

	public int getCantidadEmpleadosACargoDirecto();

	/* los suyos m�s lo de sus empleados a cargo directo y asi */
	public int getCantidadEmpleadosACargoTotal();

}
