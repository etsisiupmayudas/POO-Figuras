public class Rectangulo implements Figura {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * base + 2* altura;
    }

    @Override
    public String toString() {
        return "Rectángulo [base:"+this.base+", altura:"+this.altura+
                ", área:"+this.getArea()+", perímetro:"+this.getPerimetro()+"]";
    }

/*
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2, 4);
        System.out.println(r1);
    }
*/
}
