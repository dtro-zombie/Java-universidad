package act3obj;

public class Principal {

	public static void main(String[] args) {
		
		// Imprime Circulo:
		
				Circulo c= new Circulo(2,5,4);
				Circulo c2=new Circulo(1,6,9);
				
				c.imprimir();
				
				// Imprime Perimetro:
			 System.out.println("El perimetro es: " +c.perimetro());
			 
			 	// Imprime Superficie:
			 System.out.println("La superficie es: "+ c.superficie());	
				
			 	//Escalar:	
			 System.out.println("Escala: ");
			 	c.escalar(3);
			 	c.imprimir();
			 	
			 	//Desplazar:
			 	System.out.println("Se desplaza: ");
			 	c.desplazar(1,2);
			 	c.imprimir();
			 	
			 	//Distancia:
			 	System.out.println("La distancia entre los dos puntos es: "+ Circulo.distancia(c,c2));
			 	
			 	//Se tocan:
			 	System.out.println("Se tocan: "+ Circulo.seTocan(c,c2));
			 	
			 	//Lo contiene:
			 	System.out.println("Esta contenida en la superfice del argumento: "+ c.loContiene(c2));
		
		
	}

}
