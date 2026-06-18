public class Student extends Person {
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;
    protected  int classStatus;

    public Student(String name){
       super(name);
    }

    public String toString(){
        return "Student: " + super.getName();
    }


}
