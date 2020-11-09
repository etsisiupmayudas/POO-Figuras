import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {

		Figura[] figuras = {
			new Rectangulo(2.22,3.11), new Rectangulo(3,7),
			new Rectangulo(3,3), new Rectangulo(5,5),
			new Circulo(6), new Circulo(3.8), new Circulo(1.45), new Circulo(2)
		};

		AnalizadorFiguras analizador = new AnalizadorFiguras(figuras);

		System.out.println();
		System.out.println("Resulados del analizador de las figuras");
		System.out.println("---------------------------------------");

		for(Figura f: figuras) {
			System.out.println(f.toString());
		}

		DecimalFormat df = new DecimalFormat("#.0000");

		System.out.println();
		System.out.println("Media perímetros: " + df.format(analizador.calculaMediaPerimetros()));
		System.out.println("Total perímetros: " + df.format(analizador.calculaTotalPerimetros()));
		System.out.println("Maximo perímetros: " + df.format(analizador.calculaMaximoPerimetros()));
		System.out.println("Media áreas: " + df.format(analizador.calculaMediaAreas()));
		System.out.println("Total áreas: " + df.format(analizador.calculaTotalAreas()));
		System.out.println("Maximo áreas: " + df.format(analizador.calculaMaximoAreas()));
		System.out.println();
	}

}
