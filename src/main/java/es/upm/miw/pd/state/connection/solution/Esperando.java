package es.upm.miw.pd.state.connection.solution;

public class Esperando extends State {
	
	private Estado estado;

	public Esperando(){
		this.estado = Estado.ESPERANDO;
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
			conexion.setEstado(new Preparado());
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

	@Override
	public Estado getEstado() {
		return estado;
		
	}

}
