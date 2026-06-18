public class Employee extends  Person{
    protected String office;
    protected int salary;
    protected MyDate dateHired;


    public Employee(String name){
        super(name);

    }

    @Override
    public String toString() {
        return "Employee: " + getName();
    }


}
