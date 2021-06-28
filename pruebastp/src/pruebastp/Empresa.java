package pruebastp;

import unpaz.ayp3.Consola;

public class Empresa implements IEmpresa {

	private Trabajador primero;

	Empresa() {

		this.primero = null;
	}

	@Override
	public void agregarEmpleado(ITrabajador trabajador){

		Trabajador aux = (Trabajador) trabajador;
		aux.setSiguiente(null);
		if (this.primero == null) {

			this.primero = (Trabajador) trabajador;
			return;
		}

		Trabajador n = this.primero;
		while (n.getSiguiente() != null) {

			n = n.getSiguiente();
		}
		n.setSiguiente(aux);

	}

	public void imprimir() {
		System.out.print("[");
		Trabajador n = this.primero;

		while (n != null) {

			System.out.print(n.getDni() + " ");
			System.out.print(n.getNombre() + " ");
			System.out.print(n.getApellido() + " ");

			System.out.println(n.getMesesAntiguedad());
			n = n.getSiguiente();

		}
	}

	@Override
	public void agregarDirectivo(ITrabajador trabajador) {

		if (this.primero == null) {

			this.primero = (Trabajador) trabajador;
			return;
		}

		else {
			Trabajador n = this.primero;
			while (n.getSiguiente() != null) {
				n = n.getSiguiente();
			}
			n.setSiguiente(trabajador);

		}

	}

	@Override
	public void ModificarEmpleado(ITrabajador trabajador) {

		boolean salir=false;
		while(!salir) {
		try {
		
		Trabajador n = this.primero; 
		
		System.out.println("ingrese dni del que va modificar");
		int dni=Consola.pedirEntero();
		salir=true;
		
		n = (Trabajador) this.obtenerTrabajador(dni);
		
		
		if(n==null)
		{
			System.out.println("el dni no existe");
		}
		
		else 
		{
		
			Trabajador recorre = this.primero;
			Trabajador aux= (Trabajador) trabajador;
			while(recorre!=null)
			{
				
				if(recorre.getDni()==dni)
				{
					
					this.quitarEmpleado(dni);
					this.agregarEmpleado(trabajador);
					
				}
				
				
				recorre=recorre.getSiguiente();
			}
			
		}
		
		
		}
		catch(Exception e)
		{
			System.out.println("algo salio mal");
		}
	}
	}	
		
		
		
		
	



	@Override
	public void quitarEmpleado(long dni) {
		// FALTA CORROBORAR QUE ES EMPELADO

		if (this.primero != null && this.primero.getDni() == dni) {

			this.primero = this.primero.getSiguiente();
			return;
		}

		Trabajador actual = this.primero, prev = null;
		while (actual != null && actual.getDni() != dni) {
			actual = (prev = actual).getSiguiente();
		}

		if (actual != null) {
			prev.setSiguiente(actual.getSiguiente());
		}

	}

	@Override
	public void quitarDirectivo(long dni) {

		// FALTA CORROBORAR QUE ES DIRECTIVO
		if (this.primero != null && this.primero.getDni() == dni) {

			this.primero = this.primero.getSiguiente();
			return;
		}

		Trabajador actual = this.primero, prev = null;
		while (actual != null && actual.getDni() != dni) {
			actual = (prev = actual).getSiguiente();
		}

		if (actual != null) {
			prev.setSiguiente(actual.getSiguiente());
		}

	}

	@Override
	public ITrabajador obtenerTrabajador(long dni) {

		Trabajador n = this.primero;

		while (n != null) {

			if (n.getDni() == dni) {

				return n;
			} else {

				n = n.getSiguiente();
			}
		}

		
		return null;
	}

	@Override
	public void liquidarSueldos()

	{
		Trabajador recorrer = this.primero;
		while (recorrer != null) {
			recorrer.setPremio();
			System.out.println("Nombre: " + recorrer.getNombre());
			System.out.println("Apellido: " + recorrer.getApellido());
			System.out.println("Fecha de ingreso: " + recorrer.getFechaIngreso());
			System.out.println("Salario: " + recorrer.getSalario());
			System.out.println("Premio: " + recorrer.getPremio());
			System.out.println("Total: " + (recorrer.getSalario() + recorrer.getPremio()));

			recorrer = recorrer.getSiguiente();

		}

	}

	@Override
	public double obtenerMontoTotalAPagar() {

		Trabajador recorrer = this.primero;
		double acum = 0;

		while (recorrer != null) {

			acum += recorrer.getMontoACobrar();

			recorrer = recorrer.getSiguiente();
		}

		return acum;
	}

	@Override
	public ITrabajador obtenerTrabajadorSalarioMinimo() {

		Trabajador recorre = this.primero;

		Trabajador aux = recorre;

		while (recorre != null) {

			if (aux.getSalario() > recorre.getSalario()) {

				aux = recorre;

			}

			recorre = recorre.getSiguiente();

		}

		return aux;

	}

	@Override
	public ITrabajador obtenerTrabajadorSalarioMaximo() {
		Trabajador recorre = this.primero;

		Trabajador aux = recorre;

		while (recorre != null) {

			if (aux.getSalario() < recorre.getSalario()) {

				aux = recorre;

			}

			recorre = recorre.getSiguiente();

		}

		return aux;

	}

	@Override
	public double obtenerPromedioSalarios() {

		Trabajador recorre = this.primero;
		double sumatoria = 0;

		while (recorre != null) {

			sumatoria += recorre.getSalario();

			recorre = recorre.getSiguiente();

		}

		return sumatoria / largo();
	}

	@Override
	public ITrabajador obtenerTrabajadorMasAntiguo() {
		Trabajador recorre = this.primero;

		Trabajador aux = recorre;

		while (recorre != null) {

			if (aux.getFechaIngreso().getAnio() > recorre.getFechaIngreso().getAnio()) {

				aux = recorre;

			}

			else if (aux.getFechaIngreso().getAnio() == recorre.getFechaIngreso().getAnio()) {

				if (aux.getFechaIngreso().getMes() > recorre.getFechaIngreso().getMes()) {
					aux = recorre;
				}

				if (aux.getFechaIngreso().getMes() == recorre.getFechaIngreso().getMes()) {

					if (aux.getFechaIngreso().getDia() > recorre.getFechaIngreso().getDia()) {
						aux = recorre;
					}

				}

			}

			recorre = recorre.getSiguiente();

		}

		return aux;

	}

	@Override
	public ITrabajador obtenerTrabajadorMasReciente() {
		Trabajador recorre = this.primero;

		Trabajador aux = recorre;

		while (recorre != null) {

			if (aux.getFechaIngreso().getAnio() < recorre.getFechaIngreso().getAnio()) {

				aux = recorre;

			}

			else if (aux.getFechaIngreso().getAnio() == recorre.getFechaIngreso().getAnio()) {

				if (aux.getFechaIngreso().getMes() < recorre.getFechaIngreso().getMes()) {
					aux = recorre;
				}

				if (aux.getFechaIngreso().getMes() == recorre.getFechaIngreso().getMes()) {

					if (aux.getFechaIngreso().getDia() < recorre.getFechaIngreso().getDia()) {
						aux = recorre;
					}

				}

			}

			recorre = recorre.getSiguiente();
		}
		return aux;
	}

	public ITrabajador getPrimero() {
		return primero;
	}

	public void setPrimero(Trabajador primero) {
		this.primero = primero;
	}

	@Override
	public int largo() 
	
	
	{

		Trabajador recorre = this.primero;
		int contador = 0;

		while (recorre != null) {
			contador++;
			recorre = recorre.getSiguiente();
		}

		return contador;
	}

}
