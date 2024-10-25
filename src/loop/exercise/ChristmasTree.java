package loop.exercise;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        /*
        5. Half a Christmas tree: Write a program that outputs a “Christmas tree” of height h.
        The tree should be represented by asterisks (*)

        Console example:
        How high should your Christmas tree be?
        Input: 5
        *
        **
        ***
        ****
        *****

         */
        Scanner input = new Scanner(System.in);
        int height;
        int wide;

        String star = "*";

        System.out.println("How high should your Christmas tree be?");
        height = input.nextInt();
        System.out.println("How wide should your Christmas tree be?");
        wide = input.nextInt();

        System.out.println("*");

        while (height > 1){
            height--;
            while (wide > 1) {
                star = star + "*";
                System.out.println(star);
                wide--;
            }
        }
        System.out.println("**");
        System.out.println("**");
        System.out.println("**");

        System.out.println("******** Merry christmas ********");
    }
}