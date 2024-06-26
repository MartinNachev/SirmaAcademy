import java.util.Scanner;

public final class UserInterface {
    public static void displayOptions(){
        System.out.println("0. Exit");
        System.out.println("1. Add item");
        System.out.println("2. Remove item by id");
        System.out.println("3. display items");
        System.out.println("4. Categorize item");
        System.out.println("5. Place an order");
    }
    public static  void listItemsCategories(){
        System.out.println("1. Electronics");
        System.out.println("2. Grocery");
        System.out.println("3. Fragile");
    }
}
