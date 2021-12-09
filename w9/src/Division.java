public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + super.left.toString() + " / " + super.right.toString() + ")";
    }

    @Override
    public double evaluate() throws ArithmeticException {
        if (super.right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        } else {
            return super.left.evaluate() / super.right.evaluate();
        }
    }
}
