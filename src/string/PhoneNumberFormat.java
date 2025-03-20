package string;

import java.util.Scanner;

/*
Write a program that asks the user for a phone number and puts it into a uniform format.
1. The number should only consist of integers, so remove special characters such as dots or hyphens (Note: Character.isDigit())
2. If the number starts with 0, replace the 0 with +49 (number.replace())
3. The number must consist of at least 10 numbers (number.length)

Finally, output the converted number in the console
 */
public class PhoneNumberFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the phone number: "); // (0157)1528-1598  Should replace with +4915715281598
        String poneNumber = scanner.nextLine();
        String onlyNumber = "";

        for(int i = 0; i < poneNumber.length(); i++) {
            char c = poneNumber.charAt(i);
            if (Character.isDigit(c)) {
                onlyNumber += c;
            }
        }

        //Possibility 1
        if (onlyNumber.charAt(0) == '0') {
            onlyNumber = "+49" + onlyNumber.substring(1,12);
        } else {
            onlyNumber = "+" + onlyNumber;
        }

        //Possibility 2
        if (onlyNumber.startsWith("0")) {
            onlyNumber = onlyNumber.replaceFirst("0","+49");
        }

        System.out.println("Phone number with new format: " + onlyNumber);
    }
}
