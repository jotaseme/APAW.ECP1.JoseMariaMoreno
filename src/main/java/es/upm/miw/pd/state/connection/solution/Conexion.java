package es.upm.miw.pd.state.connection.solution;

import es.upm.miw.pd.state.conection.solution.LinkMock;
import es.upm.miw.pd.state.connection.solution.Estado;

public class Conexion {
	private Estado estado;
	private LinkMock link;

	public Conexion(LinkMock link) {
		assert link != null;
		this.link = link;
		this.setEstado(new Cerrado());
	}

	protected void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public Estado getEstado() {
        return this.estado;
    }
	
	public LinkMock getLink() {
		return link;
	}
	
	public void abrir(){
		estado.abrir(this);
	}
    
    public void cerrar(){
    	estado.cerrar(this);
    }
    
    public void enviar(String msg){
    	estado.enviar(msg, this);
    }
    
    public void recibir(int respuesta){
    	estado.recibir(respuesta, this);
    }
    
    public void iniciar(){
    	estado.iniciar(this);
    }
    
    public void parar(){
    	estado.parar(this);
    }
    
    public String toString(){
		return null;
    }
}
