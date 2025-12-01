public class Listing12_06_TestException {
    public static void main(String[] args) {

        try {
            System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
        }catch (Exception ex){
            ex.printStackTrace();

            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex);
            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] stackTraceElements = ex.getStackTrace();
            for(int i =0; i< stackTraceElements.length;  i++){
                System.out.print("method " + stackTraceElements[i].getMethodName());
                System.out.print("(" + stackTraceElements[i].getClassName() + ":");
                System.out.println(stackTraceElements[i].getLineNumber() + ")");

            }
        }
    }

    private static int sum(int[] integerList) {
        int result = 0;
        for (int i = 0; i <= integerList.length; i++) {
            result += integerList[i];
        }
        return result;
    }
}
