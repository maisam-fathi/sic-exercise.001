/*
4. Ask for favorite color (scanner, if-else)
Write a program that asks the user for their favorite color and outputs a message depending on the answer,
e.g. "Red is a nice color!" or "Blue is great too!".
 */
import java.util.Objects;
import java.util.Scanner;

public class FavoriteColor {

    public static void main(String[] args) {
        String favoriteColor;
        Scanner input = new Scanner(System.in);

        System.out.println("What is your favorite color between blue, red and green)");
        favoriteColor = input.next();

        if (favoriteColor.equalsIgnoreCase("Blue")){
            System.out.println("Sky is blue.");
        } else if (favoriteColor.equalsIgnoreCase("Red")){
            System.out.println("Rose is red.");
        }else if (favoriteColor.equalsIgnoreCase("Green")){
            System.out.println("The grass is green.");
        } else {
            System.out.println("Error. Please Check the color spell.");
        }
    }
}
