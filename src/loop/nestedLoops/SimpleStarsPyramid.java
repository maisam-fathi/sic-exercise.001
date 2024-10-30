package loop.nestedLoops;

public class SimpleStarsPyramid {
    /*
    Task 4: Simple pyramid of stars
    Write a program that prints a pyramid of stars (*) with 5 rows. The number of stars per row should be equal to the row number.

    Console output:

    *
    * *
    * * *
    * * * *
    * * * * *

     */
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++){
            for ( int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
