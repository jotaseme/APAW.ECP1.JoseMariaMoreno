package es.upm.miw.pd.state.connection.solution;

public class Parado extends State{
	private Estado estado;
	
	public Parado(){
		this.estado = Estado.PARADO;
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
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(new Preparado());		
	}

	@Override
	public void parar(Conexion conexion) {		
	}

	@Override
	public String toString() {
		return "PARADO";
	}

	@Override
	public Estado getEstado() {
		return estado;
	}
}
