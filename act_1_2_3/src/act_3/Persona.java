package act_3;

public class Persona {
	
	String nombre;
	int  edad;

	public Persona(String nombre, int edad)
	{
		
		this.nombre=nombre;
		this.edad = edad;
		
	}
	


	boolean masJovenQue(Persona otro)
	{
		
		
		if(this.edad < otro.edad)
 		{
 			return true;
 		}
 
 		
 		return false;
 	
 	}
	
	
	boolean tocayo(Persona otro)
	 {
		if (this.nombre.equals(otro.nombre))
		{
			return true;
		}
		else
		{
			return false;
		}
	 }
	 boolean mismaPersona(Persona otro) 
	 {
		 if(this.tocayo(otro) && this.edad==otro.edad)
		 {
			 return true;
		 }
		 else 
		 {
			 return false;
		 }
	 }
}
	 
	