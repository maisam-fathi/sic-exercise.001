package loop;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        /*
        . Compound interest calculation over several years (for loop)
        · Write a program that calculates the final amount for a starting capital if it is compounded annually
         at a fixed interest rate. Calculate the amount for a period of years.

        Console example:
        Enter your starting capital in euros:
        Enter: 100
        Enter the interest rate in percent:
        Enter: 5
        Enter your savings period in years:
        Enter: 3
        At the end you have 150 euros (example value only)
         */
        Scanner scanner = new Scanner(System.in);

        double interestRate;
        int investmentPeriod;
        double endCapital;

        System.out.print("Enter your starting capital in euros: ");
        endCapital = scanner.nextDouble();

        System.out.print("Enter the interest rate in percent: ");
        interestRate = scanner.nextDouble();

        System.out.print("Enter your savings period in year(s): ");
        investmentPeriod = scanner.nextInt();

        for (int year = 1; year <= investmentPeriod; year++){
            endCapital += endCapital * (interestRate/100);
            System.out.println("Year " + year + ": \t||\t" + Math.round(endCapital));
        }
        System.out.println("\nIn " + investmentPeriod + " year(s) you have "+ Math.round(endCapital) +" euros.");
    }
}
