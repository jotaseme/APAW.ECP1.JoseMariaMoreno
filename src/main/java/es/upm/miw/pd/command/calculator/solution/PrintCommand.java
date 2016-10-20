package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;

public class PrintCommand extends Operar {

	public PrintCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		IO.getIO().println("Resultado: " + this.calculator.getTotal());	
	}

	@Override
	public String name() {
		return "Imprimir";
	}

}
