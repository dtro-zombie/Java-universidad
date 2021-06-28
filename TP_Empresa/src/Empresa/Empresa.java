package Empresa;

public class Empresa implements IEmpresa {

	private Trabajador primero;

	Empresa() {

		this.primero = null;
	}

	@Override
	public void agregarEmpleado(ITrabajador trabajador) {
		// falta setear otras
		// variables__________________________________________________________________________________________________________
		// _______________________________________________________________________________________________________________________________________
		// _______________________________________________________________________________________________________________________________________

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
			System.out.println("");
			n = n.getSiguiente();

		}
	}

	@Override
	public void agregarDirectivo(ITrabajador trabajador) {

		// falta setear otras
		// variables__________________________________________________________________________________________________________
		// _______________________________________________________________________________________________________________________________________
		// _______________________________________________________________________________________________________________________________________
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
	public void quitarEmpleado(ITrabajador trabajador) {
		
		//FALTA CORROBORAR QUE ES EMPELADO
		
		this.quitarEmpleado(trabajador.getDni());

	}

	@Override
	public void quitarDirectivo(ITrabajador trabajador) {
		//FALTA CORROBORAR QUE ES DIRECTIVO
		this.quitarDirectivo(trabajador.getDni());

	}

	@Override
	public void quitarEmpleado(long dni) {
		//FALTA CORROBORAR QUE ES EMPELADO

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
		
		//FALTA CORROBORAR QUE ES DIRECTIVO
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

		// falta
		// controlar__________________________________________________________________________________________________________
		// _______________________________________________________________________________________________________________________________________
		// _______________________________________________________________________________________________________________________________________

		if (n == null) {
			System.out.println("es null");
		}

		return null;
	}

	@Override
	public void liquidarSueldos() {
		// TODO Auto-generated method stub

	
	
	}

	@Override
	public double obtenerMontoTotalAPagar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ITrabajador obtenerTrabajadorSalarioMinimo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITrabajador obtenerTrabajadorSalarioMaximo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double obtenerPromedioSalarios() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ITrabajador obtenerTrabajadorMasAntiguo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITrabajador obtenerTrabajadorMasReciente() {
		// TODO Auto-generated method stub
		return null;
	}

	public ITrabajador getPrimero() {
		return primero;
	}

	public void setPrimero(Trabajador primero) {
		this.primero = primero;
	}

}
