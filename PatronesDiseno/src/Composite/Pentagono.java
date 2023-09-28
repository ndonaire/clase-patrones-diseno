package Composite;

public class Pentagono extends Figura{

	public Pentagono(String color) {
		super(color);
	}

	@Override
	public void pintar(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pentagono [color=" + color + "]";
	}

}
