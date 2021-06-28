package act3obj;



public class Circulo {
	
	double radio;
	Punto centro;
	
	public Circulo(double centro_x, double centro_y, double radio){
		
		this.radio = radio;
		centro = new Punto(centro_x,centro_y);
	}
	


	public void imprimir(){
		
		System.out.println("El radio es: "+this.radio);
		System.out.println("Pnto x: "+this.centro.x);
		System.out.println("Punto y: "+this.centro.y);
	}
	
	double perimetro(){	
		
		return 2*Math.PI*radio;
	}
	
	double superficie(){
		
		return (Math.pow(radio, 2))*Math.PI;
	}
	void escalar(double factor){
		
		this.radio*=factor;
	}
	
	void desplazar(double desp_x, double desp_y){
		
		centro.desplazar(desp_x,desp_y);
	}
	static double distancia(Circulo c1, Circulo c2) {
		
		return Punto.distancia(c1.centro,c2.centro)-(c1.radio+c2.radio);
		
	}
	static boolean seTocan(Circulo c1, Circulo c2){
		
		if (Circulo.distancia(c1,c2) <=0){
			return true;
		}
		else{
			return false;
		}
	}
	boolean loContiene(Circulo otro){
		
		
		if(otro.radio >= distancia(this,otro) + this.radio ){
			return true;
			
		}
		else{
			return false;
		}
	}

}
