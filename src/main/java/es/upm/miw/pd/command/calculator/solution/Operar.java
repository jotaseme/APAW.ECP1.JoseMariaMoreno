package es.upm.miw.pd.command.calculator.solution;

public class Operar implements Comando {
	
	Calculator calculator;
	
	public Operar(Calculator calculator){
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
