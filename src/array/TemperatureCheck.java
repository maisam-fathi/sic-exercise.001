package array;

import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        /*
        3. Temperature check, but with an array
        Create a double array in which you store the respective temperature for 7 days.
        Then output the temperatures one after the other and always determine whether it
        is a cold day (< 20 degrees) or a warm day (>=20)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many days will be checked? ");
        int numberOfDays = scanner.nextInt();
        double[] temperatures = new double[numberOfDays];

        for (int i = 0; i < temperatures.length ; i++){
            System.out.print("Enter the temperature of " + (i+1) + "day: ");
            temperatures[i] = scanner.nextDouble();

            if (temperatures[i] < 20){
                System.out.println("Day "+ (i + 1) +" of the week the weather is cold");
            }else {
                System.out.println("Day "+ (i + 1) +" of the week the weather is warm");
            }
        }
    }
}
