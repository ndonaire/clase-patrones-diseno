package State;

public class MarioFuego implements State {

	@Override
	public State RecibirDaño() {
		return new MiniMario();
	}

	@Override
	public State ComerHongo() {
		return null;
	}

	@Override
	public State TomarFlor() {
		return new MarioFuego();
	}

}
