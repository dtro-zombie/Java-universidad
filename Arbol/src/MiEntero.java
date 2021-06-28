
public class MiEntero implements ElementoComparable 
{
	private int elemento;
	
	
	
	public MiEntero(int elemento) {
		this.elemento=elemento;
	}
	

	@Override
	public boolean igualQue(ElementoComparable otro) {
		MiEntero p2 = (MiEntero) otro;
		return this.getElemento() == p2.getElemento();
	}

	@Override
	public boolean menorQue(ElementoComparable otro) {
		
		MiEntero p2 = (MiEntero) otro;
		return this.getElemento() < p2.getElemento();
		
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	@Override
	public boolean menorIgualQue(ElementoComparable otro) {
		MiEntero p2 = (MiEntero) otro;
		return this.getElemento() <= p2.getElemento();
	}

	@Override
	public boolean mayorQue(ElementoComparable otro) {
		MiEntero p2 = (MiEntero) otro;
		return this.getElemento() > p2.getElemento();
	}

	@Override
	public boolean mayorIgualQue(ElementoComparable otro) {
		MiEntero p2 = (MiEntero) otro;
		return this.getElemento() >= p2.getElemento();
	}


	public void imprimir() {
		System.out.println(elemento);
		
	}

	
	
	
}
