public class Ex12_01_NumberFormatException {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: operand1 operator operand2");
            System.exit(0);
        }
        int operand1 = 0;
        char operator = 0;
        int operand2 = 0;
        try {
            operand1 = Integer.parseInt(args[0].trim());
            operator = args[1].trim().charAt(0);
            operand2 = Integer.parseInt(args[2].trim());

            int result = operation(operator, operand1, operand2);
            System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);

        } catch (NumberFormatException ex) {
            System.out.println("Wrong Input: " + ex.getMessage().replace("For input string: ", "").replace("\"", ""));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static int operation(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+' -> {
                return operand1 + operand2;
            }
            case '-' -> {
                return operand1 - operand2;
            }
            case '*' -> {
                return operand1 * operand2;
            }
            case '/' -> {
                return operand1 / operand2;
            }
            default -> throw new IllegalArgumentException("Unsupported Operator: " + operator);

        }

    }
}
