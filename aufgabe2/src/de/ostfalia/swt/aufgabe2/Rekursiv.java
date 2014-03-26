package de.ostfalia.swt.aufgabe2;

public class Rekursiv implements Factorial {

	private String type = "Rekursiv";
	@Override
	public int calculate(int num) {
		return (num == 0 ? 1 : calculate(num -1) * num);
	}
	@Override
	public String getType() {
		return type;
	}

}
