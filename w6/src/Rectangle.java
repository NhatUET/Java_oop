public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    public Rectangle() {}

    /**
     * constructor1.
     * @param width cr
     * @param length cd
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * constructor2.
     * @param width cr
     * @param length cd
     * @param color mau
     * @param filled check
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    /**
     * constructor3.
     * @param topLeft toa do
     * @param width cr
     * @param length cd
     * @param color mau
     * @param filled check
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    //setter, getter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Point getTopLeft() {
        return this.topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
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
        return (double) getWidth() * getLength();
    }

    /**
     * get perimeter.
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return (double) 2 * (getWidth() + getLength());
    }

    /**
     * check equals.
     * @param obj object
     * @return true/false
     */
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            return ((Rectangle) obj).topLeft.equals(this.topLeft)
                    && ((Rectangle) obj).length == getLength()
                    && ((Rectangle) obj).width == getWidth();
        }
        return false;
    }

    /**
     * to string.
     * @return string
     */
    public String toString() {
        return "Rectangle[topLeft=" + getTopLeft().toString() + ",width=" + getWidth() + ",length="
                + getLength() + ",color=" + getColor() + ",filled=" + isFilled() + "]";
    }
}
