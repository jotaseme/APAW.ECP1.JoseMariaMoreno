package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expression {

	private int value;

	public Numero(int value) {
		this.value = value;
	}

	@Override
	public int operar() {
		return value;
	}

	public String toString() {
		return String.valueOf(value);
	}

}
