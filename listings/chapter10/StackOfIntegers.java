
public class StackOfIntegers {
    private int[] elements;
    private int size;


    public StackOfIntegers() {
        this(16);
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
        this.size = 0;
    }

    public boolean empty() {
        return this.size == 0;
    }

    public int peek() {
        return this.elements[size - 1];
    }

    public void push(int value) {

        if (size >= this.elements.length) {
            int[] helper = new int[elements.length * 2];
            System.arraycopy(elements, 0, helper, 0, elements.length);
            this.elements = helper;
        }
        size++;
        this.elements[size - 1] = value;
    }

    public int pop() {
        int element = this.elements[size - 1];
        this.elements[size - 1] = 0;
        size--;
        return element;
    }

    public int getSize() {
        return this.size;
    }
}
