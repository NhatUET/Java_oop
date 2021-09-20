

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    // constructor
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
    // set, getter
    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String Group) {
        this.group = Group;
    }

    public String getID() {
        return id;
    }

    public void setId(String ID) {
        this.id = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    // get information of student
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

}

