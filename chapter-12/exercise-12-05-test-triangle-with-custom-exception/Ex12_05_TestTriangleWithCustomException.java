public class Ex12_05_TestTriangleWithCustomException {
    public static void main(String[] args) throws IllegalTriangleException {
        try {
            TriangleWithException triangle = new TriangleWithException(1, 1, 1000);
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
