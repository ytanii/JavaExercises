public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;


    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Person: " + this.name;
    }
}
