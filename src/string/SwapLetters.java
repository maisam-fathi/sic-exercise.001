package string;

import java.util.Scanner;

public class SwapLetters {
  /*
    2. Swap Y and Z
    Task:
    Write a code that outputs a given string, but outputs the letter `y` as `z`, `z` as `y`, `Y` as `Z` and `Z` as `Y`. Try to implement
    two variants, one with `if-else` and one with `switch-case`.

    Console output example:
    Input: "yootaxz"
    Output: "zootaxy"
    Input: "Yanthoxzl"
    Output: "Zanthoxyl"
   */
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      StringBuilder replaceText = new StringBuilder();

      System.out.print("Write your text: ");
      StringBuilder text = new StringBuilder(scanner.nextLine());

      String[] letters = new String[text.length()];

      for (int i = 0; i < text.length(); i++){
          letters[i] = String.valueOf(text.charAt(i));
      }
      for (int i = 0; i < text.length(); i++){
          if (letters[i].equals("y")){
              letters[i] = "z";
          } else if (letters[i].equals("z")) {
              letters[i] = "y";
          } else if (letters[i].equals("Y")) {
              letters[i] = "Z";
          } else if (letters[i].equals("X")) {
              letters[i] = "Z";
          }
      }
      for (int i = 0; i < text.length(); i++){
          replaceText.append(letters[i]);
      }
      System.out.println(replaceText);

      for (int i = 0; i < text.length(); i++){
          replaceText.append(letters[i]);
      }
  }
}
