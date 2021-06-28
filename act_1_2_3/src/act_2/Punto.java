package act_2;

public class Punto {
	
	double x=0;
	double y=0;


	public Punto(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void imprimir() 
	{
	    System.out.println("punto x " +x);	
	    System.out.println("punto y " +y);
	}
	
	public void desplazar(double desp_x, double desp_y)
	{
		this.x=desp_x;
		this.y=desp_y;
	}
	
	static double distancia(Punto p1, Punto p2) 
	{
		return Math.sqrt(((p1.x)-(p2.x))*((p1.x)-(p2.x)) + ((p1.y)-(p2.y))*((p1.y)-(p2.y)));
	}

	
	

}
