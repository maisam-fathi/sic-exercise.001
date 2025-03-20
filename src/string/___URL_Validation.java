package string;

import java.util.Scanner;

/*
Task 3: URL validation and formatting

Description:
Write a program that asks the user for a URL and checks it for correctness and puts it into a consistent format.

Requirements:

Checking the URL protocol:
Check if the URL starts with http:// or https://. If neither is present, add https:// as the default protocol (hint: startsWith())

Removing spaces:
Remove all spaces in the URL, as URLs cannot contain spaces (hint: replace(" ", "")).

Checking the domain and top-level domain (TLD):
Make sure the URL contains at least one domain (e.g. example) and one TLD (e.g. .com).
The TLD should be at least two characters long (e.g., .de, .org), which you can check with substring() and lastIndexOf(".").

Formatted output:
Print the cleaned and formatted URL to the console.
 */
public class ___URL_Validation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String clearUrl = "";
        System.out.print("Enter URL: ");
        String url = scanner.nextLine();

        if (!url.startsWith("https://") && !url.startsWith("http://")) {
            clearUrl = "https://" + url;
        }
        if (url.contains(" ")){
            clearUrl = clearUrl.replace(" ","");
        }

        String[] splitUrl = clearUrl.split("\\.");

        if (splitUrl.length < 2 || splitUrl[2].length() < 2) {
            System.out.println("URL is not correct");
        } else {
            System.out.println(clearUrl);
        }


    }
}
