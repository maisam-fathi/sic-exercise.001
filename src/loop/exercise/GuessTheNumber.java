package loop.exercise;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        /*
        3. Guess the number
        · Write a program that asks the user to guess a number. The program gives clues as to
        whether the number is too big or too small and runs until the user guesses the correct number.
         */
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = 99;
        int correctNumber = random.nextInt(10);
        System.out.println("I have stored a one-digit number in my memory.");
        while (number != correctNumber){
            System.out.println("Guess this number:");
            number = input.nextInt();
            if (number > correctNumber){
                System.out.println("The number in my memory is smaller than " + number + ".");
            } else if (number < correctNumber){
                System.out.println("The number in my memory is bigger than " + number + ".");
            } else {
                System.out.println("You guessed right. The number " + correctNumber + " is correct ;).");
                //return;
            }
        }
    }
}
