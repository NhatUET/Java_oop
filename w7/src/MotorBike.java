public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * constructor.
     * @param brand loai xe
     * @param registrationNumber bks
     * @param owner csh
     * @param hasSideCar check
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSideCar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSideCar;
    }

    /**
     * get information.
     * @return infor
     */
    @Override
    public String getInfo() {
        return "Motor Bike:\n"
                + "\tBrand: " + super.getBrand() + "\n"
                + "\tModel: " + super.getModel() + "\n"
                + "\tRegistration Number: " + super.getRegistrationNumber() + "\n"
                + "\tHas Side Car: " + isHasSidecar() + "\n"
                + "\tBelongs to " + getOwner().getName() + " - "
                + getOwner().getAddress();
    }

    //setter,getter
    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    public void setHasSidecar(boolean hasSideCar) {
        this.hasSidecar = hasSideCar;
    }


}
