package es.upm.miw.pd.visitor.figure.solution;

import es.upm.miw.pd.visitor.figure.solution.Visitor;

public interface Figura {
	void accept(Visitor v);
}
