package es.upm.miw.pd.command.calculator.solution;

public class Operar implements Order {
	
	Calculator calculator;
	
	public Operar(){
		this.calculator = new Calculator();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

}
