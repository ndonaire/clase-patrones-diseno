package Composite;

public class Triangulo extends Figura{

	public Triangulo(String color) {
		super(color);
	}

	@Override
	public void pintar(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Triangulo [color=" + color + "]";
	}
	
}
