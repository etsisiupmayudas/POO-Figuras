public class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Círculo [radio:"+this.radio+", área:"
                +this.getArea()+", perímetro:"+this.getPerimetro()+"]";
    }

/*
    public static void main(String[] args) {
        Circulo c1 = new Circulo(3);
        System.out.println(c1);
    }
*/
}
