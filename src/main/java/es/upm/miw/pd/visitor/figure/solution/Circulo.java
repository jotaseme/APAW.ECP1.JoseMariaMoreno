package es.upm.miw.pd.visitor.figure.solution;

public class Circulo implements Figura {
	private double radius;
	
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub

	}
	
	public double getRadius(){
		return this.radius;
	}

}
