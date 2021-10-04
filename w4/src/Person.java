public class Person {
    private String name;
    private String address;

    public Person() {}

    /**
     * constructor.
     * @param name is the name of person
     * @param address is the address of person
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //setter, getter
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * to String.
     * @return string
     */
    public String toString() {
        return "Person[name=" + getName() + ",address=" + getAddress() + "]";
    }
}
