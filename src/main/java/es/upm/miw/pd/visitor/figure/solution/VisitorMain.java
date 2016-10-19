package es.upm.miw.pd.visitor.figure.solution;

import upm.jbb.IO;

public final class VisitorMain {
	
	private FiguresManager figuresManager = new FiguresManager();

	public VisitorMain() {
		figuresManager.add(new Triangulo(1,2));
		figuresManager.add(new Cuadrado(2));
		figuresManager.add(new Cuadrado(2));
		figuresManager.add(new Triangulo(1,2));
	
	}

	public void visitador() {
		figuresManager.totalArea();
		figuresManager.totalNumberOfSides();
		
		//IO.getIO().println(visitorSize.getNumberOfSidesCounter());
		//IO.getIO().println(visitorSize.getNumberOfSidesCounter());
	
	}

	public static void main(String[] args) {
		IO.getIO().addView(new VisitorMain());
	}
}
