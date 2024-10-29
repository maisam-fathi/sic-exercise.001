package loop;

public class Counter2 {
    public static void main(String[] args) {
        /*
        2. use a FOR loop to output the numbers from 1 to 100. Write the word “tens!” after all numbers of 10 (10, 20, 30, etc.).
        Note: Modulo necessary, as we are looking for numbers divisible by 10
         */
        for (int i = 1; i <= 100; i++){
            if (i % 10 == 0){
                System.out.println(i + " tens!,");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
