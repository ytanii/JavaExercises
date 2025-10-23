public class Listing07_09_Calculator {
    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Enter: number1 , operator, number2");
            System.exit(1);
        }

        if(args[1].equals("+")){
            System.out.println(args[0] + " + " + args[2] + " = " + add(args));
        }else if(args[1].equals("-")){
            System.out.println(args[0] + " - " + args[2] + " = " + subtract(args));
        }else if(args[1].equals("*")) {
            System.out.println(args[0] + " * " + args[2] + " = " + multiply(args));
        } else if(args[1].equals("/")) {
            System.out.println(args[0] + " / " + args[2] + " = " + divide(args));
        }

    }

    public static int add(String[] numbers){
        return Integer.parseInt(numbers[0]) + Integer.valueOf(numbers[2]);

    }

    public static int subtract(String[] numbers){
        return Integer.parseInt(numbers[0]) - Integer.valueOf(numbers[2]);


    }

    public static int multiply(String[] numbers){
        return Integer.parseInt(numbers[0]) * Integer.valueOf(numbers[2]);

    }

    public static int divide(String[] numbers){
        return Integer.parseInt(numbers[0]) / Integer.valueOf(numbers[2]);

    }
}
