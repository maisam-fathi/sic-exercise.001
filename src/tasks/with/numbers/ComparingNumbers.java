package tasks.with.numbers;
//1.	Comparing numbers (if-else) Write a program that checks whether a number is positive, negative or zero.
import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int myNumber;

        System.out.println("Write an int number:");
        myNumber = input.nextInt();

        if (myNumber > 0) {
            System.out.println(myNumber + " is a positive number.\n***********");
        } else if (myNumber < 0){
                System.out.println(myNumber + " is a negative number.\n***********");
        }
        else {
            System.out.println( myNumber + "The number is zero.\n***********");
        }
    }
}
