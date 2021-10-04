public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * constructor.
     * @param name is the name of staff
     * @param address is the address of staff
     * @param school is the name of school
     * @param pay is the pay
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    //setter, getter
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return "Staff[" + super.toString() + ",school=" + getSchool() + ",pay=" + getPay() + "]";
    }
}
