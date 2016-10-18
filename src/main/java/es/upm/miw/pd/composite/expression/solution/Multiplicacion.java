package es.upm.miw.pd.composite.expression.solution;

public class Multiplicacion extends CompositeExpression {

	public Multiplicacion(Expression exp1, Expression exp2) {
		super(exp1, exp2);
	}

	@Override
	public int operar() {
		return getExpression1().operar() * getExpression2().operar();
	}

	@Override
	public String toString() {
		return getExpression1().toString() + " * " + getExpression2().toString();
	}

}
