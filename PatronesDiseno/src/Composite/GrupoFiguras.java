package Composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoFiguras implements FiguraGeometrica{

	List <FiguraGeometrica> componentes = new ArrayList<>();
	
	
	public void agregarFigura(FiguraGeometrica figura) {
		this.componentes.add(figura);
	}
	
	@Override
	public void pintar(String color) {
		for(FiguraGeometrica figura: componentes) {
				figura.pintar(color);
		}
		
	}

	@Override
	public String toString() {
		return "GrupoFiguras [" + componentes + "]";
	}
	

}
