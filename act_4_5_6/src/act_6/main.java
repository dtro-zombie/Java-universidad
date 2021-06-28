package act_6;

public class main {

	public static void main(String[] args) 
	{
		
		Agenda a1 = new Agenda(3);
		
		a1.guardar(new Persona("nahuel"), "1");
		a1.guardar(new Persona("fabi"), "2");
		a1.guardar(new Persona("dany"), "3");
		a1.imprimir();
		System.out.println("   ");
		a1.eliminar(a1.contactos[1]);
		a1.imprimir();
		System.out.println("   ");
		System.out.println(a1.pertenece(a1.contactos[2]));
		System.out.println("   ");
		
		System.out.println(a1.dameTelefono(a1.contactos[2]));
		System.out.println("   ");
		a1.imprimir();
	}

}
