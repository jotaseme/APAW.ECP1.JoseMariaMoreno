package es.upm.miw.pd.state.connection.solution;

public class Esperando extends Estado {
	
	private Estados estado;

	public Esperando(){
		this.setEstado(Estados.ESPERANDO);	
	}
	
	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

	@Override
	public void enviar(String msg, Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
		if(respuesta == 0){
			conexion.setEstado(new Parado());
		}else if(respuesta > 0){
			conexion.setEstado(new Cerrado());
		}
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
		return "ESPERANDO";
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

}
