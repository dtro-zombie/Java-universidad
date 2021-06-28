package act7obj;

public class Agenda

{
	Persona[] contactos;
	String[] telefonos;

	public Agenda(int tamanio) {

		this.contactos = new Persona[tamanio];
		this.telefonos = new String[tamanio];

	}

	void guardar(Persona contacto, String telefono) {
		for (int i = 0; i < this.contactos.length; i++) {
			if (contactos[i] == null) {
				contactos[i] = contacto;
				telefonos[i] = telefono;
				i = this.contactos.length + 1;
			}
		}

	}

	void eliminar(Persona contacto) {
		for (int i = 0; i < this.contactos.length; i++) {
			if (contactos[i] == contacto) {
				contactos[i] = null;
				telefonos[i] = null;
				i = this.contactos.length + 1;
			}
		}

	}

	boolean pertenece(Persona contacto) {
		for (int i = 0; i < this.contactos.length; i++) {
			if (contactos[i] == contacto) {
				return true;
			}

		}
		return false;

	}

	String dameTelefono(Persona contacto) {
		for (int i = 0; i < this.contactos.length - 1; i++) {
			if (pertenece(contacto)) {

				return telefonos[i];
			}
		}
		return "no existe";
	}

	void imprimir() {
		for (int i = 0; i < contactos.length; i++) {
			if (this.contactos[i] != null)
				System.out.println(this.contactos[i].nombre + ": " + this.telefonos[i]);
		}

	}
}