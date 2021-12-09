public class Subtraction extends BinaryExpression {
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + super.left.toString() + " - " + super.right.toString() + ")";
    }

    @Override
    public double evaluate() {
        return super.left.evaluate() - super.right.evaluate();
    }
}
