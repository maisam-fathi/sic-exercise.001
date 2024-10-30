package loop.nestedLoops;

public class ShoppingLists {
    /*
    Task 1: Find the same items in two shopping lists
    Create two arrays shoppingList1 and shoppingList2 of type String, each with 5 items to be
    purchased (e.g. {"milk", "eggs", "bread", "cheese", "apples"} and {"apples", "bananas", "bread", "milk", "juice"}).
    Use a nested for loop to find out which items appear in both shopping lists.
    Print each item that is on both lists to the console.

    Example output:
    Double apples
    Double bread
    Double milk
     */

    public static void main(String[] args) {
        String[] shoppingList1 = {"milk", "eggs", "bread", "cheese", "apples"};
        String[] shoppingList2 = {"apples", "bananas", "bread", "milk", "juice"};

        for (int i = 0; i < shoppingList1.length; i++) {
            for (int k = 0; k < shoppingList2.length; k++) {
                if (shoppingList1[i].equals(shoppingList2[k])) {
                    System.out.println("Double " + shoppingList2[k]);
                }
            }
        }
    }
}