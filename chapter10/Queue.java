public class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        this.elements = new int[8];
        this.size = 0;
    }

    public void enqueue(int v) {
        this.size++;
        if (this.size > this.elements.length) {
            int[] newArray = new int[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                newArray[i] = this.elements[i];
            }
            this.elements = newArray;
        }
        this.elements[size - 1] = v;
    }

    public int dequeue() {
        this.size--;
        int helper = this.elements[0];
        int[] newArray = new int[this.elements.length];
        for (int i = 1; i < this.elements.length; i++) {
            newArray[i - 1] = this.elements[i];
        }
        this.elements = newArray;
        return helper;
    }

    public boolean empty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }
}
