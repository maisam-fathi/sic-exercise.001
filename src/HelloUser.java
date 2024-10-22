/*
2. Benutzer begrüßen (System.out.println, Scanner)
Schreibe ein Programm, das den Benutzer nach seinem Namen fragt und ihn
dann mit seinem Namen begrüßt, z.B. „Hallo, [Name]!“.
Tipp: Benutze als Variablentyp den String, Einlesen mit scanner.next().
String beispiel = scanner.next();
 */

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String Name = scanner.nextLine();
        System.out.println("Hello " + Name + ".");
    }
}
