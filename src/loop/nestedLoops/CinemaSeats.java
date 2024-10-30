package loop.nestedLoops;

import java.util.Scanner;

public class CinemaSeats {
    /*
    Task 5: Occupying cinema seats
    Write a program that displays the seating chart in a cinema. The user enters the number of rows and the number of seats per row. The program then displays the seating chart as "vacant" for each seat.

    Console example:

    Enter the number of rows:
    Enter: 3
    Enter the number of seats per row:
    Enter: 5
    Row 1: vacant, vacant, vacant, vacant
    Row 2: vacant, vacant, vacant, vacant
    Row 3: vacant, vacant, vacant, vacant
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of seats per row: ");
        int column = scanner.nextInt();

        int i;
        int j = 1;
        for (i = 0; i < column; i++){
            System.out.print("Row " + (i+1) + ": ");
            for (j = 0; j < rows; j++){
                System.out.print("vacant, ");
            }
            System.out.println();
        }
    }
}
