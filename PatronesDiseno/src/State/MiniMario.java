package State;

public class MiniMario implements State{

	@Override
	public State RecibirDaño() {
		return new MarioMuerto();
	}

	@Override
	public State ComerHongo() {
		return new MarioGrande();
	}

	@Override
	public State TomarFlor() {
		return new MarioFuego();
	}

}
