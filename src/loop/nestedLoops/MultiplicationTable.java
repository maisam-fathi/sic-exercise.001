package loop.nestedLoops;

public class MultiplicationTable {
    /*
    Task 3: Multiplication table
    Write a program that prints a multiplication table from 1 to 10. Use two nested loops: one for the rows (1 to 10) and one for the columns (1 to 10).

    Console output:

    1 2 3 4 5 6 7 8 9 10
    2 4 6 8 10 12 14 16 18 20
    3 6 9 12 15 18 21 24 27 30
    ...
    10 20 30 40 50 60 70 80 90 100
     */
    public static void main(String[] args) {
        int rows = 10;
        int columns = 10;

        for (int i = 1; i <= columns; i++){
            for (int j = 1; j <= rows; j++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
