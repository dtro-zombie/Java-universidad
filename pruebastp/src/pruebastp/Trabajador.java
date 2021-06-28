package pruebastp;

import java.util.*;

public class Trabajador implements ITrabajador {

	private long dni;
	private String nombre;
	private String apellido;
	private Fecha FechaIngreso;
	private TipoCargo cargo;
	private Trabajador siguiente;
	private double salario;
	private double premio;
	private String TituloUniversitario;
	private String TituloPostgrado;
	private Trabajador[] acargo;
	private int Largo;

	Trabajador(long dni1, String nombre1, String apellido1, TipoCargo cargo, double salario, Fecha fecha) {
		this.dni = dni1;
		this.nombre = nombre1;
		this.apellido = apellido1;
		this.siguiente = null;
		this.TituloPostgrado = null;
		this.TituloUniversitario = null;
		this.salario = salario;
		this.premio = 0;
		this.cargo = cargo;
		this.Largo = 0;
		this.acargo = new Trabajador[this.Largo];

		this.FechaIngreso = new Fecha(fecha.getDia(), fecha.getMes(), fecha.getAnio());
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

		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Apellido: " + this.getApellido());
		System.out.println("salario: " + this.salario);
		System.out.println("Fecha de ingreso: " + this.getFechaIngreso());
		System.out.println("meses de antiguedad: " + this.getMesesAntiguedad());
		System.out.println("");

	}

	@Override
	public boolean esEmpleado() {
		if (this.cargo == TipoCargo.JEFES || this.cargo == TipoCargo.SUPERVISOR || this.cargo == TipoCargo.OPERARIO) {
			return true;
		}
		return false;
	}

	@Override
	public boolean esDirectivo() {
		if (!esEmpleado()) {
			return true;
		}
		return false;
	}

	@Override
	public int getMesesAntiguedad() {

		Calendar fecha = new GregorianCalendar();

		return ((fecha.get(Calendar.YEAR) - this.FechaIngreso.getAnio()) * 12);
	}

	@Override
	public void setTituloUniversitario(String titulo) {

		this.TituloUniversitario = titulo;

	}

	@Override
	public String getTituloUniversitario() {

		return this.TituloUniversitario;
	}

	public void setPremio() {

		this.premio = 0;
		if (this.esDirectivo()) {

			if (this.getMesesAntiguedad() >= 12) {
				this.premio += 100000;

			}

			if (this.getMesesAntiguedad() < 12) {
				this.premio += 50000;
			}

			if (this.tieneTituloUniversitario()) {

				this.premio += 15000;

				if (this.tieneTituloPostgrado()) {
					this.premio += 25000;
				}

				if (this.getCantidadEmpleadosACargoDirecto() > 0) {
					this.premio += (1000 * this.getCantidadEmpleadosACargoDirecto());
				}
				if (this.getCantidadEmpleadosACargoTotal() > 0) {
					this.premio += (500 * this.getCantidadEmpleadosACargoTotal());

				}
			}

			else {

				if (this.getMesesAntiguedad() >= 12) {
					this.premio += 60000;

				}

				if (this.getMesesAntiguedad() < 12) {
					this.premio += 30000;
				}

				if (this.tieneTituloUniversitario()) {

					this.premio += 15000;

					if (this.tieneTituloPostgrado()) {
						this.premio += 25000;

					}

					if (this.getCantidadEmpleadosACargoDirecto() > 0) {
						this.premio += (1000 * this.getCantidadEmpleadosACargoDirecto());
					}
					if (this.getCantidadEmpleadosACargoTotal() > 0) {
						this.premio += (500 * this.getCantidadEmpleadosACargoTotal());

					}

				}

			}
		}

	}

	@Override
	public boolean tieneTituloUniversitario() {

		if (this.getTituloUniversitario() == null || this.getTituloUniversitario() == "") {
			return false;
		}
		return true;
	}

	@Override
	public void setTituloPostgrado(String titulo) throws ExcepcionOperacionNoPermitida {
		if (this.tieneTituloPostgrado()) {
			throw new ExcepcionOperacionNoPermitida("debe tener titulo universitario");

		}

		this.TituloPostgrado = titulo;
	}

	@Override
	public String getTituloPostgrado() {

		return this.TituloPostgrado;
	}

	@Override
	public boolean tieneTituloPostgrado() {

		if (this.TituloUniversitario != null || this.TituloUniversitario != "") {
			return false;
		} else {
			return true;
		}

	}

	public void setSiguiente(Trabajador siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public void setJefe(ITrabajador jefe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSalario(double salario) {

		this.salario = salario;

	}

	@Override
	public double getSalario() {
		return this.salario;
	}

	@Override
	public double getPremio() {

		return this.premio;
	}

	@Override
	public double getMontoACobrar() {
		this.setPremio();
		return this.salario + this.premio;
	}

	// ---------------------------------------------------------------------------------------------------------------------------
	@Override
	public int getCantidadEmpleadosACargoDirecto() {

		return this.Largo;
	}

	// ---------------------------------------------------------------------------------------------------------------------------
	@Override
	public int getCantidadEmpleadosACargoTotal() {

		int cont = 0;
     for( int i=0;i<=this.Largo-1;i++) 
     
     {
	 
    	 
    	 if( this.acargo[i].cargo!=TipoCargo.OPERARIO )
      cont++;
    	 cont+=this.acargo[i].getCantidadEmpleadosACargoTotal();
     }
        
     	
	return cont;
}
		

		
		
		
	

	public Trabajador[] getAcargo() {
		return acargo;
	}

	@Override
	public void agregarTrabajadorACargo(ITrabajador trabajador) throws ExcepcionOperacionNoPermitida {

		if (this.cargo == TipoCargo.DIRECTOR_GENERAL) {

			if (trabajador.getCargo() != TipoCargo.DIRECTOR_DEPARTAMENTO) {
				System.out.println("no puede hacerce cargo");
			}

			else {

				this.agregaracargoayuda((Trabajador) trabajador);
			}

		}

		if (this.cargo == TipoCargo.DIRECTOR_DEPARTAMENTO) {
			if (trabajador.getCargo() != TipoCargo.JEFES) {
				System.out.println("no puede hacerce cargo");
			}

			else {

				this.agregaracargoayuda((Trabajador) trabajador);
			}
		}

		if (this.cargo == TipoCargo.JEFES) {
			if (trabajador.getCargo() != TipoCargo.SUPERVISOR) {
				System.out.println("no puede hacerce cargo");
			}

			else {

				this.agregaracargoayuda((Trabajador) trabajador);
			}
		}
		if (this.cargo == TipoCargo.SUPERVISOR) {
			if (trabajador.getCargo() != TipoCargo.OPERARIO) {
				System.out.println("no puede hacerce cargo");
			}

			else {

				this.agregaracargoayuda((Trabajador) trabajador);
			}
		}

		if (this.cargo == TipoCargo.OPERARIO)

		{

			System.out.println("El operario no puede hacerce cargo de nadie");

		}

	}

	public void agregaracargoayuda(Trabajador trabajador) {

		Trabajador[] arrDestino = new Trabajador[this.Largo];

		System.arraycopy(this.acargo, 0, arrDestino, 0, this.Largo);

		this.acargo = new Trabajador[this.Largo + 1];

		System.arraycopy(arrDestino, 0, this.acargo, 0, this.Largo);

		this.acargo[this.Largo] = (Trabajador) trabajador;

		this.Largo++;

	}
	
	
	public void veracargo()
	{
		for(int i=0;i<=this.Largo-1;i++)
		{
			System.out.println(this.acargo[i].dni);
		}
	}
}
