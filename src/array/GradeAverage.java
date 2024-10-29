package array;

import java.util.Arrays;
import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        /*
        2. Create an integer array that contains 4 school grades (e.g. 2, 1, 4, 6).
        Then calculate the grade average from these grades.
        Note: The formula is: sum of the grades / number of grades
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lessons: ");
        int numberOfLessons = scanner.nextInt();
        double[] grades = new  double[numberOfLessons];
        double sumGrades = 0;

        int i;
        for (i = 0; i < grades.length; i++){
            System.out.print("Enter the grade of lesson number" + (i+1) + ": ");
            grades[i] = scanner.nextDouble();
            sumGrades += grades[i];
        }
        System.out.println("***************");
        System.out.println("Average of " + numberOfLessons + " lessons = " + (sumGrades/numberOfLessons));
    }
}
