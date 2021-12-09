public class ExpressionTest {
    /**
     * main.
     * @param args doi so dong lenh
     */
    public static void main(String[] args) {
        Expression mu = new Square(new Numeral(10));
        Expression cong = new Addition(mu, new Numeral(-3));
        Expression nhan = new Multiplication(new Numeral(5), new Numeral(-3));
        Expression mu2 = new Square((new Addition(cong, nhan)));
        System.out.println(mu2.toString());
    }
}
