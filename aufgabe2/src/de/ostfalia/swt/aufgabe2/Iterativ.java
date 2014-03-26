package de.ostfalia.swt.aufgabe2;

public class Iterativ implements Factorial {
	
	private String type = "Iterativ";
	@Override
	public int calculate(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
	@Override
	public String getType() {
		return type;
	}

}
