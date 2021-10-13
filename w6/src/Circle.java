public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle() {}

    /**
     * constructor1.
     * @param radius goc
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * constructor3.
     * @param radius goc
     * @param color mau
     * @param filled check
     */
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    /**
     * constructor4.
     * @param center toa do
     * @param radius goc
     * @param color mau
     * @param filled check
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        this.center = center;
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    //setter, getter
    public double getRadius() {
        return radius;
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

    /**
     * check equals.
     * @param obj obj
     * @return true/false
     */
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            return ((Circle) obj).radius == getRadius()
                    && ((Circle) obj).center.equals(getCenter());
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    /**
     * get area.
     * @return area
     */
    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    /**
     * get perimeter.
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    /**
     * to string.
     * @return string
     */
    public String toString() {
        return "Circle[center=" + getCenter().toString() + ",radius="
                + getRadius() + ",color=" + getColor()
                + ",filled=" + isFilled() + "]";
    }
}
