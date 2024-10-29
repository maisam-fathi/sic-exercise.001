package loop;

import java.util.Scanner;

public class ___CalculateParkingFees {
    public static void main(String[] args) {
        /*
        Task 5: Calculate parking fees
        Write a program that calculates parking fees for several vehicles. Parking is free for the first 2 hours. After that, each
        additional hour costs 5 euros. The user enters the number of hours for each vehicle and the program calculates the parking
        fees accordingly.

        Console example:
        Enter the number of vehicles:
        Enter: 3
        Enter the hours for vehicle 1:
        Enter: 1
        Vehicle 1: Fees = 0 EUR
        Enter the hours for vehicle 2:
        Enter: 3
        Vehicle 2: Fees = 5 EUR
        Enter the hours for vehicle 3:
        Enter: 5
        Vehicle 3: Fees = 15 EUR
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of cars: ");
        int numberOfCars = scanner.nextInt();

        for (int car = 1; car <= numberOfCars; car++){
            System.out.print("Enter the car number"+  car + " parking time: ");
            int time = scanner.nextInt();

            double money = 0;
            if (time <= 0){
                System.out.println("Minimum one car!");
                car--;
                //cantinue;
                return;

            } else if (time > 2) {
                double moneyPerHour = 5;
                System.out.println("Car" + car + ": " + moneyPerHour * (time - 2));
            }
            System.out.println("Car " + car + ": " + money + ": Euro");
        }
    }
}
