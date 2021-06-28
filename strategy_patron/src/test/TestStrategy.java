package test;

import static org.junit.Assert.*;

import org.junit.Test;

import strategy_patron.Strategy;
import strategy_patron.Vendedorbronce;
import strategy_patron.Vendedororo;
import strategy_patron.Vendedorplata;
import strategy_patron.contexto;

public class TestStrategy  {
	
	
	private Strategy strategy;
	private contexto contexto = new contexto(strategy);
	
	
	
	
	@Test
	public void vendeor1() {
		
		strategy= new Vendedorbronce();
		contexto = new contexto(strategy);
		assertTrue(contexto.Implementarstrategy(1000)==1000*0.005);
	}
	
	@Test
	public void vendeor2() {
		strategy= new Vendedorplata();
		contexto = new contexto(strategy);
		assertTrue(contexto.Implementarstrategy(4000)==4000*0.01);
	}
	
	@Test
	public void vendeor3() {
		strategy= new Vendedororo();
		contexto = new contexto(strategy);
		assertTrue(contexto.Implementarstrategy(6000)==6000*0.02);
	}
	
	
	

}
