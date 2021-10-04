public class Circle {
    private double radius = 1.0;
    private String color = "red";
    protected static final double PI = 3.14;

    public Circle() {}

    /**
     * constructor.
     * @param radius la so do goc theo radian
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * constructor 2.
     * @param radius so do goc theo radian
     * @param color mau sac
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //getter, setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * get area.
     * @return area of circle
     */
    public double getArea() {
        return radius * radius * PI;
    }

    /**
     * to string.
     * @return string
     */
    public String toString() {
        return "Circle[" + getRadius() + "," + getColor() + "]";
    }
}
