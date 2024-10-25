package loop.exercise;

import java.util.Scanner;

public class ATM_Simulation {
    public static void main(String[] args) {
        /*
        10. ATM simulation
            · Write a program that simulates an ATM. The user can repeatedly withdraw an amount
            until the account is empty (account balance = 0). The initial account balance is e.g. 100 euros.
            Console example:
            Your account balance is 100 euros.
            Enter the amount you want to withdraw in EUR:
            Enter: 20
            You have withdrawn 20 euros. Your new account balance is 80 euros.
            ------------------------------------------------
            Enter the amount you want to withdraw in EUR:
            Enter: 90
            Your account balance is insufficient. You only have 80 euros in the account.
         */
        double accountBalance = 100;
        double withdrawAmount ;

        Scanner input =  new Scanner(System.in);

        System.out.println("Your account balance is " + accountBalance +" euros.");


    }
}
