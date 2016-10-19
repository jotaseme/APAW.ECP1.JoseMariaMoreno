package es.upm.miw.pd.visitor.figure.solution;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

    private List<Figura> figuras;

    public FiguresManager() {
        figuras = new ArrayList<>();
    }

    public void add(Figura figure) {
        figuras.add(figure);
    }

    public double totalArea() {   	
    	Visitor v = new VisitorArea();
    	for (Figura figure : figuras) {
            figure.accept(v);
        }
    	return 0;
      
    }

    public double totalNumberOfSides() {
    	Visitor v = new VisitorSize();
        for (Figura figure : figuras) {
            figure.accept(v);
        }
        return 0;
    }

}
