package tasks.with.numbers;
//2.	Even or odd number (if-else and Modulo %) The program should check whether the entered number is even or odd.

import java.util.Scanner;


public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int myNumber;

        System.out.println("Write an int number:");
        myNumber = input.nextInt();

        if (myNumber % 2 == 0){
            System.out.println("***********\n" + myNumber + " is an even number.\n***********");
        } else {
            System.out.println("***********\n" + myNumber + " is an odd number.\n***********");
        }
    }
}