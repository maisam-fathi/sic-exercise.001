package array;

import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        /*
        5. Weekly sales
        The user should be able to enter the daily sales for 7 days (using a scanner), the 7 values should be
        saved in an array. The 7 values should then be added up and the weekly sales should be output.
         */

        double[] dailySales = new double[7];
        double sumSales = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < dailySales.length; i++){
            System.out.print("Enter the seal of " + (i+1) + "day: ");
            dailySales[i] = scanner.nextDouble();
            sumSales += dailySales[i];
        }
        System.out.println("\nThe total sale is equal to " + sumSales + " euros.");
    }
}