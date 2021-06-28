package act4obj;

public class Persona {
	
	String nombre;
	Fecha f_nac;

	public Persona(String nombre, Fecha f_nac)
	{
		
		this.nombre=nombre;
		this.f_nac =  new Fecha(f_nac.dia, f_nac.mes, f_nac.anio);
		
	}
	


	boolean masJovenQue(Persona otro)
	{
		
		
		if(this.f_nac.anio > otro.f_nac.anio)
 		{
 			return true;
 		}
 if(this.f_nac.anio == otro.f_nac.anio &&     this.f_nac.mes > otro.f_nac.mes)
 			{
 			
 			return true;
 			}
 if(this.f_nac.mes==otro.f_nac.mes && this.f_nac.dia > otro.f_nac.dia)
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
		 if(this.nombre.equals(otro.nombre) && this.f_nac.equals(otro.f_nac))
		 {
			 return true;
		 }
		 else 
		 {
			 return false;
		 }
	 }
	 
	 //la act 6
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
	 
		 return new Persona("no se encuentra",new Fecha(0,0,0));
	 }
}

	

