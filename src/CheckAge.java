/*
Ask and check age (scanner, if-else)
Write a program that asks the user for their age and checks whether they are of legal
age (18 or older). If yes, print "You are of legal age!", otherwise "You are still a minor."
Note: >= 18 or older!!
 */
import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        if (age >= 18){
            System.out.println("You are of legal age!");
        } else {
            System.out.println("You are still a minor.");
        }
    }
}
