package Servidor;

import static org.junit.Assert.*;

import org.junit.Test;


public class TesteServidor {

	@Test
	public void test1() {
		Servidor s =new Servidor("P", 1, 1500.0f, 0.0f);
		double r = s.calculaIR();
		assertEquals(75, r,0);
	}
		@Test
		public void test2() {
		Servidor s =new Servidor("F", 1, 1000.0f, 0.0f);
		double r = s.calculaIR();
		assertEquals(0.0, r,0);
		}
		@Test
		public void test3() {
		Servidor s =new Servidor("O", 1, 2500.0f, 0.0f);
		double r = s.calculaIR();
		assertEquals(275, r,0);
	}
}