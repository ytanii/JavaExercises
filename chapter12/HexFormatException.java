public class HexFormatException extends Exception {

    public HexFormatException(){
        super("Not a hex number");
    }

    public HexFormatException(String s){
        super(s);
    }
}
