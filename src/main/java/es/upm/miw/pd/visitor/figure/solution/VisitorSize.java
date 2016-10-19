package es.upm.miw.pd.visitor.figure.solution;

public class VisitorSize extends Visitor {
	

	@Override
	public double visitCuadrado(Cuadrado cuadrado) {
		return (cuadrado.numberOfSides());
	}

	@Override
	public double visitTriangulo(Triangulo triangulo) {
		return (triangulo.numberOfSides());
	}

	@Override
	public double visitCirculo(Circulo circulo) {
		return (circulo.numberOfSides());
	}

}
