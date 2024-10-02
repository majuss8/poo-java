public class Quadrado extends Quadrilatero{
    public Quadrado(double l) {
        super(l, l, l, l);
    }

    @Override
    public double area() {
        return l1*l1;
    }
}
