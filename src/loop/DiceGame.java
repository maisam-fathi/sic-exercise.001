package loop;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        /*
        4. dice game with 10 rounds
        - Simulate a dice game in which you roll the dice for 10 rounds and output the number rolled in each round. Use the Random class for this.
        Note: We have to work with the Random class:
        Ex: Random random = new Random(); // just like the scanner
        Int number = random.nextInt(4) // here it would output a random number between 0 and 4
        Console example:
        Round 1: You have rolled a 2
        Round 2: You have rolled a 3
        Round 3: You have rolled a 6
         */
        Random random = new Random();

        for (int i = 1; i <= 10; i++ ){
            System.out.println(" Round " + i +": You have rolled a =>\t " + (random.nextInt(6) + 1));
        }
    }
}


