package es.upm.miw.pd.state.connection.solution;

import es.upm.miw.pd.state.connection.solution.Estado;

public class Cerrado extends State{
	
	private Estado estado;

	public Cerrado(){
		this.estado = Estado.CERRADO;
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
		return "CERRADO";
	}

	@Override
	public Estado getEstado(){
		return estado;
	}
}
