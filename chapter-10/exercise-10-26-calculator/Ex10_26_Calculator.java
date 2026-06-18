public class Ex10_26_Calculator {
    public static void main(String[] args) {
        String operand1Str = "";
        String operand2Str = "";
        char operator = ' ';

        if (args.length == 3) {

            operand1Str = args[0].trim();
            operator = args[1].trim().charAt(0);
            operand2Str = args[2].trim();

        } else if (args.length == 1) {

            String str = args[0].replaceAll("\\s+", "");
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '+' || c == '-' || c == '*' || c == '/') {
                    operator = c;
                    operand1Str = str.substring(0, i);
                    operand2Str = str.substring(i + 1);
                    break;
                }

            }
            if (operator == ' ') {
                System.out.println("no operator found.");
                return;

            }
        } else {
            System.out.println("failed");
            return;
        }

        int operand1 = Integer.parseInt(operand1Str);
        int operand2 = Integer.parseInt(operand2Str);
        int result = 0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Unknown operator");
                return;
        }

        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }
}