package State;

public class MarioGrande implements State {

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
