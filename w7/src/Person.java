import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    /**
     * constructor.
     * @param name ten
     * @param address dia chi
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * add vehicle.
     * @param vehicle1 vehicle
     */
    public void addVehicle(Vehicle vehicle1) {
        vehicleList.add(vehicle1);
    }

    /**
     * remove vehicle.
     * @param registrationNumber bks
     */
    public void removeVehicle(String registrationNumber) {
        if (!vehicleList.isEmpty()) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.registrationNumber.equals(registrationNumber)) {
                    vehicleList.remove(vehicle);
                }
            }
        }
    }

    /**
     * get info.
     * @return info
     */
    public String getVehiclesInfo() {
        StringBuilder info = new StringBuilder();
        if (!vehicleList.isEmpty()) {
            info.append(getName()).append(" has:").append("\n\n");
            for (Vehicle vehicle : vehicleList) {
                info.append(vehicle.getInfo()).append("\n");
            }
        } else {
            info.append(getName()).append(" has no vehicle!");
        }
        return info.toString();
    }

    //setter,getter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
