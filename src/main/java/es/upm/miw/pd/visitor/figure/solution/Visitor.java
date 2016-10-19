package es.upm.miw.pd.visitor.figure.solution;

public abstract class Visitor {
	public abstract void visitCuadrado(Cuadrado cuadrado);
	public abstract void visitTriangulo(Triangulo triangulo);
	public abstract void visitCirculo(Circulo circulo);


}
