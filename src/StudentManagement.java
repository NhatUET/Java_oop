import java.util.*;

public class StudentManagement {
    private final ArrayList<Student> students = new ArrayList<>();

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public String studentsByGroup() {
        StringBuffer sBG = new StringBuffer();
        Set<String> sortGroup = new LinkedHashSet<>();
        for (int i = 0; i < students.size(); i++) {
            sortGroup.add(students.get(i).getGroup());
        }
        for (String elements : sortGroup) {
            sBG.append(elements);
            sBG.append("\n");
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getGroup().equals(elements)) {
                    sBG.append(students.get(i).getInfo());
                    sBG.append("\n");
                }
            }
        }
        return sBG.toString();
    }

    public void removeStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID().equals(id)) {
                students.remove(students.get(i));
            }
        }
    }

    public static void main(String[] args) {


    }

}

