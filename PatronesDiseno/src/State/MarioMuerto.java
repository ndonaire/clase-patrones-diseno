package State;

public class MarioMuerto implements State {

	@Override
	public State RecibirDaño() {
		return new MarioMuerto();
	}

	@Override
	public State ComerHongo() {
		return new MarioMuerto();
	}

	@Override
	public State TomarFlor() {
		return new MarioMuerto();
	}

}
