package es.upm.miw.pd.visitor.figure.solution;

public class Triangulo implements Figura {

	@Override
	public void accept(Visitor v) {
		v.visitTriangulo(this);
	}

	@Override
	public double numberOfSides() {
		return 3;
	}

}
