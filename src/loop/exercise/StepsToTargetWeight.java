package loop.exercise;

import java.util.Scanner;

public class StepsToTargetWeight {
    public static void main(String[] args) {
        /*
        2) Steps to target weight

        · Write a program that asks the user for their current weight, their target weight, and weekly weight loss (in kilograms).
        The program should then calculate how many weeks it would take for the user to reach their target weight. Use a for loop
        that displays the current weight each week until the target weight is reached or undershot.

        User inputs:
        · Current weight (must be greater than target weight)
        · Target weight (must be less than current weight)
        · Weekly weight loss (must be greater than 0)

        Output format:
        · The output should display the weight each week, e.g. "Week 1: 78 kg, Week 2: 76 kg..."
        · When the target weight is reached, print "Target weight reached!"

        Console example:
        Enter your current weight:
        Enter: 70
        Enter your goal weight:
        Enter: 60
        Enter your weekly weight loss:
        Enter: 2
        Week 1: 68kg
        Week 2: 66kg
        Week 3: 64kg
        Week 4: 62kg
        Week 5: 60kg
        In week 5, you reached a goal.
         */
        Scanner scanner = new Scanner(System.in);

        double currentWeight;
        double targetWeight;
        double weeklyWeightLoss;

        System.out.print("Enter your current weight: ");
        currentWeight = scanner.nextDouble();

        System.out.print("Enter your goal weight: ");
        targetWeight = scanner.nextDouble();

        System.out.print("Enter your weekly weight loss: ");
        weeklyWeightLoss = scanner.nextDouble();

        if (currentWeight < targetWeight) {
            System.out.println("This program is designed to calculate weight loss. This means that your current weight should be more than your goal weight.");
            return;
            //continue;
        }
        System.out.println();
        System.out.println("In week "+  (( currentWeight - targetWeight)/weeklyWeightLoss )+1 + " , you reached a goal.");
        int weeks;
        for (weeks = 1; currentWeight > targetWeight; weeks++){
            currentWeight -= weeklyWeightLoss;
            System.out.println("Week " + weeks + ": " + Math.round(currentWeight) + " kg");
        }

    }
}

