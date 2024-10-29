package array;

import java.util.Scanner;

public class FavoriteNumbers {
    public static void main(String[] args) {
        /*
        1. Create an integer array that contains your 5 favorite numbers.
        a) Then output the 5 favorite numbers one after the other in the console.
        b) Then output only the number in the 3rd position in your array.
         */

        Scanner scanner = new Scanner(System.in);
        int[] favoriteNumbers = new int[5];

        int i;
        for ( i = 0; i < favoriteNumbers.length ; i++){
            System.out.print("Write your " + (i+1) + " favorite number: ");
            favoriteNumbers[i] = scanner.nextInt();
        }

        // a
        for (int p = 0; p < favoriteNumbers.length ; p++){
            System.out.println("Favorite number " + (p+1) + ": " + favoriteNumbers[p]);
        }

        // b
        System.out.println("\nYour 3rd favorite number is: " + favoriteNumbers[2]);
    }
}