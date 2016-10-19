package es.upm.miw.pd.state.connection.solution;

import es.upm.miw.pd.state.conection.solution.LinkMock;

public class Conexion {
	private State state;
	private LinkMock link;

	public Conexion(LinkMock link) {
		assert link != null;
		this.link = link;
		this.setState(new Cerrado());		
	}

	protected void setState(State state) {
		this.state = state;
	}
	
	protected void setEstado(State state) {
		this.state = state;
	}
	
	public Estado getEstado() {
        return state.getEstado();
    }
	
	public LinkMock getLink() {
		return link;
	}
	
	public void abrir(){
		state.abrir(this);
	}
    
    public void cerrar(){
    	state.cerrar(this);
    }
    
    public void enviar(String msg){
    	state.enviar(msg, this);
    }
    
    public void recibir(int respuesta){
    	state.recibir(respuesta, this);
    }
    
    public void iniciar(){
    	state.iniciar(this);
    }
    
    public void parar(){
    	state.parar(this);
    }
    
    public String toString(){
		return null;
    }
}
