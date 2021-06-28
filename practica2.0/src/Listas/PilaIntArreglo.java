package Listas;

public class PilaIntArreglo implements PilaInt
{
	
		 int[] elementos;
		 int tope;
		
		public PilaIntArreglo()
		{
			this.tope=0;
			this.elementos = new int [tope];
			
		
		}


	@Override
	public void apilar(int n) 
	{
		
		

		if (n != 0) {
			int[] arrDestino = new int[this.tope];

			System.arraycopy(this.elementos, 0, arrDestino, 0, this.tope);

			this.elementos = new int[this.tope + 1];

			System.arraycopy(arrDestino, 0, this.elementos, 0, this.tope);

			this.elementos[this.tope] = n;

			tope++;
		}

	
	}

	

	@Override
	public void desapilar()
	{
		int[] arrDestino = new int[this.tope-1];
		System.arraycopy(this.elementos, 0, arrDestino, 0, this.tope-1);
		this.elementos = new int[this.tope - 1];
		System.arraycopy(arrDestino, 0, this.elementos, 0, this.tope-1);
		
		tope--;
	}

	@Override
	public boolean estaVacia() {
		
		if(this.tope==0)
		{
			return true;
		}
		return false;
	}

	@Override
	public int tope() {
		
		return this.elementos[tope-1];
	}

	@Override
	public void imprimir()
	{
	
		for (int i = 0; i <= this.elementos.length - 1; i++) {
			System.out.println("--"+i+"--  " + this.elementos[i]);
		}
	
		
	}

}
