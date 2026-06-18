public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(){
        super("Illegal triangle sides");
    }

    public IllegalTriangleException(String s){
        super(s);
    }



}
