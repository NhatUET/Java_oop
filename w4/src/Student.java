public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * constructor.
     * @param name is the name of person
     * @param address is the address of student
     * @param program is the program
     * @param year is the year
     * @param fee is the fee
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    //setter,getter
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString() {
        return "Student[" + super.toString() + ",program=" + getProgram()
                + ",year=" + getYear() + ",fee=" + getFee() + "]";
    }
}
