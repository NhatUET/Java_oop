public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    //setter,getter
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public double getArea() {
        return Math.pow(getRadius(), 2) * PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * getRadius();
    }

    @Override
    public String getInfo() {
        return "Circle[" + getCenter().getInfo() + ",r=" + String.format("%.2f", getRadius()) + "]";
    }
}
