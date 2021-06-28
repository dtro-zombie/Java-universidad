package act_1;

public class Fraccion {
	
	int numerador;
	int denominador;
	
	Fraccion(int numerador,int denominador)
	{
		this.numerador=numerador;
		this.denominador=denominador;
		
	}
	
	 void imprimir()
	{
		System.out.println(this.numerador+"/"+this.denominador);
		
		
		
		
	}
	 
	 void invertirSigno() 
	 {
		 this.denominador*=-1;
		 this.numerador*=-1;
		 
	 }
	 void invertir() {
		 
		 int auxnumerador= this.numerador;
		 this.numerador=this.denominador;
		 this.denominador= auxnumerador;
		 
	 }
	 double aDouble() {
		
		 double division=this.numerador/this.denominador;
		 
		 return division;
		 
	 }
	 private int mcd(){
	     int u=Math.abs(numerador);
	     int v=Math.abs(denominador);
	     if(v==0){
	          return u;
	     }
	     int r;
	     while(v!=0){
	          r=u%v;
	          u=v;
	          v=r;
	     }
	     return u;
	  }
	 void reducir() {
		 int dividir=mcd();
	     this.numerador/=dividir;
	     this.denominador/=dividir;
	     
	 }
	 static Fraccion producto(Fraccion q1, Fraccion q2) {
		
		 Fraccion producto = new Fraccion(0,0);
		 q1.reducir();
		 q2.reducir();
		 
		 producto.numerador=q1.numerador*q2.numerador;
		 producto.denominador=q1.denominador*q2.denominador;
				 
		 
		 
		 return producto;
		 
	 }
	 static Fraccion suma(Fraccion q1, Fraccion q2) {
		
		 Fraccion suma = new Fraccion(0,0);
		 
		 suma.numerador= (q1.numerador*q2.denominador)+(q2.numerador*q1.denominador);
		 suma.denominador=q2.denominador*q1.denominador;
		 suma.reducir();
		 
		 
		 return suma;
		 
	 }

}
