package es.upm.miw.pd.visitor.figure.solution;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

    private List<Figura> figures;

    public FiguresManager() {
        figures = new ArrayList<>();
    }

    public void add(Figura figure) {
        figures.add(figure);
    }

    public double totalArea() {   	
    	Visitor v = new VisitorArea();
    	for (Figura figure : figures) {
            figure.accept(v);
        }
    	return 0;
      
    }

    public double totalNumberOfSides() {
    	Visitor v = new VisitorArea();
        for (Figura figure : figures) {
            figure.accept(v);
        }
        return 0;
    }

}
