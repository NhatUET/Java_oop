import java.util.LinkedHashSet;
import java.util.Set;

public class StudentManagement {
    private final Student[] students = new Student[100];

    /**
     * sameGroup is checked relationship of group.
     * @param s1 is group of student 1.
     * @param s2 is group of student 2.
     * @return
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * addStudent.
     * @param newStudent is new student.
     */
    public void addStudent(Student newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
    }

    /**
     * get students by group.
     * @return students by group.
     */
    public String studentsByGroup() {
        StringBuffer res = new StringBuffer();
        Set<String> gr = new LinkedHashSet<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            } else {
                gr.add(students[i].getGroup());
            }
        }

        for (String element : gr) {
            res.append(element).append("\n");
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    if (students[i].getGroup().equals(element)) {
                        res.append(students[i].getInfo()).append("\n");
                    }
                } else {
                    continue;
                }
            }
        }
        return res.toString();
    }

    /**
     * remove student.
     * @param id is an id.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                for (; i < students.length - 1; i++) {
                    students[i] = students[i + 1];
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
