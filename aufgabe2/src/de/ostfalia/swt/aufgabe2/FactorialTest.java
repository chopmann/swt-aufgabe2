package de.ostfalia.swt.aufgabe2;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.ServiceLoader;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
		ServiceLoader<Factorial> loader = ServiceLoader.load(Factorial.class);
		Factorial fac = loader.iterator().next();
		int tmp = fac.calculate(10);
		System.out.println(tmp);
		for (Iterator<Factorial> iterator = loader.iterator(); iterator.hasNext();) {
			Factorial something = (Factorial) iterator.next();
			System.out.println(something.getType());
			
		}
		assertTrue("Not Working", tmp == 3628800);
	}

}
