import java.util.ArrayList;
public class MyStack extends ArrayList<Object>{

    public boolean isEmpty(){
        return super.isEmpty();
    }

    public int getSize(){
        return super.size();
    }

    public Object peek(){
        return super.getLast();
    }

    public Object pop(){
        return super.removeLast();
    }

    public Object push(Object o){
        super.add(o);
        return o;
    }

    @Override
    public String toString(){
        return "stack: " + super.toString();
    }
}
