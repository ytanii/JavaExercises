public class BinaryFormatException extends Exception {
    public BinaryFormatException() {
        super("Not a binary number");
    }

    public BinaryFormatException(String s) {
        super(s);
    }
}
