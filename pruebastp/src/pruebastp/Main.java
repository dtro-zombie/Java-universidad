package pruebastp;



public class Main {

	

	public static void main(String[] args) throws ExcepcionOperacionNoPermitida
	
	{
		Empresa emp = new Empresa();
		
		
		Trabajador tra = new Trabajador(29, "nah", "arias", TipoCargo.DIRECTOR_GENERAL, 15000,
				
				new Fecha(12, 1, 1998));
			emp.agregarEmpleado(tra);
		
		

		
		Trabajador tra2 = new Trabajador(25, "nahuel", "arias", TipoCargo.DIRECTOR_DEPARTAMENTO, 15000,
				new Fecha(12, 1, 1998));
		
		

		emp.agregarDirectivo(tra2);
		
		
		Trabajador tra3 = new Trabajador(26, "nah", "arias", TipoCargo.JEFES, 15000,
				
				new Fecha(12, 1, 1998));
			emp.agregarEmpleado(tra3);
		
			
			
				Trabajador tra4 = new Trabajador(28, "nah", "arias", TipoCargo.SUPERVISOR, 15000,
						
						new Fecha(12, 1, 1998));
					emp.agregarEmpleado(tra4);
					
					Trabajador tra5 = new Trabajador(27, "nah", "arias", TipoCargo.OPERARIO, 15000,
							
							new Fecha(12, 1, 1998));
						emp.agregarEmpleado(tra5);
		
					
						
						tra.agregarTrabajadorACargo(tra2);
						
						tra2.agregarTrabajadorACargo(tra3);
						tra3.agregarTrabajadorACargo(tra4);
						tra4.agregarTrabajadorACargo(tra5);
					
						
						
						
						
		
						System.out.println("los que tiene a cargo");
						System.out.println(tra.getCantidadEmpleadosACargoDirecto());
						
						
						System.out.println("los que tine a cargo contando hasta operario");
						System.out.println(tra.getCantidadEmpleadosACargoTotal());
						System.out.println(tra3.getCantidadEmpleadosACargoTotal());
						System.out.println("cargo");
						tra.veracargo();
						
	
}

}
