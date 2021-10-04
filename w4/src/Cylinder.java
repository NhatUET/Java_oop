public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {}

    /**
     * constructor 1.
     * @param radius goc tinh theo rad
     */
    public Cylinder(double radius) {
         super(radius);
    }

    /**
     * constructor 2.
     * @param radius goc tinh theo rad
     * @param height chieu cao
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * constructor 3.
     * @param radius goc tinh theo rad
     * @param height chieu cao
     * @param color mau sac
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // setter, getter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * tinh the tich.
     * @return the volume
     */
    public double getVolume() {
        return super.getArea() * getHeight();
    }

    /**
     * to string.
     * @return string
     */
    public String toString() {
        return "Cylinder[" + super.toString() + "," + getHeight() + "]";
    }
}
