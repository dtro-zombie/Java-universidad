package practica0;

import unpaz.ayp3.Consola;
public class act26{
public static void main(String[] args) 
{


int num=0;
	
	System.out.println("ingrese un numero");
	num=Consola.pedirEntero();
	
	System.out.println( fibrec(num ));
}


static int fibrec(int n)
{
	if (n>1){
	       return fibrec(n-1) + fibrec(n-2);  
	    }
	    else if (n==1) {  
	        return 1;
	    }
	    else if (n==0){  
	        return 0;
	    }
	    else{ 
	        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
	        return -1; 
	    }
	}
}
