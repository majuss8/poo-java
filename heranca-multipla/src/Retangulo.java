public class Retangulo extends Quadrilatero{
    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
    }

    @Override
    public double area() {
        return l1*l2;
    }
}
