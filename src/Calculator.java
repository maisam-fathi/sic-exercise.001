import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double number1;
        double number2;
        String operator;
        double Result;
        boolean nextCalculation = true;

        Scanner input = new Scanner(System.in);

        while (nextCalculation) {

            System.out.println("*********\n");

            System.out.println("Write first number: ");
            number1 = input.nextDouble();

            System.out.println("Chose a operator between +, - , / and *: ");
            operator = input.next();

            System.out.println("Write second number: ");
            number2 = input.nextDouble();

            if (operator.equals("+")) {
                Result = number1 + number2;
            } else if (operator.equals("-")) {
                Result = number1 - number2;
            } else if (operator.equals("/")) {
                if (number2 != 0) {
                    Result = number1 / number2;
                } else {
                    System.out.println("Divide by 0 is not possible!");
                    continue;
                    //return;
                }
            } else if (operator.equals("*")) {
                Result = number1 * number2;
            } else {
                System.out.println("*********\nError: Input is not correct!");
                continue;
                //return; //Stop the program if user didn't write correct operator.
            }
            System.out.println("*********\nResult -> " + number1 + operator + number2 + " = " + Result);

            System.out.println("Do you like to continue? (No => false | Yes => true)");
            nextCalculation = input.nextBoolean();

            if (!nextCalculation) {
                System.out.println("Tank you for using our calculator!");
            }
        }
    }
}