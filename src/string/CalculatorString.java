package string;

import java.util.Scanner;

public class CalculatorString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Result = 0;
        boolean nextCalculation = true;

        System.out.println("Enter your calculation: ");
        String calculation = scanner.nextLine();

        String[] splitInput = calculation.split(" ");

        double number1 = Double.parseDouble(splitInput[0]);
        String operator = splitInput[1];
        double number2 = Double.parseDouble(splitInput[2]);

        while (nextCalculation) {

            System.out.println("**********\n");

            if (operator.equals("+")) {
                Result = number1 + number2;
            } else if (operator.equals("-")) {
                Result = number1 - number2;
            } else if (operator.equals("/")) {
                if (number2 != 0) {
                    Result = number1 / number2;
                } else {
                    System.out.println("Divide by 0 is not possible!");
                    continue; //Go back to loop start (while)
                }
            } else if (operator.equals("*")) {
                Result = number1 * number2;
            } else {
                System.out.println("**********\nError: Input is not correct!");
                continue; //Go back to loop start (while)
            }
            System.out.println("**********\nResult -> " + number1 + operator + number2 + " = " + Result);

            System.out.println("Do you like to continue? (No => false | Yes => true)");
            nextCalculation = scanner.nextBoolean();

            if (!nextCalculation) {
                System.out.println("Tank you for using our calculator!");
            }
        }

    }
}
