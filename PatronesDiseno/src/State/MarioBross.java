package State;

public class MarioBross {
	
	private State estado;

	public MarioBross(State estado) {
		super();
		this.estado = new MiniMario();
	}

	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}
}
