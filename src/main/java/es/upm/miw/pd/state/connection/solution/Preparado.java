package es.upm.miw.pd.state.connection.solution;

public class Preparado extends Estado {
	
	private Estados estado;

	public Preparado(){
		this.setEstado(Estados.PREPARADO);	
	}
	
	@Override
	public void abrir(Conexion conexion) {		
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new Cerrado());	
	}

	@Override
	public void enviar(String msg, Conexion conexion) {
		conexion.getLink().enviar(msg);
		conexion.setEstado(new Esperando());
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion conexion) {		
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new Parado());
	}

	@Override
	public String toString() {
		return "PREPARADO";
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

}
