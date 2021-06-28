package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcalculadora {

	private int memoria;
	
	
		
	
	public void before()
	{
		
		
		
		
	}
	
	public void after()
	{
		
	}
	
	@Test
	public void sumar() {
		calculadora sCal=new calculadora();
		System.out.println("sumar");
		int a=2, b=5;
		 this.memoria = sCal.sumar(a,b);
		int resultadoEsperado=4;
		assertEquals(resultadoEsperado,resultado);
		
		
		
	}
	@Test
	public void restar()
	{
		calculadora sCal=new calculadora();
		System.out.println("restar");
		int a=2, b=5;
		int resultado= sCal.sumar(a,b);
		int resultadoEsperado=4;
		assertEquals(resultadoEsperado,resultado);
	}
	
	
	
	

}
