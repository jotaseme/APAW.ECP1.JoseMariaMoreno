package es.upm.miw.pd.visitor.figure.solution;

public abstract class Visitor {
	
	public abstract double visitCuadrado(Cuadrado cuadrado);
	public abstract double visitTriangulo(Triangulo triangulo);
	public abstract double visitCirculo(Circulo circulo);


}
