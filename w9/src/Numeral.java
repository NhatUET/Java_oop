public class Numeral extends Expression {
    private double value;

    public Numeral(double value) {
        this.value = value;
    }

    public Numeral() {}

    @Override
    public String toString() {
        return Integer.toString((int) this.value);
    }

    @Override
    public double evaluate() {
        return value;
    }
}
