public class AnalizadorFiguras {

	private Figura[] figuras;

	public AnalizadorFiguras(Figura[] figuras) {
		this.figuras = figuras;
	}

	public double calculaTotalPerimetros() {
		double total = 0;
		/*
		for(int i=0; i< figuras.length; i++) {
			total += figuras[i].getPerimetro();
		}
		*/
		// bucle equivalente
		for(Figura f: figuras) {
			total += f.getPerimetro();
		}
		return total;
	}

	public double calculaMediaPerimetros() {
		return this.calculaTotalPerimetros() / figuras.length;
	}

	public double calculaMaximoPerimetros() {
		double max = 0;
		double tmp = 0;
		for(Figura f: figuras) {
			tmp = f.getPerimetro();
			if (tmp > max)
				max = tmp;
		}
		return max;
	}

	public double calculaTotalAreas() {
		double total = 0;
		for(Figura f: figuras) {
			total += f.getArea();
		}
		return total;
	}

	public double calculaMediaAreas() {
		return this.calculaTotalAreas() / figuras.length;
	}

	public double calculaMaximoAreas() {
		double max = 0;
		double tmp = 0;
		for(Figura f: figuras) {
			tmp = f.getArea();
			if (tmp > max)
				max = tmp;
		}
		return max;
	}

}
