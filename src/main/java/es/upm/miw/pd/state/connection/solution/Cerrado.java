package es.upm.miw.pd.state.connection.solution;

public class Cerrado extends Estado{
	
	private Estados estado;

	public Cerrado(){
		this.setEstado(Estados.PARADO);	
	}
	
	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new Preparado());
	}

	@Override
	public void cerrar(Conexion conexion) {		
	}

	@Override
	public void enviar(String msg, Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public String toString() {
		return "Cerrado";
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

}
