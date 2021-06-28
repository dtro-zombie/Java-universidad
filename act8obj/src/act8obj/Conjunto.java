package act8obj;

public class Conjunto {
	int[] elementos;
	int cantidad;

	Conjunto() {
		this.elementos = new int[0];
		this.cantidad = 0;
	}

	void agregar(int n) {

		if (pertenece(n) == true) {

		}

		else {
			for (int i = 0; i <= this.elementos.length - 1; i++) {

				if (this.elementos[i] == 0) {
					this.elementos[i] = n;
					n = 0;
					break;
				}
			}

		}

		if (n != 0) {
			int[] arrDestino = new int[this.cantidad];

			System.arraycopy(this.elementos, 0, arrDestino, 0, this.cantidad);

			this.elementos = new int[this.cantidad + 1];

			System.arraycopy(arrDestino, 0, this.elementos, 0, this.cantidad);

			this.elementos[this.cantidad] = n;

			cantidad++;
		}

	}

	void imprimir() {

		for (int i = 0; i <= this.elementos.length - 1; i++) {
			System.out.println(" hola " + this.elementos[i]);
		}

	}

	boolean pertenece(int n) {
		for (int i = 0; i <= this.elementos.length - 1; i++) {
			{
				if (n == this.elementos[i])
					return true;
			}
		}
		return false;
	}

	void quitar(int n) {

		for (int i = 0; i <= this.elementos.length - 1; i++) {
			{
				if (n == this.elementos[i]) {
					this.elementos[i] = 0;
				}

			}

		}
	}


	static Conjunto union(Conjunto c1, Conjunto c2) {
		
		Conjunto union1 = new Conjunto();

		for(int i=0;i<=c1.cantidad-1;i++)
		{
			union1.agregar(c1.elementos[i]);
			
		}
		for(int i=0;i<=c2.cantidad-1;i++)
		{
			union1.agregar(c2.elementos[i]);
		}
	
	
	return union1;
	}


 static Conjunto interseccion(Conjunto c1, Conjunto c2)
   {
	 
	 Conjunto interseccion = new Conjunto();
	 
	 for(int i=0;i<=c1.cantidad-1;i++)
	 {
		 for(int j=0;j<=c2.cantidad-1;j++)
		 {
			 
			 if(c1.elementos[i]==c2.elementos[j])
			 {
				 interseccion.agregar(c1.elementos[i]);
			 }
			 
			 
		 }
	 }
	 return interseccion;
  }
 

 static Conjunto resta(Conjunto c1, Conjunto c2) {

	 Conjunto resta = new Conjunto();
	 
	
	for (int i = 0; i < c1.cantidad; i++)
	 {
	 if(c2.pertenece(c1.elementos[i]))
	 {
		 
	 }
	 else
	 {
	 resta.agregar(c1.elementos[i]);
	 }
	 }
	 return resta;
	 
  }
  
  void restar(Conjunto c)
  {
	  
	  for (int i = 0; i < this.cantidad-1; i++)
		 {
		 if(c.pertenece(this.elementos[i]))
		 {
			 c.quitar(this.elementos[i]); 
		 }
		
		 }
  
  }
}
