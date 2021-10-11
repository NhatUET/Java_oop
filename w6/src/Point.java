public class Point {
    private double pointX;
    private double pointY;

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

    public boolean equals(Object other) {
        return this.equals(other);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "(" + getPointX() + "," + getPointY() + ")";
    }

}

