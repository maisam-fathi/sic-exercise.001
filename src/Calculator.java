import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double number1;
        double number2;
        String operator;
        double Result;

        Scanner input = new Scanner(System.in);

        System.out.println("Write first number: ");
        number1 = input.nextDouble();

        System.out.println("Chose a operator between +, - , / und *: ");
        operator = input.next();

        System.out.println("Write second number: ");
        number2 = input.nextDouble();

        if (operator.equals("+")) {
            Result = number1 + number2;
        }

        else if (operator.equals("-")) {
            Result = number1 - number2;
        }

        else if (operator.equals("/")) {
            Result = number1 / number2;
        }

        else if (operator.equals("*")) {
            Result = number1 * number2;
        }
        else {
            System.out.println("********** \nError: Input is not correct!");
            return; //Stop the program if user didn't write correct operator.
        }
        System.out.println("\n ********** \nResult -> " + number1 + operator + number2 + " = "+ Result);
    }
}