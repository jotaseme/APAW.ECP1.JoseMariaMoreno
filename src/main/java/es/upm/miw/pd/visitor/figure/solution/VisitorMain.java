package es.upm.miw.pd.visitor.figure.solution;

import java.util.ArrayList;
import java.util.Collection;

import upm.jbb.IO;

public final class VisitorMain {
	private Collection<Figura> coleccion = new ArrayList<Figura>();

	public VisitorMain() {
		coleccion.add(new Triangulo());
		coleccion.add(new Cuadrado());
		coleccion.add(new Circulo());
	}

	public void visitador() {
		
	}

	public static void main(String[] args) {
		IO.getIO().addView(new VisitorMain());
	}
}
