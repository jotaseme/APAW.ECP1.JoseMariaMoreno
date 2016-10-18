package es.upm.miw.pd.state.connection.solution;

import es.upm.miw.pd.state.conection.solution.LinkMock;

public class Conexion {
	private Estado estado;

	public Conexion(LinkMock link) {
		this.setEstado(new Parado());
	}

	protected void setEstado(Estado estado) {
		this.estado = estado;
	}

}
