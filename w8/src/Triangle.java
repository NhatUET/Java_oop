public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * constructor.
     * @param p1 d1
     * @param p2 d2
     * @param p3 d3
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        Point a = new Point(p1.getPointX() - p2.getPointX(), p1.getPointY() - p2.getPointY());
        Point b = new Point(p1.getPointX() - p3.getPointX(), p1.getPointY() - p3.getPointY());
        if ((a.getPointX() / b.getPointX() == a.getPointY() / b.getPointY())
                || (p1 == p2 || p2 == p3 || p3 == p1)) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    //getter
    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public Point getP3() {
        return this.p3;
    }

    @Override
    public double getArea() {
        return 0.5 * Math.abs((getP2().getPointX() - getP1().getPointX())
                * (getP3().getPointY() - getP1().getPointY())
                - (getP3().getPointX() - getP1().getPointX())
                * (getP2().getPointY() - getP1().getPointY()));
    }

    @Override
    public double getPerimeter() {
        double a = getP1().distance(getP2());
        double b = getP2().distance(getP3());
        double c = getP3().distance(getP1());
        return a + b + c;
    }

    @Override
    public String getInfo() {
        return "Triangle[" + getP1().getInfo() + "," + getP2().getInfo()
                + "," + getP3().getInfo() + "]";
    }
}
