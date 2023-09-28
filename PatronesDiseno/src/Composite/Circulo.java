package Composite;

public class Circulo extends Figura{

	public Circulo(String color) {
		super(color);
	}

	@Override
	public void pintar(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circulo [color=" + color + "]";
	}
	
}
