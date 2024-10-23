import java.util.Scanner;

public class OutputLogic {

    public static void main(String[] args) {
        /*
        What statements result from the following expressions:
        Given the variables a = 5, b = 10 and c = 5.
        1. a == b
        2. a != c
        3. b > a
        4. c >= a
        5. (b - a) == (c + a)
        6. (a * b) == 50
        7. (b / a) == 2
        8. (a + b) > (c * 3)
        9. (a + b / c) == 3
        10. (b + c * a) == 75
        11. (a + c) != b
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Chose a as integer number?");
        int a = input.nextInt();

        System.out.println("Chose b as integer number?");
        int b = input.nextInt();

        System.out.println("Chose c as integer number?");
        int c = input.nextInt();

        //1. a == b
        if (a == b){
            System.out.println("== True: " +  a + " (a) is equal to " + b + " (b)");
        } else{
            System.out.println("== False: " +  a + " (a) is not equal to " + b + " (b)");
        }

        //2. a != c
        if (a != c){
            System.out.println("!= True: " +  a + " (a) is not equal to " + c + " (c)");
        } else{
            System.out.println("!= False: " +  a + " (a) is equal to " + c + " (c)");
        }

        //3. b > a
        if (b > a){
            System.out.println("> True: " +  b + " (b) is granter then " + a + " (a)");
        } else{
            System.out.println("> False: " +  b + " (b) is not granter then " + a + " (a)");
        }

        //4. c >= a
        if (c >= a){
            System.out.println(">= True: " +  c + " (c) is greater or equal to " + a + " (a)");
        } else{
            System.out.println(">= False: " +  c + " (c) is smaller as " + a + " (a)");
        }

        //5. (b - a) == (c + a)
        if ((b - a) == (c + a)){
            System.out.println("== True: " +  (b - a) + " (b - a) is equal to " + (c + a) + " (c + a)");
        } else{
            System.out.println("== False: " +  (b - a) + " (b - a) is not equal to " + (c + a) + " (c + a)");
        }

        //6. (a * b) == 50
        if (a * b == 50){
            System.out.println("== True: " +  (a * b) + " (a * b) is equal to 50");
        } else{
            System.out.println("== False: " +  (a * b) + " (a * b) is not equal to 50");
        }

        //7. (b / a) == 2
        if (b / a == 2){
            System.out.println("== True: " +  (b / a) + " (b / a) is equal to 2");
        } else{
            System.out.println("== False: " +  (b / a) + " (b / a) is not equal to 2");
        }

        //8. (a + b) > (c * 3)
        if ((a + b) > (c * 3)){
            System.out.println("> True: " + (a + b) + " (a + b) is granter than "+ (c * 3) + " (c * 3)");
        } else{
            System.out.println("> False: " + (a + b) + "  (a + b) is not granter than "+ (c * 3) + " (c * 3)");
        }

        //9. (a + b / c) == 3
        if ((a + b / c) == 3){
            System.out.println("== True: " +  (a + b / c) + " (a + b / c) is equal to 3");
        } else{
            System.out.println("== False: " +  (a + b / c) + " (a + b / c) is not equal to 3");
        }

        //10. (b + c * a) == 75
        if ((b + c * a) == 75){
            System.out.println("== True: " +  (b + c * a) + " (b + c * a) is equal to 75");
        } else{
            System.out.println("== False: " +  (b + c * a) + "  (b + c * a) is not equal to 75");
        }

        //11. (a + c) != b
        if ((a + c) != b){
            System.out.println( "!= True: " + (a + c) + " (a + c) is not equal to " + b + " (b)");
        } else{
            System.out.println( "!= False: " + (a + c) + " (a + c) is equal to " + b + " (b)");
        }
    }
}
