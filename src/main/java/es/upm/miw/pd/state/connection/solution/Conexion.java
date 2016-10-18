package es.upm.miw.pd.state.connection.solution;

public class Conexion {
	private Estado estado;

	public Conexion() {
		this.setEstado(new Parado());
	}

	protected void setEstado(Estado estado) {
		this.estado = estado;
	}

}
