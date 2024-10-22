/*
Write a program that calculates the BMI (body mass index).
The user is asked to enter their height and weight. From this, the BMI should then be calculated with the following formula: Weight / (Height * Height)

Values between 20-25 are normal weight, under 20 is underweight, over 25 is overweight.

The console should then look like this, for example:

Hello, how tall are you in m?
Input: 1.95
What is your weight in kg?
Input: 61
Your BMI value is: 16.03
You're underweight!
 */
import java.util.Scanner;

public class BMI_Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result;

        System.out.println("Hello, how tall are you in m?");
        int height = input.nextInt();

        System.out.println("What is your weight in kg?");
        double weight = Double.parseDouble(input.next());

        double BIM_Check = weight / (height * height);

        if (BIM_Check < 20){
            result = "underweight";
        } else if (BIM_Check > 25) {
            result = "overweight";
        } else {
            result = "normal weight";
        }
        System.out.println("You're " + result + "!");
    }
}
