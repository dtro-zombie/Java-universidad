package Empresa;



public class Main {

	

	public static void main(String[] args)
	
	{
		Empresa emp = new Empresa();
		
		Trabajador tra = new Trabajador(84651111,"nahuel","arias");
		Trabajador tra2 = new Trabajador(54161111,"axel","benitez");
		Trabajador tra3 = new Trabajador(15381111,"tuma","cho");
		
		
		
		
		
		emp.agregarEmpleado(tra);
		emp.agregarEmpleado(tra2);
		emp.agregarEmpleado(tra3);
		
		
		tra.setSalario(16000);
	
		
		emp.imprimir();

		//emp.obtenerTrabajadorSalarioMaximo().imprimirtra();
		//emp.obtenerTrabajadorSalarioMinimo().imprimirtra();
		
		
		
		
		
		
}

}
