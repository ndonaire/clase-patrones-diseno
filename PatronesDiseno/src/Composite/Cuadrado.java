package Composite;

public class Cuadrado extends Figura{

	public Cuadrado(String color) {
		super(color);
	}

	@Override
	public void pintar(String color) {
		this.color = color;		
	}

	@Override
	public String toString() {
		return "Cuadrado [color=" + color + "]";
	}
	
}
