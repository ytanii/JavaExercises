import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void addStudent(String student) {
        this.students.add(student);
    }

    public void dropStudent(String student) {
        this.students.remove(student);

    }

    public ArrayList<String> getStudents() {
        return new ArrayList<>(this.students);
    }

    public int getNumberOfStudents() {
        return this.students.size();
    }

    public void clear() {
        this.students.clear();
    }
}
