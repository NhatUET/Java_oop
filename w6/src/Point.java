public class Point {
    private double pointX;
    private double pointY;

    /**
     * constructor.
     * @param pointX x
     * @param pointY y
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return this.pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return this.pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow(pointX - other.pointX, 2) + Math.pow(pointY - other.pointY, 2));
    }

    /**
     * equals.
     * @param other obj
     * @return true/false
     */
    public boolean equals(Object other) {
        if (other instanceof Point) {
            return ((Point) other).pointX == pointX && ((Point) other).pointY == pointY;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "(" + getPointX() + "," + getPointY() + ")";
    }

}

