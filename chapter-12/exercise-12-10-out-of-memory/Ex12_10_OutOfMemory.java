public class Ex12_10_OutOfMemory {
    public static void main(String[] args){
        try {
            int[] list = new int[Integer.MAX_VALUE];
        }catch (OutOfMemoryError err){
            System.out.println("Exceeding memory limit");

        }

    }
}
