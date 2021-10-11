public class Square extends Rectangle {
    /**
     * constructor.
     */
    public Square() {}

    /**
     * constructor1.
     * @param side value
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * constructor2.
     * @param side value
     * @param color mau
     * @param filled check
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft,side, side, color, filled);
    }
    // setter, getter
    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * to string.
     * @return string
     */
    public String toString() {
        return "Square[topleft="+ super.getTopLeft().toString() +"side=" + getSide()
                + ",color=" + super.getColor() + "," + "filled=" + isFilled() + "]";
    }
}
