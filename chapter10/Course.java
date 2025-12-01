//public class Course {
//    private String courseName;
//    private String[] students;
//    private int numberOfStudents;
//
//    public Course(String courseName) {
//        this.courseName = courseName;
//        this.numberOfStudents = 0;
//        this.students = new String[this.numberOfStudents];
//    }
//
//    public String getCourseName() {
//        return this.courseName;
//    }
//
//    public void addStudent(String student) {
//        String[] newStudents = new String[++numberOfStudents];
//        for (int i = 0; i < this.students.length; i++) {
//            newStudents[i] = this.students[i];
//        }
//        newStudents[newStudents.length - 1] = student;
//
//        this.students = newStudents;
//    }
//
//    public void dropStudent(String student) {
//        int indexOfStudent = -1;
//        for (int i = 0; i < this.students.length; i++) {
//            if (this.students[i].equals(student)) {
//                indexOfStudent = i;
//                break;
//            }
//        }
//        String[] newStudents = new String[0];
//        if (indexOfStudent != -1) {
//            newStudents = new String[--numberOfStudents];
//        } else {
//            System.out.println("Student " + student + " does not exist");
//            return;
//        }
//
//        int j = 0;
//        for (int i = 0; i < this.students.length; i++) {
//            if (i != indexOfStudent) {
//                newStudents[j++] = this.students[i];
//            }
//        }
//        this.students = newStudents;
//    }
//
//    public String[] getStudents() {
//        String[] copy = new String[this.students.length];
//        for(int i = 0; i < this.students.length; i++){
//            copy[i] = this.students[i];
//        }
//        return copy;
//    }
//
//    public int getNumberOfStudents() {
//        return this.numberOfStudents;
//    }
//
//    public void clear(){
//        this.numberOfStudents = 0;
//        this.students = new String[0];
//    }
//}

