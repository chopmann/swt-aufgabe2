package de.ostfalia.swt.aufgabe2;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class RekursivTest {

	@Test
	public void test() {
		Rekursiv reku = new Rekursiv();
		int tmp = reku.calculate(4);
		int tmp2 = reku.calculate(10);
		assertTrue("Woot", tmp == 24);
		assertTrue("Mega", tmp2 == 3628800);
		System.out.println(tmp2);
	}

}
