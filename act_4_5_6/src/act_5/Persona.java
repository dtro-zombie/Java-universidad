package act_5;

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
	 static Persona masJoven(Persona[] grupo)
	 {
		 Persona aux= grupo[0];
		 
		 for (int i=0;i<grupo.length-1;i++)
		 {
			 if(grupo[i].masJovenQue(aux))
			 {
				 aux=grupo[i];
			 }
		 }
		 
		 return aux;
		 
		 
	 }
	 static Persona buscar(Persona[] grupo, String nombre)
	 {
		 for(int i=0;i<grupo.length-1;i++)
		 {
			 if(grupo[i].nombre==nombre)
			 {
				 return grupo[i];
			 }
			 
		 }
	 
		 return new Persona("no se encuentra", 0);
	 }
}
	 
	