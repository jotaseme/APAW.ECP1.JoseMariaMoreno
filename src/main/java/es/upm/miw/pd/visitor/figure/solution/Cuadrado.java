package es.upm.miw.pd.visitor.figure.solution;

public class Cuadrado implements Figura {

	@Override
	public void accept(Visitor v) {
		v.visitCuadrado(this);
	}
	
	public double numberOfSides() {
        return 4;
    }

}
