package de.ostfalia.swt.aufgabe2;

import static org.junit.Assert.*;

import org.junit.Test;

public class IterativTest {

	@Test
	public void test() {
		Iterativ ito = new Iterativ();
		int tmp = ito.calculate(4);
		System.out.println(tmp);
		int tmp2 = ito.calculate(10);
		System.out.println(tmp2);
		assertTrue("Woot", tmp == 24);
		assertTrue("Mega", tmp2 == 3628800);
	}

}
