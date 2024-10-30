import java.util.Scanner;

public class FizzBuzz {
    /*
    Task 6: fizzbuzz
    Declare an integer variable upper limit and initialize it with the positive value of your choice. All numbers should
    be run through to the upper limit (from 0 to the number).

    If the number is divisible by 3 and 5, then "fizzbuzz" should be output.
    If the number is only divisible by 3, then only "fizz" should be output.
    If the number is only divisible by 5, then only "buzz" should be output.
    If none of these conditions apply, the number itself should be output
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0){
            System.out.println(number + " is a fizzbuzz (It is divisible by 3 and 5.)");
        } else if ( number % 3 == 0) {
            System.out.println(number + " is a fizz (It is only divisible by 3.)");
        } else if ( number % 5 == 0) {
            System.out.println( number + " is a buzz (It is only divisible by 5.)");
        } else {
            System.out.println(number + " is neither divisible by 3 nor by 5.");
        }
    }
}
