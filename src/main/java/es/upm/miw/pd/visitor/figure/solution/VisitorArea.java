package es.upm.miw.pd.visitor.figure.solution;

public class VisitorArea extends Visitor {

	@Override
	public double visitCuadrado(Cuadrado cuadrado) {
		return (cuadrado.getSide() * cuadrado.getSide());
	}

	@Override
	public double visitTriangulo(Triangulo triangulo) {
		return (triangulo.getBase() * triangulo.getHeight() * 0.5);

	}

	@Override
	public double visitCirculo(Circulo circulo) {
		return (Math.PI * circulo.getRadius() * circulo.getRadius());
	}

}
