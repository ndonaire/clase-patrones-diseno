package Composite;

public class App {

	public static void main(String[] args) {
		Circulo circulo1 = new Circulo("Verde");
		Cuadrado cuadrado1 = new Cuadrado("Amarillo");
		Pentagono pentagono1 = new Pentagono("Rojo");
		Triangulo triangulo1 = new Triangulo("Azul");
		
		Circulo circulo2 = new Circulo("Violeta");
		Cuadrado cuadrado2 = new Cuadrado("Naranja");
		Pentagono pentagono2 = new Pentagono("Marron");
		Triangulo triangulo2 = new Triangulo("Celeste");
		
		//creo grupo1 
		GrupoFiguras grupo1 = new GrupoFiguras();
		grupo1.agregarFigura(circulo1);
		grupo1.agregarFigura(cuadrado1);
		grupo1.agregarFigura(triangulo1);
		
		System.out.println("Grupo 1 formado");
		System.out.println(grupo1.toString());
		
		grupo1.pintar("Blanco");
		
		System.out.println("Grupo 1 pintado");
		System.out.println(grupo1.toString());
		
		//creo grupo2 
		GrupoFiguras grupo2 = new GrupoFiguras();
		grupo2.agregarFigura(circulo2);
		grupo2.agregarFigura(cuadrado2);
		grupo2.agregarFigura(triangulo2);
		
		System.out.println("Grupo 2 formado");
		System.out.println(grupo2.toString());
		
		grupo2.pintar("Negro");
		
		System.out.println("Grupo 2 pintado");
		System.out.println(grupo2.toString());
		
		//Creo grupo total: grupo 1 + grupo 2 y los pentágonos afuera
		
		GrupoFiguras grupoTotal = new GrupoFiguras();
		grupoTotal.agregarFigura(grupo1);
		grupoTotal.agregarFigura(grupo2);
		grupoTotal.agregarFigura(pentagono1);
		grupoTotal.agregarFigura(pentagono2);
		
		System.out.println("Grupo total formado");
		System.out.println(grupoTotal.toString());
		
		grupoTotal.pintar("Rosa");
		
		System.out.println("Grupo total pintado");
		System.out.println(grupoTotal.toString());
		
		
		//Pintando elementos sueltos
		circulo1.pintar("Dorado");
		System.out.println("Circulo1 dorado:");
		System.out.println(grupoTotal.toString());
		
	}

}
