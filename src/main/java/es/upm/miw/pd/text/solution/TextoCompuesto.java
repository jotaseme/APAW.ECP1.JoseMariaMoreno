package es.upm.miw.pd.text.solution;

import java.util.ArrayList;

public class TextoCompuesto extends TextoContenedor {
	private ArrayList<Texto> texto;
	
	public TextoCompuesto(){
		this.texto = new ArrayList<Texto>();
	}
	
	@Override
	public void delete(Texto texto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Texto componente) {
		// TODO Auto-generated method stub

	}

	@Override
	public String dibujar(boolean mayusculas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCaracter() {
		return false;
	}

}
