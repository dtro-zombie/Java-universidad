package pruebastp;

public interface IEmpresa {
	
	public int largo();
	
	
	public void agregarEmpleado(ITrabajador trabajador);
	public void agregarDirectivo(ITrabajador trabajador);
	
	public void ModificarEmpleado(ITrabajador trabajador);
	
	
	public void quitarEmpleado(long dni);
	public void quitarDirectivo(long dni);
	
	public ITrabajador obtenerTrabajador(long dni);
	
	/* que imprima por pantalla el listado de trabajadores indicando:
	 * nombre, apellido, fechaIngreso, salario, premio, total*/
	
	public void liquidarSueldos();
	
	public double obtenerMontoTotalAPagar();
	
	public ITrabajador obtenerTrabajadorSalarioMinimo();
	public ITrabajador obtenerTrabajadorSalarioMaximo();
	public double obtenerPromedioSalarios();
	
	public ITrabajador obtenerTrabajadorMasAntiguo();
	public ITrabajador obtenerTrabajadorMasReciente();

}
