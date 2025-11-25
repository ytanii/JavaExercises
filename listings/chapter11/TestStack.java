public class TestStack {
    public static void main(String[] args){
        MyStack stack = new MyStack();


        stack.push(1);

        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);
    }
}
