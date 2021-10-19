public class Point {
    private double pointX;
    private double pointY;

    /**
     * constructor point.
     * @param pointX x
     * @param pointY y
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    //setter, getter
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

    /**
     * get distance from other to this.
     * @param other other point
     * @return distance
     */
    public double distance(Point other) {
        return Math.sqrt(Math.pow(getPointX() - other.getPointX(), 2)
                + Math.pow(getPointY() - other.getPointY(), 2));
    }

    public String getInfo() {
        return "(" + String.format("%.2f", getPointX())
                + "," + String.format("%.2f", getPointY()) + ")";
    }
}
