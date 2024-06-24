import java.util.Scanner;

public final class UserInterface {

    Scanner scanner = new Scanner(System.in);
    private UserInterface(){

    }
    public static void displayOptions(){
        System.out.println("Choose a number between 1-5 to select an operation");
        System.out.println("1. Add item to repository");
        System.out.println("2. Remove item by ID");
        System.out.println("3. Display items");
        System.out.println("4. Select item by category");
        System.out.println("5. Place an order");
    }
    public static void displayExistingCategories(){
        System.out.println("1. Electronics");
        System.out.println("2. Groceries");
        System.out.println("3. Fragile");
    }

    public static void displayItemId(ItemRepository itemRepository){
        itemRepository.getItemRepository().forEach((k,v) -> System.out.println("ID: " + k + " -> " + v.getItemDetails()));
    }
}
