public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * constructor.
     * @param brand br
     * @param registrationNumber bien so xe
     * @param owner chu so huu
     * @param numberOfDoors so canh cua
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * get information.
     * @return infor
     */
    @Override
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + super.getBrand() + "\n"
                + "\tModel: " + super.getModel() + "\n"
                + "\tRegistration Number: " + super.getRegistrationNumber() + "\n"
                + "\tNumber of Doors: " + getNumberOfDoors() + "\n"
                + "\tBelongs to " + getOwner().getName() + " - "
                + getOwner().getAddress();
    }

    // setter,getter
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
